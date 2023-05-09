package com.sist.client;

import java.awt.Color;

import javax.swing.*;
import javax.swing.table.*;
import javax.swing.text.Document;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

import com.sist.inter.ChatInterface;
// 750 730
public class ChatPanel extends JPanel implements ChatInterface {
	JTextPane pane;
	JTextField tf;
	JButton b1,b2;
	JTable table; // 접속한 사람들의 목록 MVC // 화면 UI
	DefaultTableModel model; // 테이블의 데이터 관리
	JComboBox<String> box; // 목록이 들어감
	/*
	 *  화면관리/ 데이터관리를 따로하는 프로그램
	 *  -----   ------
	 *    View  Model   ==> 연결 (Controller)
	 *    MVC(Spring) 
	 */
	public ChatPanel()
	{
		//초기화
		pane=new JTextPane();
		pane.setEditable(false);
		JScrollPane js1=new JScrollPane(pane); //스크롤 
		tf=new JTextField();
		box=new JComboBox<String>();
		// red=>알림 //입장 퇴장 알림
		box.addItem("black");
		box.addItem("blue");
		box.addItem("yellow");
		box.addItem("green");
		box.addItem("pink");
		box.addItem("orange");
		box.addItem("cyan");
		//테이블
		String[] col= {"아이디","이름","성별"};
		String[][] row=new String[0][3];
		model=new DefaultTableModel(row,col)
		{
			// 생성자 안에서 처리 => 익명의 클래스 => 상속없이 오버라이딩이 가능
			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
			
		
		};
		table=new JTable(model);
		JScrollPane js2=new JScrollPane(table);
		b1=new JButton("쪽지보내기");
		b2=new JButton("정보보기");
		JPanel p=new JPanel();
		p.add(b1);
		p.add(b2);
		
		// 초기화가 끝나면 '배치'
		setLayout(null);
		js1.setBounds(10, 15, 500, 565);
		tf.setBounds(10, 585, 380, 30);
		box.setBounds(395, 585, 115, 30);
		js2.setBounds(520, 15, 230, 250);
		p.setBounds(520, 270, 230, 35);
		add(js1);
		add(tf);add(box);
		add(js2);
		add(p);
		b1.setEnabled(false);
		b2.setEnabled(false);
		//String[] data= {"hong","홍길동","남자"};
		//model.addRow(data);
		// 이벤트 : (버튼을 클릭)
		// 얘네들이 생성자에 있어야함
	}
	public void initstyle()
	{
		Style blue=pane.addStyle("blue", null);
		StyleConstants.setForeground(blue, Color.blue);
		
		Style yellow=pane.addStyle("yellow", null);
		StyleConstants.setForeground(yellow, Color.yellow);
		
		Style green=pane.addStyle("green", null);
		StyleConstants.setForeground(green, Color.green);
		
		Style pink=pane.addStyle("pink", null);
		StyleConstants.setForeground(pink, Color.pink);
		
		Style cyan=pane.addStyle("cyan", null);
		StyleConstants.setForeground(cyan, Color.cyan); 
		
		Style orange=pane.addStyle("orange", null);
		StyleConstants.setForeground(orange, Color.orange);
	}
	public void append(String msg,String color)
	{
		try
		{
			Document doc=pane.getDocument(); //javax.swing
			doc.insertString(doc.getLength(), msg+"\n", pane.getStyle(color));
		}catch(Exception ex) {}
	}
}