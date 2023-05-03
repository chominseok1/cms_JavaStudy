package com.sist.io2;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.net.*;

public class ㅇㅇ {

	public static void main(String[] args) {
		List<TravelVO> list=new ArrayList<TravelVO>();
		FileOutputStream fos=null; //아웃은 출력 인풋은 읽기
		ObjectOutputStream oos=null;
		try
		{
			fos=new FileOutputStream("C:\\java_datas\\travel.txt");
			oos=new ObjectOutputStream(fos);
			// 사이트 연결
			String[] urls= {
				"https://korean.visitseoul.net/attractions",
				"https://korean.visitseoul.net/nature",
				"https://korean.visitseoul.net/entertainment",
				"https://korean.visitseoul.net/shopping",
				"https://korean.visitseoul.net/restaurants",
				"https://korean.visitseoul.net/hotels",
				"https://korean.visitseoul.net/seoul-stay"
			};
			/*
			 * private int no;
			private String title;
			private String singer;
			private String album;
			private String poster;
			etc//private int idcrement; // 등폭
			etc//private String state; // 유지, 상승, 하강
			private int cno; // 구분자
			private String key; // 동영상
			 */
			int k=1; // 고유번호 no
			for(int i=1;i<=urls.length;i++) //i cno 구분자
			{
				Document doc=Jsoup.connect(urls[i]+i).get();
				Elements title=doc.select("div.article-list-slide span.title"); // 태그 들어가는 위치 table 안에 td 안에 a태그안에 값
				Elements singer=doc.select("div.infor-element-inner span.small-text");
				Elements album=doc.select("table.list-wrap td.info a.albumtitle");
				Elements poster=doc.select("table.list-wrap a.cover img"); //구분자 없으면 td안써도됨
				Elements etc=doc.select("table.list-wrap span.rank"); // 클래스는 .으로 찾고 id면 #으로 찾아야됨
				/*
				 * <a>값</a> => 사이에 있는 값 가져올때 text()
				 * <img src="이미지주소"> /src 속성명 attr()
				 */
			
				for(int j=0;j<title.size();j++)
				{
					System.out.println("고유번호:"+k);
					System.out.println("카테고리번호:"+(i+1));
					System.out.println(title.get(j).text()); //i와 i사이 값
					System.out.println(singer.get(j).text());
					System.out.println(album.get(j).text());
					System.out.println(poster.get(j).attr("src"));
					String ss=etc.get(j).text();
					
					String state="";
					String id="";
					// state
					if(ss.contains("유지"))
					{
						state="유지";
						id="0";
					}
					// id 4상승
					else if(ss.contains("new"))
					{
						state="NEW";
						id="0";
					}
					else
					{
						state=ss.replaceAll("[0-9]", ""); // 숫자전체를 공백으로 state 는 숫자 다 지워라 상승만 남음
						id=ss.replaceAll("[가-힣]", ""); // 한글 전체를 공백으로 4만 남음
					}
					System.out.println("상태:"+state);
					System.out.println("등폭:"+id);
					System.out.println("동영상:");
					System.out.println("=========================");
					TravelVO vo=new TravelVO();
					vo.setNo(k);
					vo.setCno(i+1);
					vo.setTitle(title.get(j).text());
					vo.setTitle(singer.get(j).text());
					vo.setContents(album.get(j).text());
					vo.setPoster(poster.get(j).attr("src"));
					
					list.add(vo);
					k++;
				}
			}
			
			oos.writeObject(list);
			System.out.println("저장완료!!");
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				fos.close();
				oos.close();
			}catch(Exception ex) {}
		}
	}
	public static String youtubeKeyData(String title)
	{
		String key="";
		try
		{
			String url="https://www.youtube.com/results?search_query="+URLEncoder.encode(title,"UTF-8"); // 뒤에 주소 인코딩 %EC%95%84%EC%9D%B4%EB%B8%8C로 바꿔줌
			//https://www.youtube.com/results?search_query=%EC%95%84%EC%9D%B4%EB%B8%8C
			Document doc=Jsoup.connect(url).get();
			String data=doc.toString();
			Pattern p=Pattern.compile("/watch\\?v=[^가-힣]+"); ///watch?v=0m4lzxulFpM\u0026pp=ygUJ7JWE7J2067iM //한글을 제외하고 여러글자가 있다 [^가-힣]
			Matcher m=p.matcher(data); //mathcer data안에 p형식 갖고 있는거
			while(m.find())
			{
				String s=m.group(); // 값 갖고 오는거
				// s=watch?v=0m4lzxulFpM\u0026pp=ygUJ7JWE7J2067iM" =뒤에서 "앞까지 짤라야함
				s=s.substring(s.indexOf("=")+1,s.indexOf("\"")); //=다음부터 "앞까지 짤라라
				key=s;
				break;
			}
			
		}catch(Exception ex) {}
		return key;
	}
	
}
