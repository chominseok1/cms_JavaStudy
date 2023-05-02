package com.sist.lib;

/*
 * 	제네릭 (JDK 1.5에 도입)
 * 	=> JDK1.8 (호환성) ==> 17버전, SpringFrame(14버전)
 * 						 -------- Spring-Boot
 * 1) 제네릭이 도입된 이유
 * 	  => 컬렉션(ArrayList,Set,Map) => 데이터형(매개변수,리턴형) => Object
 * 		 반드시 형변환을 시켜서 사용해야하는 단점
 * 		 오류 발생이 많다 => 모든 데이터형을 사용할 수 있다 => 원하지 않는 데이터가 들어올수있다 => 방지하기 위해 제네릭
 * 	  => 데이터형을 통일화 , 데이터형의 안정성 => 데이터 고정
 * 	  => 데이터형을 명시화 => 가독성이 좋다 
 * 		 List<Object> list=new ArrayList<Object>(); => 가독성이 떨어짐
 * 		 	 -------- Object들어가면 생략이 가능 default여서
 * 		 List<String> list=new ArrayList<String>();
 * 			  -------					-------
 * 				|___________일치___________|
 * 		*** 제네릭 안에 기본형은 사용할 수 없다(int...)  ==> 그래서 Wrapper
 * 		=> 데이터형을 모르는 경우 (와일드 카드)
 * 			List<?> list=new ArrayList<String>()
 * 			    --?(String)            ------   ?=String  String이 변경되면 ?도 변경
 * 예)
 * 
 * 		class Box<T> => 임시 클래스 => default (T->Object)
 * 		{
 * 		}
 * 		Box<String> => Object -> String : 매개변수,리턴형을 변경
 * 		<>안에는 라이브러리만 첨부하는 것이 아니고 사용자정의 클래스 첨부가능
 * 		Box<MovieVO>....
 * 
 *  	임시제네릭
 *  	-------
 *  	T => 임시 데이터형 (클래스 => type) => 사용자 정의 제네릭
 *  	E => 임시 데이터형 (클래스 => elements) 요소
 *  		ArrayList<E> , Vector<E> , LinkedList<E>
 *  	K => Key (클래스형)
 *  	V => value (클래스형)
 *  	Map<K,V>
 *  --------------------------------------------------------
 *  Iterator /ListIterator => 데이터를 모아서 관리
 *  ------- hasNext() , next() , remove()
 *  ------- hasNext() , next() , remove() , hasPrevious()
 *  -------- 순서가 없는 경우 주로 사용 Set,Map
 *  ArrayList => for(index를 가지고 있다)
 */
import java.util.*;
public class 정리_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<String> list=new ArrayList<String>();
		// 값을 첨부
		/*list.add("사과");
		list.add("배");
		list.add("수박");
		list.add("딸기");
		list.add("바나나");
		// 일반 출력 => for-each
		for(String f:list)
		{
			System.out.print(f+" ");
		}
		System.out.println();
		System.out.println("============Iterator==========");
		// 출력이 어려운 경우 => 단방향 
		Iterator<String> it=list.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println("\n=======재출력===");
		while(it.hasNext())
		{
			System.out.print(it.next()+" "); //출력이 안됨 한번 출력하고 출력못함
		}*/
		// ListIterator => List에서만 사용이 가능
		//List<?> list=new ArrayList<Integer>();
		//List<String> list1=new ArrayList<String>();
		//list1=new ArrayList<Integer>(); // String으로 list1선언 Integer로 못바꿈
		/*List<?> list=new ArrayList<String>();
		list.clear(); // 지우고 
		list=new ArrayList<Integer>();*/ //와일드카드 ?쓰면 데이터 바꿀수 있음
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		/*for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+" ");
		}
		System.out.println("\n==========");
		for(int i=list.size()-1;i>=0;i--)
		{
			System.out.print(list.get(i)+" ");
		}*/
		ListIterator<Integer> it=list.listIterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println("\n=================");
		while(it.hasPrevious())
		{
			System.out.print(it.previous()+" ");
		}
}
}
