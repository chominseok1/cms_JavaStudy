package com.sist.io;
import java.io.*;
import java.net.*;
public class 입출력_5 {
	/*
	 * URL Connection => url.openConnection()
	 * 		|
	 * ------------------------
	 * |					 |
	 * HttpURLConnection   HttpsURLConnection
	 * 
	 * class A
	 * class B extends A
	 * B b(B) new a(); 
	 * 
	 * int a=(int)10.5;
	 * 
	 * https://www.google.com/search?q=%EC%9E%90%EB%B0%94&oq=%EC%9E%90%EB%B0%94&aqs=chrome..69i57j46i131i199i433i465i512j0i131i433i512j0i3j0i131i433i512j69i60l2j69i61.1009j0j4&sourceid=chrome&ie=UTF-8#bsht=CgVic2hocBIECAQwAQ
	 */
		

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		URL url=new URL("https://www.10000recipe.com/recipe/list.html");
		HttpURLConnection conn=(HttpURLConnection) url.openConnection(); //recipe.com에 접근 (HttpURLConnection)이걸로 형변환 해줘야함 //상위 클래스가 넘ㅇ어와서 형변환
		// 연결이 되었다면
		if(conn!=null)
		{
			// 브라우저 => 1byte씩 전송
			// 1byte => 2byte로 변환 
			// InputStreamReader
			BufferedReader in=new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8")); //conn.getInputStream() 서버로부터 InputStreamReader 2byte로 변환해서 읽기
			while(true)
			{
				String data=in.readLine();
				if(data==null) break;
				System.out.println(data);
			}
			in.close();
			conn.disconnect();
		}
	}

}
