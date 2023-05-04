package com.sist.mananger;
import java.io.*;
import java.util.*;
public class MusicSystem {
	//데이터 읽기
	private static List<GenieMusicVO> list=new ArrayList<GenieMusicVO>();
	
	static
	{
		// 초기화 브럭
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try
		{
			fis=new FileInputStream("c:\\java_datas\\genie_music.txt");
			ois=new ObjectInputStream(fis); // 객체단위로 값 읽어오기
			list=(List<GenieMusicVO>)ois.readObject();
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
	public List<GenieMusicVO> musicCastegoryData(int cno)
	{
		List<GenieMusicVO> mList=new ArrayList<GenieMusicVO>();
		for(GenieMusicVO vo:list) //장르
		{
			if(vo.getCno()==cno)
			{
				mList.add(vo); 
			}
		}
		return mList;
	}
	public List<GenieMusicVO> musicFindData(String title)
	{
		List<GenieMusicVO> mList=new ArrayList<GenieMusicVO>();
		for(GenieMusicVO vo:list)
		{
			if(vo.getTitle().contains(title))
			{
				mList.add(vo); // 찾기
			}
		}
		return mList;
	}
	public static void main(String[] args) {
		MusicSystem ms=new MusicSystem();
		try
		{
			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("가요(1), POP(2), OST(3), 트롯(4), JAZZ(5), CLASSIC(6):");
			String cno=in.readLine();
			ms.musicCastegoryData(Integer.parseInt(cno));
		}catch(Exception ex) {}
	}
}

