package com.sist.util;
// List의 메소드
/*
 * 	add,remove,set,size,clear
 *  -------------------------- 기본 메소드
 *  containsAll() => 두개의 list에서 중복된 데이터를 모아서 관리
 *  	오라클 => JOIN
 *  retainAll => 두개 list에서 중복된 데이터만 남기기
 *  addAll => 데이터 전체를 복사
 *  subList => 부분적 데이터 복사
 *  -------------- 장바구니, 예매
 *  			  -------- 중복 구매
 */
import java.util.*;

public class 라이브러리_List_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add(3); //0 //Object 리턴
		list.add(5); //1
		list.add(7); //2
		list.add(6); //3
		list.add(9); //4
		list.add(2); //5
		list.add(1); //6
		list.add(4); //7
		// 출력
		for(Object i:list) // Object 받음
		{
			System.out.println(i);
		}
		// 일부만 추가 subList(start,end)
		ArrayList list2=new ArrayList(list.subList(1,4));
		list2.add(10);
		list2.add(11);
		list2.add(12);
		// end-1 => 그래서 index 1번 2번 3번 들어감 5,7,6
		System.out.println("==============");
		for(Object i:list2)
		{
			System.out.println(i);
		}
		// sort
		
		System.out.println("==============");
		Collections.sort(list);
		for(Object i:list)
		{
			System.out.println(i);
		}
		System.out.println("==================");
		//같은 데이터 추출
		System.out.println(list.containsAll(list2)); //boolean 다 같은데이터가 아니여서 false
		// 
		for(Object i:list)
		{
			System.out.println(i);
		}
		System.out.println("==================");
		// 중복된 데이터만 추출 => INTERSECT => 교집합
		System.out.println(list.retainAll(list2)); //합집합 갖고 올떄 중복된 데이터 갖고있는지 list가 갖고있는것중에 list2 겹치냐
		
		for(Object i:list)
		{
			System.out.println(i);
		}
		// addAll
		System.out.println("=================");
		ArrayList list3=new ArrayList();
		list3.addAll(list);
		// 현재 list는 567갖고 있음 list 바뀜 list.retainAll(list2)  
		for(Object i:list3)
		{
			System.out.println(i);
		}
	}

}
