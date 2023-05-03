package com.sist.io;
// 파일쓰기 
import java.io.*;

public class 입출력_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter out=null;
		//BufferdWriter 속도 빠름
		FileReader in=null;
		//BufferedReader 속도가 빠름
		try
		{
			// 1. 파일 만들기
			File file=new File("c:\\java_datas\\movie.txt");
			if(!file.exists()) // 파일이 존재하지 않는다면
			{
				file.createNewFile(); // 파일을 생성해라
			}
			// 파일 읽기 읽어서
			in=new FileReader("c:\\javaDev\\movie.txt"); // 단점: 한줄씩 못읽음
			out=new FileWriter(file); // in에 있는거 file에 읽어서 쓰기
			//out=new FileWriter("c:\\java_datas\\movie.txt"); 경로를 넣어도 
			// 생성된 파일쓰기 생성된 파일에 쓰기
			int i=0;
			while((i=in.read())!=-1)
			{
				out.write(i);
			}
			System.out.println("파일읽기/쓰기 완료");
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				in.close();
				out.close();
			}catch(Exception ex) {}
		}
	}

}
