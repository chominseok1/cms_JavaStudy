package com.sist.client;
import java.util.*;
import java.awt.*;
import javax.swing.*;

public class NewsCard extends JPanel{
	JLabel titleLa;
	JTextPane contentTa;
	//JLabel authorLa,dateLa;
	JLabel dateLa;
	public NewsCard()
	{
		setLayout(null);
		titleLa=new JLabel("");
		contentTa=new JTextPane();
		contentTa.setEnabled(false);
		JScrollPane js=new JScrollPane(contentTa);
		//authorLa=new JLabel("");
		dateLa=new JLabel("");
		
		//배치
		titleLa.setBounds(10, 10, 450, 35);
		js.setBounds(10, 50, 750, 100);
		//authorLa.setBounds(10, 155, 360, 35);
		dateLa.setBounds(470, 10, 200, 35);
		
		//추가
		add(titleLa);
		add(js);
		//add(authorLa);
		add(dateLa);
	}
}
