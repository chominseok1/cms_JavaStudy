/*
 * 	기초
 * 		= 변수, 데이터형 (정수: int, byte, long 실수 : double,boolean, char)
 * 		= 연산자, 제어문
 * 		  -------- 단항연산자(++,--,!,(type))
 * 		  -------- 이항연산자(산술,비교,논리,대입)
 * 		  -------- 삼항연산자
 * 		  -------- 조건문 (단일 if, 선택 if~else , 다중 if~else if...)
 * 		  -------- 반복문 (for, while)
 * 						------- 이차 for , for-each
 * 
 * 		 --------- 반복제어문 (break)
 * 		= 배열 : 1차
 * 		= 문자열 저장 => String
 * 		  기능 :
 * 				javascript
 * 				***1) equals : 문자열 비교
 * 					boolean equals(String s)
 * 					DB: WHERE name='홍길동'
 * 				2) startsWith : 시작문자열
 * 					boolean startsWith(String s)
 * 					DB: where name LIKE '홍%'
 * 				3) endsWith : 끝문자열
 * 					boolean endsWith(String s)
 * 					DB: where name LIKE '%홍'
 * 				***4) contains : 포함
 * 					boolean contains(String s)
 * 					DB: where name LIKE '%홍%'
 * 				5) length : 문자 갯수
 * 					int length()
 * 				6) indexOf: 문자, 문자열의 위치 (처음부터)
 * 					int indexOf(char)
 * 					int indexOf(String)
 * 					*** 문자열은 index번호가 0부터 시작
 * 					String s="Hello Java";
 * 									 -
 * 					s.indexOf('a'),s.indexOf("a")=> 답:7
 * 				7) lastIndexOf : 문자, 문자열의 위치 (뒤에서부터)
 * 				   int lastIndexOf(char)
 * 				   int lastIndexof(String)
 * 					
 * 					String s="Hello Java";
 * 									 -
 * 					s.lastIndexOf('a'),s.lastIndexOf("a")=> 답:9
 * 				8) trim : 좌우의 공백 제거
 * 				   String trim()
 * 				9) valueOf : 모든 데이터형을 문자열로 변환
 * 					valueOf(1) =>"1"
 * 					***윈도우/ 웹 => 모든 데이터형 문자열
 * 					static String valueOf(모든 데이터형) : String에서 유일하다
 * 					String.valueOf(1)
 * 					------------------
 * 				10) replace() : 변환 (문자열,문자)
 * 					String replace(char,char)
 * 								   old   new   old를 new로 바꿔라
 * 					String replace(String,String)
 * 				11) replaceAll : 변환 (문자열)
 * 					String replaceAll(String,String)
 * 									  -------regexp =>정규식
 * 					replaceAll("[가-힣]","")
 * 					 [A-Z] [a-z] [0-9] 
 * 				12) substring() : 문자열을 자르는 경우
 * 					String substring(int s)
 * 					String s="Hello Java"
 * 							  0123456789
 * 					s.substring(6) => Java
 * 					String substring(int s,int e)
 * 					String s="Hello Java"
 * 							  0123456789
 * 					s.substring(0,5) ==> Hello
 * 								  --  -1 (마지막은 1개 제외)
 * 
 * 	class : 설계 => 속성 , 기능 --- 메소드
 * 				  ----- 변수
 * 			웹=> 출력 내용 (변수)
 * 			 => 메뉴,버튼 => 기능
 * 			-------------------- 요구사항분석 (설계)			
 * 		추상화 : 설계 (기능, 데이터) : 사물을 단순화
 * 		 예)
 * 			 사원 : 사번 , 이름 ...
 * 					출근한다 , 퇴근한다...
 * 		--------------------------------------
 * 		class 설계 =========> 메모리 저장 (인스턴스)
 * 					new(클래스를 저장할떄 => new)
 * 					** Spring은 new를 사용하지 말라 (웹은 Spring내부에 있는 라이브러리)
 * 					** new없이 저장이 가능 => 리플렉션
 * 	1. 구성요소
 * 		class ClassName : 클래스 선언부
 * 		{
 * 			--------------
 * 			변수(속성)
 * 			  멤버변수
 * 				= 인스턴스 => new 사용시마다 따로 메모리를 만든다
 * 				= 정적변수 (static) => 한개의 공간만 생성 => 공유 변수
 * 					=> 컴파일러에 의해 자동 생성
 * 			--------------
 * 			***메소드(동작) : 기능
 * 			--------------
 * 			***생성자 : 멤버변수 (인스턴스 변수) 초기화
 * 					메모리에 저장시 처음으로 호출되는 메소드
 * 			--------------
 *
 * 		}
 * 	2. 구성요소 사용법
 * 		1) 메모리에 저장
 * 			class A
 * 			{
 * 				변수/ 메소드
 * 			}
 * 
 * 			A a; 선언
 * 			a=new A();
 * 			A a=new A();
 * 	
 * 			class A
 * 			{
 * 				int sabun;
 * 				String name;
 * 				String getName(){}
 * 				int getSabun(){}
 * 				void run(){}
 * 			}
 * 
 * 			A a=new A();
 * 			---
 * 			a.sabun ==> 100이라는 주소에 있는 sabun의 값을 가지고 온다
 * 						.=> 메모리 주소 접근 연산자
 * 			--a--
 * 			100
 * 			----  ↘   new => 데이터 메모리를 모아준다
 * 					100------
 * 					sabun 저장공간 1
 * 					name 저장공간 "홍길동"
 * 				    ------
 * 					getSabun() => a.getSabun()
 * 					getName() => a.getName()
 * 					------
 * 	3. 접근범위 
 * 	4. 객체지향의 3대 요소
 * 	5. 클래스의 종류
 * 	6. 예외처리
 * 	--------------------
 *  API => 지정된 라이브러리 사용법
 *  class A Out
 *  {
 *  int aa;
 *  }
 *  class B System
 *  {
 *  	A a=new A();
 *  }
 *  B b=new B();
 *  System.out.aa
 *  
 *  class A
 *  {
 *   int aa;
 *   }
 *   class B
 *   {
 *    A a=new A(); has-a
 *    }
 *    class C
 *    {
 *     B b=new B();
 *    }
 *    
 *    C c=new C();
 *    c.b.a.aa
 *    
 *  
 */
class Student
{
	int hakbun;
	String name;
}
public class 클래스의구성요소_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student hong=new Student();
		// hong 안에 hakbun name 변수 들어가있음
		hong.hakbun=1;
		hong.name="홍길동";
		Student shim=hong;
		shim.hakbun=2;
		shim.name="심청이";
		System.out.println(hong.hakbun);
		System.out.println(hong.name);
	}

}
