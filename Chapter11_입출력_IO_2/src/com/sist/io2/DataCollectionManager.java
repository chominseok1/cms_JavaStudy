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
/*
 * <table class="list-wrap">
   
   <tbody> // 데이터 출력하는 위치 
   <tr class="list rank-1" songid="101268096">
    <td class="check"><input type="checkbox" class="select-check" title=" I AM ">
   </td><td class="number">1
       <span class="rank"><span class="rank-none"><span class="hide">유지</span></span></span>
   </td>
    <td><a href="#" class="cover" onclick="fnViewAlbumLayer(83665559); return false;" ontouchend="fnViewAlbumLayer(83665559); return false;"><span class="mask"></span><img onerror="this.src='//image.genie.co.kr/imageg/web/common/blank_68.gif';" src="//image.genie.co.kr/Y/IMAGE/IMG_ALBUM/083/665/559/83665559_1681116738103_1_140x140.JPG/dims/resize/Q_80,0" alt="I AM"></a></td>
    <td class="link"><a href="#" class="btn-basic btn-info" onclick="fnViewSongInfo(101268096); return false;" ontouchend="fnViewSongInfo(101268096); return false;">곡 제목 정보 페이지</a></td>
      <td class="info">
           <a href="#" class="title ellipsis" title="I AM" onclick="fnPlaySong('101268096;','1'); return false;" ontouchend="fnPlaySong('101268096;','1'); return false;">
I AM</a>
            <a href="#" class="artist ellipsis" onclick="fnViewArtist(81271496); return false;" ontouchend="fnViewArtist(81271496); return false;">IVE (아이브)</a>           <div class="toggle-button-box" id="hide-button">
               <button type="button" class="btn artist-etc" onclick="fnRelationArtistList('101268096'); artist_etc_layer._show(this);return false;" ontouchend="fnRelationArtistList('101268096'); artist_etc_layer._show(this);return false;">외</button>
               <dl class="list" id="RelationArtist_101268096">
               </dl>
           </div>
            <i class="bar">|</i>
            <a href="#" class="albumtitle ellipsis" onclick="fnViewAlbumLayer(83665559); return false;" ontouchend="fnViewAlbumLayer(83665559); return false;">I've IVE</a>
        </td>
 */
public class DataCollectionManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<GenieMusicVO> list=new ArrayList<GenieMusicVO>();
		FileOutputStream fos=null; //아웃은 출력 인풋은 읽기
		ObjectOutputStream oos=null;
		try
		{
			fos=new FileOutputStream("c:\\java_datas\\genie_music.txt");
			oos=new ObjectOutputStream(fos);
			// 사이트 연결
			String[] urls= {
				"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230502&genrecode=M0100",
				"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230502&genrecode=M0200",
				"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230502&genrecode=M0300",
				"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230502&genrecode=M0107",
				"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230502&genrecode=M0500",
				"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230502&genrecode=M0600"
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
			for(int i=0;i<urls.length;i++) //i cno 구분자
			{
				Document doc=Jsoup.connect(urls[i]).get();
				Elements title=doc.select("table.list-wrap td.info a.title"); // 태그 들어가는 위치 table 안에 td 안에 a태그안에 값
				Elements singer=doc.select("table.list-wrap td.info a.artist");
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
					GenieMusicVO vo=new GenieMusicVO();
					vo.setNo(k);
					vo.setCno(i+1);
					vo.setTitle(title.get(j).text());
					vo.setSinger(singer.get(j).text());
					vo.setAlbum(album.get(j).text());
					vo.setPoster(poster.get(j).attr("src"));
					vo.setState(state);
					vo.setIdcrement(Integer.parseInt(id));
					vo.setKey(youtubeKeyData(title.get(j).text()));
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
