package com.sist.lang;
/*
 * 	Wrapper : 전체를 감싼다
 *  ------- CSS (container)
 *  프로그램 개발 => 기본형 데이터형을 객체단위로 저장할 때
 *  
 *  List<int> => 오류
 *  	----- 클래스형이 필요함
 *  List<Integer>
 *  =>   -------- 기본형을 클래스화 해서 사용
 *  			  ------------ Wrapper
 *  
 *  	 기본형          클래스형     => 기본형에 기능을 추가해서 클래스화 시키는 것을 (Wrapper)
 *  	 int		  Integer
 *  	 long		  Long
 *  	 byte		  Byte
 *  	 double		  Double
 *  	 boolean	  Boolean
 *  ------------------------------------------------***
 *   끌레망꾸꾸 4.3
 *   ------- ---
 *   String	  double ==> String (웹 => 문자열)
 *   String score=(String)4.3; 형변환 안됨 => 오류
 *   double Score=(double)"4.3"; 형변환 안됨 => 오류
 *   그래서 Wrapper 제공 
 * 
 */
public class 라이브러리_Wrapper_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="4.3";
		double d=Double.parseDouble(s); //Double.parseDouble() Integer.parseInt()
		
		// 사용처 => 문자열을 원하는 데이터형으로 변경할때 주로 사용
		// => 클라이언트에 배포 => 윈도우 / 브라우저 / 핸드폰 
		// ============> 모든 데이터형 문자열 => 기본형 데이터로 변경
		// 클래스명 : 객체단위로 저장 (List<클래스형>)
		// 문자열 => 해당 데이터형으로 변환 ==> parse ex) double d=Double.parseDouble(s);
		// 오토박싱 / 언박싱
		/*
		 * 	오토박싱
		 *  Integer i=new Integer(10); new 안써도 된다
		 *  => Integer i=10; (오토박싱) 일반 데이터형과 호환 ==> String s=""
		 *  클래스에 해당 데이터값을 설정 : 오토박싱
		 *  int aa=i; => 언박싱
		 *  기본형에 클래스 객체를 설정 : 언박싱
		 */
		Integer i=100; // 오토박싱 int i=100;
		System.out.println("i="+i);
		int aa=i; // 언박싱
		System.out.println("aa="+aa);
		System.out.println(d);
		
		/*
		 * 	void display(Integer i1, Integer i2)
		 * => display(10,20)
		 */
		//List<Integer> list=new ArrayList<Integer>();
		/*
		 * 	1. 문자열을 해당 데이터형으로 변환 (기본형 => 기능부여)
		 * 	   문자열 => 정수형	Integer.parseInt("10")
		 *     문자열 => 실수형	Double.parseDoubl("4.5")
		 *     문자열 => 논리형 Boolean.parseBoolean("true")
		 *  2. 객체단위로 저장할 떄가 있다. ***(자료구조 => Collection)
		 * 
		 */
	}

}
