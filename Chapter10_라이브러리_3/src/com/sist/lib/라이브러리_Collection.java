package com.sist.lib;
/*
 * 	컬렉션 프레임워크
 * 	------------
 * 	1. 다수의 데이터를 쉽고 효율적으로 처리할 수 있게 만든 표준화된 클래스의 집합
 * 				  --------------- 자바에서 라이브러리로 지원
 *  2. 데이터 => 수정,삭제,추가,읽기 (자료구조)
 *  3. 배열 => 정적 메모리 할당 (추가가 어렵게..)
 *  	=> 동적 메모리 할당 (추가를 쉽게..)
 *  	  ------------ 추가가 될때마다 자동으로 메모리 추가
 *  4. 컬렉션의 종류
 *  	= 순서가 존재 , 데이터 중복허용
 *  	  List (인터페이스)
 *  		|
 *  	 ArrayList, Vector , LinkedList
 *  	 --------
 *  	= 순서가 없고 데이터 중복을 허용하지 않는다
 *  	  Set (인터페이스)
 *  	   |
 *  	 HashSet , TreeSet(검색)
 *  	 ------- 웹 채팅 < List에서 중복된 데이터 추출
 *  	= 먼저 들어온 데이터를 먼저 출력
 *  	  Queue(FIFO) , Stack(LIFO) => 코테
 *  	  -----------	----------
 *  		순서적으로		 뒤에서 ==> 1차원 배열
 *  		for(int i=0;i<ar.length;i++)
 *  		{
 *  			값 설정
 *  		}  
 * 		 for(int i=0;i<ar.length;i++)
 *  		{
 *  			출력
 *  		}  
 * 		 for(int i=0;i<ar.length;i++)
 *  		{
 *  			값 설정
 *  		}  
 *  	for(int i=arr.length-1;i>=0;i++)
 *  		{
 *  			출력
 *  		}  
 *  	= KEY-VALUE 동시에 저장
 *  	  Map ( 인터페이스)
 *  	   |
 *  	 HashMap, HashTable
 *       -------- HashTable의 단점을 보완
 *       --------------------------------------------
 *       	전체 상속도
 *       	Collection
 *       		|
 *       ---------------------------                          
 *        |            |		   |
 *       List		  Set		 Queue				Map
 *        |			   |
 *   **ArrayList	**HashSet				     **HashMap
 *   LinkedList 	TreeSet						 HashTable
 *    Vector   
 *    	|
 *    Stack(벡터로부터 상속)
 *    ---------------------------------------------------------------
 *    1. List
 *    	중복 데이터를 저장해야 할때 , 저장순서는 인덱스번호를 이용해서 (순차적으로 저장)
 *    	인덱스번호가 항상 0번부터 순차적으로 유지한다
 *     ----------------------------------------
 *     	추가, 삭제 (배열의 단점 => 추가 , 삭제 => 새로운 배열)
 *     	0
 *     	1
 *     	2
 *     	3
 *     	4
 *     	5..
 *     
 *     ----------------------
 *     	0
 *     	1
 *     	2
 *     	3 => 삭제
 *     	4 ==> 3
 *     	5 ==> 4
 *     
 *     => 구현 클래스
 *     	ArrayList
 *     -----------
 *     1. 단방향 포인터(인덱스)를 가지고 있다  , 조회하기 편리하다 (성능이 좋다)
 *     2. 검색이 빠르다 , 데이터 추가시 속도가 빠르다
 *     3. 단점) 수정 , 중간에 추가 , 삭제시에 속도가 느려진다
 *     	  ------------------------- LinkedList
 *     4. 변경, 삭제가 없는 상태에서 주로 사용
 *     	  -------------------------- 데이터베이스 (오라클)
 *     	  데이터베이스가 핵심인 프로그램 => 웹
 *     LinkedList 
 *     ---------
 *     1.양방향 포인터를 가지고 있다
 *     2. 수정, 삭제, 추가가 많은 경우에 주로 사용
 *     3. 단점은 검색 속도가 느리다
 *     
 *     Vector : 유지보수
 *     ------
 *     1. 대용량 데이터 처리 => 채팅, 서버연결
 *     2.				   ---------- 동기
 *     3. 비동기화 보완 => ArrayList
 *     
 *     *** 데이터는 반드시 구분이 되게 만든다 (구분자 : id)
 *     hong1 홍길동 남자 
 *     hong2 홍길동 남자
 *     hong3 홍길동 남자
 *     
 *  2. Set
 *   	순서가없다(인덱스) , 데이터 중복을 허용하지 않는다
 *   	=> 장르별 / 부서별 ...
 *   	=> 데이터베이스 이용 
 *   	   중복없는 데이터 => DISTINCT
 *   	=> HashSet => 속도가 빠르다
 *   	=> TreeSet => 정렬, 검색속도
 *  3. Map
 *  	Key,value 동시에 저장
 *  	구분자 => 찾기
 *  	웹에서 주로 사용 , 클래스 관리 , 도서목록 , 우편번호
 *  	=> HashMap
 *  	   HashTable => HashMap보다 속도가 느리다
 *     Set 클래스 (인터페이스)
 *     -------------------
 *     		Collection
 *     			|
 *     		   Set ---------------- 인터페이스
 *     			|
 *     	------------------
 *     	|				|
 *     HashSet		 TreeSet
 *     -------
 *     1) 순서가 없다 (인덱스가 존재하지 않는다)
 *     2) 데이터 중복을 허용하지 않는다
 *     3) 주요 메소드
 *     	  => 데이터 저장 : add() => Object
 *        => 삭제 : remove(Object)
 *        => 전체 삭제: clear()
 *        => isEmpty() : 빈공간 (데이터 존재여부 확인)
 *        => 저장 갯수 : Size()
 *        => 데이터를 한번에 모아서 관리 : iterator()
 *      => TreeSet : 검색용으로 주로 사용
 *      			 LIKE, REGEXP_LIKE(오라클)
 *      = headSet
 *      = tailSet                
 */
import java.util.*;
public class 라이브러리_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set=new HashSet(); //생성
		set.add("A"); //add(Object o)
		set.add("B");
		set.add("C");
		set.add("D");
		////////////// 중복된 데이터 허용하지 않는다
		set.add("A");
		set.add("B");
		set.add("C");
		//출력
		for(Object obj:set) // 밑에서 형변환
		{
			// for-each구문은 형변환이 안된다
			String s=(String)obj;
			System.out.println(s+" ");
		}
	}

}
