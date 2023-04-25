package com.sist.string;

import java.util.Scanner;

//charAt(0)
// 코테 
// 문자열을 입력해서 좌우대칭인지 확인
// ABBA
public class 라이브러리_String_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("문자를 입력하세요");
		String data="";
		//오류 처리
		while(true)
		{
			System.out.println("문자열 입력:");
			data=scan.next();
			if(data.length()%2!=0)
			{
				System.out.println("문자 갯수가 짝수여야합니다");
				continue;
			}
			System.out.println("data="+data);
			boolean bCheck=true;
			int j=data.length()-1;
			for(int i=0;i<data.length()/2;i++)
			{
				if(data.charAt(i)!=data.charAt(j))
				{
					bCheck=false;
					break;
				}
				j--;
			}
			if(bCheck==true)
			{
				System.out.println(data+"는 좌우대칭s");
			}
			else
			{
				System.out.println(data+"는 좌우대칭아님");
			}
			break;
			
		}
		
		
	}

}
