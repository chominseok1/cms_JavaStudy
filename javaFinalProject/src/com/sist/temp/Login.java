package com.sist.temp;
import java.awt.*;
import javax.swing.*;
public class Login extends JFrame{
	JLabel la1,la2,la3; //라벨
	JTextField tf1,tf2;// 입력창
	JRadioButton rb1,rb2;
	JButton b1,b2;
	
	public Login()
	{
		setLayout(null);// 직접 배치
		la1=new JLabel("아이디");
		la2=new JLabel("이름");
		la3=new JLabel("성별");
		
		tf1=new JTextField();
		tf2=new JTextField();
		
		rb1=new JRadioButton("남자");
		rb2=new JRadioButton("여자");
		//라디오버튼을 그룹으로 묶는다
		ButtonGroup bg=new ButtonGroup();
		bg.add(rb1); bg.add(rb2); //라디오 버튼 하나씩 선택
		// 디폴트 하나 선택
		rb1.setSelected(true); //남자버튼 체크
		
		b1=new JButton("로그인");
		b2=new JButton("취소");
		// 메모리할당 초기화 각클래스의 초기화 (생성자)
		// 윈도우에 배치
		la1.setBounds(10, 15, 60, 30);
		tf1.setBounds(80, 15, 150, 30);
		
		la2.setBounds(10, 50, 60, 30);//45보다 커야함
		tf2.setBounds(80, 50, 150, 30);
		
		la3.setBounds(10, 85, 60, 30);
		rb1.setBounds(80, 85, 70, 30);
		rb2.setBounds(155, 85, 70, 30);
		
		JPanel p=new JPanel();
		p.add(b1);
		p.add(b2);
		
		p.setBounds(10, 120, 215, 35);
		
		add(la1); add(tf1); // 한줄로 나오게
		add(la2); add(tf2); // 한줄로 나오게
		add(la3); add(rb1);add(rb2);
		add(p);
		setSize(270, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Login();
	}
}
