package com.sist.main;
// 상속이 있는 경우 => 객체 생성 방법
// double d=10; => d=10.0 묵시적 타입 변환

/*
 * class A
 * class B extends A
 * 
 * 		A (상위 클래스)
 *      ↑
 * 		B (하위 클래스)
 * 
 * 		==> 크기 (범위) 상위>하위
 * 			----------- 상속 , 포함
 * 			A > B
 * 			----- 기본형도 float(4byte)>long(8byte)
 * 
 * 		A a=new A(); 일반적인 객체 생성 클래스랑 생성자 동일하게
 * 		A a=new B();
 * 		B c=new B();
 * 		B d=new A(); x 큰것을 작은것에 대입 오류나는 코드
 * 		B e=(B)new A(); ==>X 오류
 * 		***형 변환
 * 		(int)10.5
 * 
 *  	상속
 *  	1. 형식
 *  		class A extends B => 단일 상속
 *  	2. 클래스 크기
 *  		상속을 내리는 클래스 > 상속을 받는 클래스
 *  	3. 형변환
 *  		작은 클래스= 큰 클래스
 *  	4. 자바의 최상위 클래스 => Object
 *  	5. 상속의 예외 : static => 공유 , 초기화블록, 생성자 , private 접근이 안됨
 *  	------------
 */
class Human
{
	int a=10;
	int b=20;
	static int c=30;
	public void display()
	{
		System.out.println("Human:display() Call...");
	}
}
class Student extends Human
{
	int d=40;
	int e=50;
	
	/* 생성자 빼고는 다 내려옴
	 *  int a=10;
		int b=20;
		static int c=30;
		display()  
	 */
	// 오버라이딩 형태가 같아야 오버라이딩 오버로딩은 매개변수가 틀림
	/*
	 *  1. 상속 => 재정의
	 *  2. 메소드명 동일
	 *  3. 매개변수 동일
	 *  4. 리턴형이 동일
	 *  5. 접근지정어는 확장이 가능 / 축소하면 오류남
	 */
	public void display()
	{
		System.out.println("Student:display() Call...");
	}
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 클래스명과 생성자가 다른경우
		/*
		 *   클래스명 변수명=new 생성자()
		 *   ----			-----
		 *   	Human h2=new Student();
		 *   1) 변수 제어 ==> 클래스타입 따라감 Human
		 *   2) 메소드 제어 ==> 생성자 따라감 Student
		 * 
		 */
		Human h=new Human(); //a,b,c
		h.display();
		Student s=new Student(); //a,b,c,d,e
		s.display();
		Human h2=new Student(); // 작은 데이터를 큰데이터에 대입했기에 문제 없음 (O) a,b,c
		h2.display();
		//Student s2=new Human(); 큰거를 작은거에 대입해서 안됨
		//Student s2=(Student)new Human(); 하위 클래스로 상위 클래스를 받아오려면
		Student s2=(Student)h2; //생성자가 동일해야한다 //정상수행 (O) a,b,c,d,e
		s2.display(); //h2 생성자가 student
		//Student s3=(Student)h; // 생성자가 동일하지 않아서 오류 ClassCastException => 형변환 오류
		
		//사용 범위 ==> 상위 클래스는 하위 클래스의 추가된 내용에 접근이 불가능하다
		//변수 접근=> 선언된 클래스에 등록 변수까지만 접근이 가능 (앞에 클래스 꺼 갖다 쓴다)
		// 실제 상속 => 라이브러리(윈도우,데이터베이스)
	}

}
