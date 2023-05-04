package com.sist.manager;

import java.io.*;

import java.util.*;

import com.sist.manager.TravelVO;

public class TravelSystem {

	//데이터 읽기

	private static List<TravelVO> list=new ArrayList<TravelVO>();

	

	static

	{

		// 초기화 브럭

		FileInputStream fis=null;

		ObjectInputStream ois=null;

		try

		{

			fis=new FileInputStream("c:\\java_datas\\travel.txt");

			ois=new ObjectInputStream(fis); // 객체단위로 값 읽어오기

			list=(List<TravelVO>)ois.readObject();

		}catch(Exception ex)

		{

			ex.printStackTrace();

		}

		finally

		{

			try

			{

				fis.close();

				ois.close();

			}catch(Exception e) {}

		}

	}

	public  List<TravelVO> TCastegoryData(int cno)

	{
		List<TravelVO> tList=new ArrayList<TravelVO>();
		for(TravelVO vo:list)

		{

			if(vo.getCno()==cno)

			{

				tList.add(vo); 

			}

		}
		return tList;

	}
	public List<TravelVO> TFindData(String title)
	{
		List<TravelVO> tList=new ArrayList<TravelVO>();
		for(TravelVO vo:list)
		{
			if(vo.getTitle().contains(title))
			{
				tList.add(vo); // 찾기
			}
		}
		return tList;
	}

	public static void main(String[] args) {

		TravelSystem ts=new TravelSystem();

		try

		{

			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));

			System.out.println("(1page), (2page), (3page), (4page), (5page)");

			//페이지당 60개(명소:8개~호텔 8개 게스트하우스 12개)씩  5페이지 

			String cno=in.readLine();

			ts.TCastegoryData(Integer.parseInt(cno));

		}catch(Exception ex) {}

	}

}