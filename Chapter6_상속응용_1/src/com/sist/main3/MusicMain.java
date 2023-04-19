package com.sist.main3;
import java.util.*;
public class MusicMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("선택(지니(1),멜론(2)):");
		int select=scan.nextInt();
		// 상속 => 클래스를 통합할 수 있다
		/*
		 *  상속
		 *  => 객체생성
		 *  => 상위클래스 = 하위클래스
		 *     ------------------
		 */
		GenieMusicSystem ms=null;
		if(select==1)
			ms=new GenieMusicSystem(); //musicAllData();
		else
			ms=new MelonMusicSystem(); //musicAllData();  따로 주소 갖고 있음 다른메소드를 호출하는
		
		//1. 목록 출력
		Music[] music=ms.musicAllData();
		for(Music m:music)
		{
			System.out.println(m.getRank()+"."+m.getTitle());
		}
	}

}
