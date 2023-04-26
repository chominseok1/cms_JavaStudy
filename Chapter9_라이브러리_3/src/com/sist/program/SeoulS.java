package com.sist.program;
import java.util.*;
import java.io.*;
public class SeoulS {
	private static SeoulLVO[] datas=new SeoulLVO[273];
	private int curpage;
	private int totalpage;
	static
	{
		try
		{
			StringBuffer sb=new StringBuffer();
			int i=0;
			FileReader fr=new FileReader("C:\\javaDev\\seoul_location.txt");
			while((i=fr.read())!=-1)
			{
				sb.append(String.valueOf((char)i));
			}
			fr.close();
			String[] locations=sb.toString().split("\n");
			int k=0;
			for(String s:locations)
			{
				StringTokenizer st=new StringTokenizer(s,"|");
				datas[k]=new SeoulLVO();
				datas[k].setNo(Integer.parseInt(st.nextToken())); //
				datas[k].setName(st.nextToken());
				datas[k].setContent(st.nextToken());
				datas[k].setAddress(st.nextToken());
				k++;
			}
		}catch(Exception ex) {}
	}
	//메뉴
	public int menu()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("========== 메뉴 ========");//
		System.out.println("1. 목록 출력(페이지별)");
		System.out.println("2. 상세보기");
		System.out.println("3. 명소검색");
		System.out.println("4. 주소검색");
		System.out.println("9. 종료");
		System.out.println("========================");
		System.out.print("메뉴 선택:");
		return scan.nextInt();
	}
	//검색 => 이름
	public SeoulLVO[] nameFind(String fd)
	{
		int count=0;
		for(SeoulLVO vo:datas)
		{
			if(vo.getName().contains(fd))
			{
				count++;
			}
		}
		SeoulLVO[] seoul=new SeoulLVO[count];
		int i=0;
		for(SeoulLVO vo: datas)
		{
			if(vo.getName().contains(fd))
			{
				seoul[i]=vo;
				i++;
			}
		}
		return seoul;
		
	}
	public SeoulLVO[] addressFind(String addr)
	{
		int count=0;
		for(SeoulLVO vo:datas)
		{
			if(vo.getAddress().contains(addr))
			{
				count++;
			}
		}
		SeoulLVO[] seoul=new SeoulLVO[count];
		int i=0;
		for(SeoulLVO vo:datas)
		{
			if(vo.getAddress().contains(addr))
			{
				seoul[i]=vo;
				i++;
			}
		}
		return seoul;
	}
	public void process()
	{
		System.out.println("==========ddd======");
		while(true)
		{
			int menu=menu();
			if(menu==9)
			{
				System.out.println("프로그램 종료");
				break;
			}
			else if(menu==3)
			{
				Scanner scan=new Scanner(System.in);
				System.out.println("검색어 입력:");
				String n=scan.next();
				SeoulLVO[] data=nameFind(n);
				System.out.println(n+" 검색은 총"+data.length+"건입니다");
				for(SeoulLVO vo:data)
				{
					System.out.println(vo.getNo()+"."+vo.getName());
				}
			}
			else if(menu==4)
			{
				Scanner scan=new Scanner(System.in);
				System.out.println("주소입력:");
				String adr=scan.next();
				SeoulLVO[] data=addressFind(adr);
				System.out.println(adr+" 검색은 총"+data.length+"건입니다");
				for(SeoulLVO vo:data)
				{
					System.out.println(vo.getNo()+"."+vo.getName());
				}
				
			}
		}
	}
}
