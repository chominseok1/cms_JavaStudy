package com.sist.seoul;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SeoulSystem {
	private static ArrayList list=new ArrayList();
	static
	{
		try
		{
			FileReader fr=new FileReader("c:\\javaDev\\seoul_location.txt");
			int i=0;
			StringBuffer sb=new StringBuffer();
			while((i=fr.read())!=-1)
			{
				sb.append((char)i);
			}
			fr.close();
			String[] locations=sb.toString().split("\n");
			
			for(String m:locations) 
			{
				StringTokenizer st=new StringTokenizer(m,"|");
				SeoulLocationVO vo=new SeoulLocationVO();
				vo.setNo(Integer.parseInt(st.nextToken()));
				vo.setName(st.nextToken());
				vo.setContent(st.nextToken());
				vo.setAddress(st.nextToken());
				list.add(vo); 
			}
		}catch(Exception ex) {}
		// 메뉴 
		
		
	}
	//목록 출력(페이지)
	public ArrayList SeoulList(int page)
	{
		int totalpage=(int)(Math.ceil(list.size()/10.0));
		int startpage=(page-1)*10;
		int endpage=page*10;
		
		if(page==totalpage)
		{
			endpage=list.size();
		}
		ArrayList sList=new ArrayList(list.subList(startpage, endpage));
		return sList;
	}
	public int Seoulmenu()
	{
		
		System.out.println(" 서울 명소 ");
		System.out.println("1.목록:");
		System.out.println("2.상세보기");
		System.out.println("9.종료");
		System.out.println("=============");
		Scanner scan=new Scanner(System.in);
		System.out.println("메뉴선택");
		
		return scan.nextInt();
		
	}
	// 상세보기 
	public SeoulLocationVO seoulDetails(int no)
	{
		return (SeoulLocationVO)list.get(no-1);
	}
	public void process()
	{
		while(true)
		{
			int menu=Seoulmenu();
			if(menu==9)
			{
				System.out.println("프로그램 종료");
				break;
			}
			else if(menu==1)
			{
				Scanner scan=new Scanner(System.in);
				System.out.print("페이지를 입력하세요:");
				int page=scan.nextInt();
				ArrayList sList=SeoulList(page);
				for(int i=0;i<sList.size();i++)
				{
					SeoulLocationVO vo=(SeoulLocationVO)sList.get(i);
					System.out.println(vo.getNo()+"."+vo.getName());
				}
			}
			else if(menu==2)
			{
				Scanner scan=new Scanner(System.in);
				System.out.println("상세볼 명소(1~273");
				int no=scan.nextInt();
				SeoulLocationVO vo=seoulDetails(no);
				System.out.println("======상세보기=====");
				System.out.println("번호:"+vo.getNo());
				System.out.println("이름:"+vo.getName());
				System.out.println("내용:"+vo.getContent());
				System.out.println("주소:"+vo.getAddress());
			}
		}
	}
}
	
