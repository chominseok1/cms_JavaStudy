package com.sist.io;
// page 366 Filer Reader / BufferedReader
// 파일읽기
//FileInputStream(1byte) / FileReader (2byte)
// 한글이 포함 ==> 반드시 2byte씩 읽어야 => 한글이 깨지는것을 방지 할 수 있다.
import java.io.*;
public class 입출력_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader reader=null;
		try
		{
			reader=new FileReader("c:\\javaDev\\movie.txt");
			BufferedReader in=new BufferedReader(reader); // 네트워크 통신할때 이용
			// 기본생성자 char[8192] 문자 배열
			// 네트워크 통신시에 많이 이용
			int i=0;// 한글자씩 읽을 때 => read() 이용
			// int read() 매개변수가 int형 => 글자의ASC코드를 읽어온다 (정수)
			// A => read() => 65
			// int read(byte[],int,int) => 읽은 바이트수
			long start=System.currentTimeMillis();
			/*while((i=in.read())!=-1) // -1 읽을 데이터가 없는 경우 (끝까지 읽기) => 전체 데이터 읽은 경우 -1리턴 : EOF
			{
				System.out.print((char)i);
			}*/
			while(true)
			{
				String data=in.readLine(); // 데이터를 한줄씩 읽기 in에있는거 한줄씩 읽기. 
				if(data==null) break;
				System.out.println(data);
				//System.out.println();
			}
			long end=System.currentTimeMillis();
			System.out.println("읽는데 걸린시간:"+(end-start));
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				reader.close();
			}catch(Exception ex) {}
		}
	}

}
