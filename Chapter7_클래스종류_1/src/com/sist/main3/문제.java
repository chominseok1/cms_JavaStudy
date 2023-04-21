package com.sist.main3;

public class 문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1. 1 자바는 클래스 단일 상속 인터페이스 다중 구현
		 *  static 생성자 초기화블럭 private (상속은 된다, 단지 접근이 안된ㄷ)
		 *  => 상속의 예외조건
		 *  final이 있는 경우 있는 그대로 사용 => String,Math,System..(final)
		 * 2. 2
		 * 
		 * class 동물 class 사람 extends 동물 => 동물 a=new 사람() 사람 b=new 사람() =>동물 A, 사람 B
		 * 3. 2
		 * Final => 상수변수
		 * Static final => 상수
		 * final 클래스는 상속이 불가능
		 * 		String
		 * 4. 4
		 * 5. 생성자는 상속 안됨
		 *  Child c=new Child("",1)-> 상위 클래스의 기본 생성자가 호출된다
		 *  public parent(){} 포함 되어있어야된다
		 * 6. 2
		 * 7. 3 인터페이스는 상수형 변수만 갖고있다 인스턴스 필드 가질려면 추상클래스 멤버변수 => 필드, 속성(인스턴스 변수)
		 * 	필드=변수
		 * 8. 4 => 구현객체는 인터페이스 타입으로 자동 변환된다.
		 * 9. 4 참조탑인은 null값으로 초기화 할 수 있다
		 *  A a=new A();
		 *  A b=a
		 *  if(a==b) 객체 주소번지 비교할떄 == !=
		 * 10.3 => 자동메모리 회수를 이용한다(GC)
		 * 		=> 멀티미디어 프로그램 만들때는 직접 소멸시켜야함 (화상채팅,cctv,스트리밍서비스)
		 * 정적영역 Method Area/ static
		 * Stack 영역 지역변수/매개변수 메모리 자체 관리 => {}을 종료되면 자동 소멸
		 * Heap 영역 객체/배열 인터페이스/ 열거형 프로그래머 영역(GC) 1.사용이 없는경우 GC가 회수 2.null인 경우 GC가 회수
		 *  얘네 전체 관리 : JVM(자바 가상머신)
		 * 11.2 String은 클래스형(참조타입) =>메소드를 갖고있다
		 * 							  => 문자열 데이터형, 클래스 참조형
		 * 	  문자열비교할때==을 사용하면 주소값을 비교
		 * 	  equals()연산자를 써서 실제 저장된 문자열 비교
		 * 	  String s="Hello"
		 * 	  String s1=new String("Hello");
		 * 	  if(s==s1) false
		 * 	  if(s.equals(s1))
		 * 
		 * 	String s1="Hello" ==> 문자열 자체가 주소
		 * 	{'H','e','l','l','o'}
		 * String s2="Hello"
		 * if(s1==s2) => 동일한 객체 => true
		 * 12. 다중상속이냐 단일상속이냐 모든 메소드 변수가 public으로 되어있다
		 * 		여러개 클래스를 모아서 관리
		 * 13.  implements extends 다중상속 단일 상속
		 * 14. 표준화가 가능하다 서로다른 클래스 연결 독립적으로 사용 개발시간 단축 => (리모콘)
		 * 15.e 패키지간의 연결을 도와주는 것은 import
		 * 16.4 멤버변수를 필드라고 한다 = 자동초기화 됨 
		 * 		int =>0 double =>0.0 boolean=>false String =>null
		 * 		클래스는 생성자가 있어야함 없을경우 컴파일러가 자동으로 기본생성자 추가
		 * 		생성자의 역할
		 * 		= 객체 생성시에 호출되는 함수이기때문에 생성자는 반드시 한 개 이상이 필요한다
		 * 		= 멤버변수에 대한 초기화
		 * 		= 클래스명과 동일/리턴형이 없다/ 접근지정어는 보통 public
		 * 		= 오버로딩을 지원한다 (여러개 생성자가 있을 수 있다)
		 * 		= 초기화
		 * 		  1) 명시적 초기화(값직접대입)
		 * 		  2) 구현후에 초기값 대입 => 파일읽기,제어문,데이터베이스
		 * 			 초기화 블록
		 * 			 생성-> 주로 사용빈도가 많다
		 * 		public class A
		 * 		{
		 * 		---------------------
		 * 		멤버변수
		 * 		--------------------
		 * 		생성자
		 * 		-------------------
		 * 		메소드
		 * 		-------------------
		 * 		}
		 *   순서는 자유 /class 설계시 순서는 관계가 없다
		 * 17. b
		 * 자바의 모든 클래스는 Object로부터 상속을 받는다.
		 * Object =>모든 데이터형의 가장 큰 데이터형 /모든것을 받을수있다
		 * 		Object do=10, 10.5..
		 * 		Object d=""
		 * 		Object d=new A() => 라이브러리에서는 주로
		 * 							매개변수 / 리턴형
		 * 						=>  반드시 형변환을 한다
		 * 
		 * class A
		 * {
		 *  int a,b,c;
		 *  public void disp(){}
		 *  }
		 *  Object 0=new A();
		 * 18.c 쓸려면 Getter/Setter
		 * 19. 		oooo
		 * 	  		 ooox
		 * default   ooxx
		 * 			 oxxx
		 * 20. 재정의 할떄 protected에서 축소됨 답:void number(){}
		 * 21.인터페이슨 상수저장
		 * 22.implements A
		 * 23. implements
		 * 		new Printable(); 메모리할당 안됨
		 * 		void print(){} 앞에 public있어야됨 축소되서 틀림
		 * 24.오버로딩  오버라이딩
		 */
	}

}
