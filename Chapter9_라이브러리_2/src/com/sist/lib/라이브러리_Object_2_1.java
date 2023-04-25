package com.sist.lib;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class 라이브러리_Object_2_1 extends JFrame implements ItemListener{

	JComboBox box;
	JLabel la;
	public 라이브러리_Object_2_1() 
	{
	 box=new JComboBox();
	 box.addItem("홍길동");
	 box.addItem("심청이");
	 box.addItem("박문수");
	 la=new JLabel();
	 
	 //배치
	 add("North",box);
	 add("Center",la);
	 setSize(300, 300);
	 setVisible(true);
	 
	 box.addItemListener(this);
	 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 라이브러리_Object_2_1();
	}
	@Override
	public void itemStateChanged(ItemEvent e) { //선택이 바뀌었을떄
		// TODO Auto-generated method stub
		
		if(e.getSource()==box)
		{
			//String name=String.valueOf(box.getSelectedItem());
			String name=box.getSelectedItem().toString(); //.to string하던가 String으로 형변환 해야한다
			// 리턴형이 거의 Object .to string하던가 String으로 형변환 해야한다 문자열 변환
			// String name=(String)box.getSelectedItem();
			la.setText(name); // 값 출력
		}
		
	}

}
