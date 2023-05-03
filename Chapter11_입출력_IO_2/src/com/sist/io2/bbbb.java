package com.sist.io2;





import java.io.*;

import java.util.ArrayList;

import java.util.List;



import org.jsoup.Jsoup;

import org.jsoup.nodes.Document;

import org.jsoup.select.Elements;







public class bbbb {

	 public static void main(String[] args) {

		List <TravelVO> list = new ArrayList<>();

		FileOutputStream fos = null;

		ObjectOutputStream oos = null;

		try {

			fos= new FileOutputStream("C:\\java_data\\travel.txt");

			oos = new ObjectOutputStream(fos);

			int c =1;

			String[] urls2= {
					"https://korean.visitseoul.net/attractions?curPage=",
					"https://korean.visitseoul.net/nature?curPage=",
					"https://korean.visitseoul.net/entertainment?curPage=",
					"https://korean.visitseoul.net/shopping?curPage=",
					"https://korean.visitseoul.net/restaurants?curPage=",
					"https://korean.visitseoul.net/hotels?curPage=",
					"https://korean.visitseoul.net/seoul-stay?curPage="
				};



				for(int j = 1 ; j <= urls2.length; j++) {

					Document doc = Jsoup.connect(urls2[j]+j).get();

					Elements title = doc.select("div.article-list-slide span.title");	

					Elements contents = doc.select("div.infor-element-inner span.small-text");

					

				//	System.out.println(title.size());

					

					for(int k=0; k<title.size(); k++) {

						System.out.println("고유번호"+c);

						

						System.out.println("카테고리번호:"+(j+1));

						System.out.println(title.get(k).text());

						

						

						TravelVO vo = new TravelVO();

						vo.setNo(c);

						vo.setCno(k);

						vo.setTitle(title.get(k).text());

						

						

						list.add(vo);

						c++;

						

						}

					

					

					

				}

				

			

			

			

			

			

		} catch (Exception e) {

			// TODO: handle exception

		}finally {

			try {

				

			} catch (Exception e2) {

				// TODO: handle exception

			}

		}

	}

	 

	 

	 

}