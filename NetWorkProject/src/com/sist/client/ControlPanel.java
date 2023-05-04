package com.sist.client;
import java.awt.CardLayout;
import java.awt.Color;
//화면 분할
import javax.swing.JPanel;
public class ControlPanel extends JPanel {
	NewsPanel np=new NewsPanel();
	ChatPanel cp=new ChatPanel();
	FindPanel fp=new FindPanel();
	LocationPanel lp=new LocationPanel();
	EnterPanel ep=new EnterPanel();
	Acomm ap=new Acomm();
	HomePanel hp=new HomePanel();
	CardLayout card=new CardLayout(); //합쳐놓고 감추는 감춰놨다가 누르면 나오는
	public ControlPanel()
	{
		setLayout(card);
		add("home",hp);
		add("news",np);
		add("chat",cp);
		add("find",fp);
		add("acomm",ap);
		add("location",lp);
		add("enter",ep);
	}
}
