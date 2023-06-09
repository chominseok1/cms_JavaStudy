package com.sist.client;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URI;
import java.net.URL;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.sist.common.ImageChange;
import com.sist.inter.HomeInterface;
import com.sist.manager.TravelVO;

import com.sist.manager.TravelSystem;
import java.awt.event.*;

public class HomePanel extends JPanel implements HomeInterface,MouseListener{
   PosterCard[] pcs=new PosterCard[20];
   JPanel pan=new JPanel();
   JButton b1,b2;
   JLabel pageLa;
   ControlPanel cp;
   TravelSystem ts=new TravelSystem();
   public HomePanel(ControlPanel cp)
   {
	   this.cp=cp;
	   b1=new JButton("이전");
	   b2=new JButton("다음");
	   pageLa=new JLabel("0 page / 0 pages");
	   setLayout(null);
	   pan.setLayout(new GridLayout(4,5,5,5));
	   pan.setBounds(10, 15, 730, 700);
	   add(pan);
	   JPanel p=new JPanel();
	   p.add(b1);
	   p.add(pageLa);
	   p.add(b2);
	   p.setBounds(10, 720, 730, 35);
	   add(p);
   }
   public void cardPrint(List<TravelVO> list)
   {
	   
	   int i=0;
	   for(TravelVO vo:list)
	   {
		   pcs[i]=new PosterCard(vo);
		   pan.add(pcs[i]);
		   i++;
	   }
	   
	   for(int j=0;j<pcs.length;j++)
		{
			pcs[j].addMouseListener(this); //이벤트 등록 //등록을해야함
		}
	   
   }
   public void cardInit(List<TravelVO> list)
   {
	   /*for(int i=0;i<list.size();i++)
	   {
		   pcs[i].poLa.setIcon(null);
		   pcs[i].tLa.setText("");
	   }*/
	   pan.removeAll();// 데이터 제거 
	   pan.validate(); // Panel 재배치
   }
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	//나머지는 구현 얘만 마우스 클릭
	for(int i=0;i<pcs.length;i++)
	{
		if(e.getSource()==pcs[i])
		{
			//JOptionPane.showMessageDialog(this, i+"번째 호출");
			String title=pcs[i].tLa.getText();
			//JOptionPane.showMessageDialog(this, title);
			TravelVO vo=ts.travelDetaliData(title);
			try {
				URL url=new URL(vo.getPoster());
				Image img=ImageChange.getImage(new ImageIcon(url), 530, 350);
				cp.dp.imgLa.setIcon(new ImageIcon(img));
				cp.dp.titleLa.setText(vo.getTitle());
				cp.dp.contentLa.setText(vo.getContents());
				//cp.dp.albumLa.setText(vo.getAlbum());
				//cp.dp.stateLa.setText(vo.getState());
				//cp.dp.crementLa.setText(vo.getIdcrement()==0?"":String.valueOf(vo.getIdcrement()));
				//cp.dp.keyLa.setText(vo.getKey());
				cp.card.show(cp, "detail");
			} catch (Exception ex) {}
			
		}
	}
}
@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
   
	
}
