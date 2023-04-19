package com.sist.main5;
import java.util.*;
public class MainClass {
// 객체지향 => 묶는것이다 
	/*
	 *  1. 관련된 데이터를 묶는다
	 *  	배열 / 클래스
	 *  2. 관련된 명령문을 묶는다
	 *  	메소드
	 *  3. 관련된 클래스를 묶는다
	 *  	상속extends / 인터페이스 implements(****)
	 *  	=> 하위클래스에서 기능을 추가하면 => 접근할 수 없다
	 *  -------------------
	 *  4. 상속
	 *     접근지정어
	 *     	=> default , protected , public
	 *     	=> private : 상속은 됨 => 접근이 불가능 
	 *     		금고 => 상속 (키번호) => protected  
	 *     ------
	 *     제어어
	 *     	=> 변수 : 접근지정어 , static , final
	 *     	=> 메소드 : 접근지정어 , static , final, abstract
	 *     	---------------
	 *     	=> 생성자 : 접근지정어만 사용
	 *     ------
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Human h=new Human();
		h.print();
		
		h=new Member();
		h.print(); // h주소를 멤버 주소로 바꿈
		
		h=new Sawon();
		h.print();*/
		Scanner scan=new Scanner(System.in);
		System.out.println("선택(Human(1) Member(2) Sawon(3):");
		int select=scan.nextInt();
		/*if(select==1)
		{
			Human h=new Human();
			h.print();
			h.aaa();
			h.bbb();
		}
		else if(select==2)
		{
			Member m=new Member();
			m.print();
			m.aaa();
			m.bbb();
		}
		else if(select==3)
		{
			Sawon h=new Sawon();
			h.print();
			h.aaa();
			h.bbb();
		}*/
		Human h=null; //print,aaa,bbb
		if(select==1)
			h=new Human();
		else if(select==2)
			h=new Member(); // new로 메소드 바꾸기 근데 추가된 내용은 못가져옴
		else if(select==3)
			{
				h=new Sawon(); //사원에 추가한 ccc는 안나옴
			}
		
		h.print();
		h.aaa();
		h.bbb();
		// 추가
	}

}
