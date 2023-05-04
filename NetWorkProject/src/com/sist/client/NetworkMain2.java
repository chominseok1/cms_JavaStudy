package com.sist.client;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.sist.common.ImageChange;
public class NetworkMain2 extends JFrame implements ActionListener { //버튼 눌렀을때 처리 ActionListener
	MenuPanel mp;
	ControlPanel cp;
	TopPanel tp;
	JButton b1,b2,b3,b4,b5,b6,b7; // 버튼
	JLabel logo;
	//Login login=new Login();
	public NetworkMain2()
	{
		logo=new JLabel();
		Image img=ImageChange.getImage(new ImageIcon("c:\\javaDev\\logo.png"), 200,130);
		
		logo.setIcon(new ImageIcon(img));
		mp=new MenuPanel(); //메모리 할당
		cp=new ControlPanel();
		tp=new TopPanel();
		
		setLayout(null); // 레이아웃을 쓰지않겠다 Layout없이 직접 배치
		logo.setBounds(10,15,200,130);  // 사진
		mp.setBounds(215, 15, 955, 130);// 목록	 // x축공백 y축공백 가로길이 세로길이 10에서 200까지(3) 
		cp.setBounds(10, 150, 960,635); // 왼쪽창		// 15+50 65 밑으로(75지점) 1,3 2,4 밑에서 +10
		tp.setBounds(980, 150, 200, 635); //오른쪽창		//10+960 지점
		
		b1=new JButton("홈");
		b2=new JButton("장소");
		b3=new JButton("엔터");
		b4=new JButton("숙박");
		b5=new JButton("검색"); //mp에 추가해야 함 메뉴를
		b6=new JButton("뉴스");
		b7=new JButton("채팅");
		mp.setLayout(new GridLayout(1,7,5,5));
		mp.add(b1);
		mp.add(b2);
		mp.add(b3);
		mp.add(b4);
		mp.add(b5);
		mp.add(b6);
		mp.add(b7);
	//	 
		
		//추가
		add(mp);
		add(cp);
		add(tp);
		add(logo);
		
		// 윈도우 크기
		setSize(1200,800);
		setVisible(true);
		//종료
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("======서울여행====");
		// 이벤트 등록
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		
		//login.b1.addActionListener(this); //버튼 눌렀을때 처리메소드가 어딨냐 자신이 갖고있는
		//login.b2.addActionListener(this);
		//채팅
		cp.cp.tf.addActionListener(this);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			//UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
			//UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel"); //맥모양
			UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
			//UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
			///////////UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");////////////////////
			//UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
			//UIManager.setLookAndFeel("com.jtattoo.plaf.fast.FastLookAndFeel");
			//UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
			
		}catch(Exception ex) {}
		new NetworkMain2();
		
	} // 양쪽 사이드 고정 가운데만 바꾸기 가운데 화면디자인
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) //1번눌렀을때 나오는
		{
			cp.card.show(cp, "home"); //이름 부여 
		}
		else if(e.getSource()==b2)
		{
			cp.card.show(cp, "location"); //이름 부여
		}
		else if(e.getSource()==b3)
		{
			cp.card.show(cp, "enter"); //이름 부여
		}
		else if(e.getSource()==b4)
		{
			cp.card.show(cp, "acomm"); //이름 부여
		}
		else if(e.getSource()==b5)
		{
			cp.card.show(cp, "find"); //이름 부여
		}
		else if(e.getSource()==b6)
		{
			cp.card.show(cp, "news"); //이름 부여
		}
		else if(e.getSource()==b7)
		{
			cp.card.show(cp, "chat"); //이름 부여
		}
		/*else if(e.getSource()==login.b1)
		{
			login.setVisible(false); //로그인 창 사라짐
			setVisible(true); // 메인창 띄우겠다
		}
		else if(e.getSource()==login.b2)
		{
			System.exit(0); //프로그램 종료
		}*/
		else if(e.getSource()==cp.cp.tf)
		{
			cp.cp.initstyle();
			String msg=cp.cp.tf.getText();
			String color=cp.cp.box.getSelectedItem().toString();
			if(msg.length()<1) return;
			
			cp.cp.append(msg, color);
			
			cp.cp.tf.setText(""); // 문자쓰고 공백 주기
		}
		
	}

}
