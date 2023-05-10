package com.sist.client;
import java.awt.CardLayout;
import java.awt.Color;
//화면 분할
import javax.swing.JPanel;

import com.sist.client.BoardListPanel;
import com.sist.client.BoardDetailPanel;
//import com.sist.client.BoardInsertPanel;
public class ControlPanel extends JPanel {
	NewsPanel np=new NewsPanel();
	ChatPanel cp=new ChatPanel();
	FindPanel fp=new FindPanel();
	LocationPanel lp=new LocationPanel();
	EnterPanel ep=new EnterPanel();
	BoardListPanel bp;
	HomePanel hp;
	DetailPanel dp; 
	BoardInsertPanel ip;
	BoardDetailPanel bdp;
	CardLayout card=new CardLayout(); //합쳐놓고 감추는 감춰놨다가 누르면 나오는
	public ControlPanel()
	{
		hp=new HomePanel(this);
		dp=new DetailPanel(this);
		bp=new BoardListPanel(this);
		ip=new BoardInsertPanel(this);
		bdp=new BoardDetailPanel(this);
		setLayout(card);
		add("home",hp);
		add("news",np);
		add("chat",cp);
		add("find",fp);
		add("board",bp);
		add("location",lp);
		add("enter",ep);
		add("detail",dp);
		add("insert",ip);
		add("bdp",bdp);
	}
}
