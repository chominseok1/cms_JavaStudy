package com.sist.temp;
import java.awt.CardLayout;
import java.awt.Color;
//화면 분할
import javax.swing.JPanel;
public class ControlPanel extends JPanel {
	NewsPanel np=new NewsPanel();
	ChatPanel cp=new ChatPanel();
	FindPanel fp=new FindPanel();
	RecommandPanel rp=new RecommandPanel();
	HomePanel hp;
	DetailPanel dp; //->메모리할당 						//cp가 있어야 오류안남 
	CardLayout card=new CardLayout(); //합쳐놓고 감추는 감춰놨다가 누르면 나오는
	// 화면이동
	public ControlPanel()
	{
		hp=new HomePanel(this);
		dp=new DetailPanel(this); //->메모리할당
		setLayout(card);
		add("home",hp);
		// @RequestMapping("main/main.do")
		add("news",np);
		add("chat",cp);
		add("find",fp);
		add("recomm",rp);
		add("detail",dp);
	}
}
