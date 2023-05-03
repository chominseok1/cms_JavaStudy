package com.sist.io;
// BufferedReader/ BufferedWriter => 필터 스트림

import java.io.*;
public class 입출력_4 {

	public static void main(String[] args) throws Exception{ // 예외 떠맡기기
		// TODO Auto-generated method stub
		FileWriter out=new FileWriter("c:\\java_datas\\movie_1.txt"); // 생성하고  ('기반스트림' 단독으로 생성가능)
		// 자동으로 지정된 파일을 생성, FileWriter는 file을 없으면 만들고 file이 이미 존재하면 덮어씀.
		// Create
		// 추가기능 (밑에다 쓰려면/뒤에붙이려면) FileReader in=new FileReader("c:\\javaDev\\movie.txt",true); true를 써야 됨 
		// Append
		FileReader in=new FileReader("c:\\javaDev\\movie.txt"); // 생성하고
		// 기반 스트림
		BufferedReader br=new BufferedReader(in); //넣어야함 (필터 스트림 생성자 인자를 전달 해야한다)
		BufferedWriter bw=new BufferedWriter(out); // 넣어야함
		while(true)
		{
			String data=br.readLine(); // 데이터를 한줄씩 읽기 br에있는거 한줄씩 읽기.
			if(data==null) break;
			bw.write(data+"\n"); // 한줄씩 들어가게 \n br에 읽은거 쓰기
			
			
		}
		System.out.println("읽기/쓰기 완료");
		in.close();
		out.close();
	}

}
