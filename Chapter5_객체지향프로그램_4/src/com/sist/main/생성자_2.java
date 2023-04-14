package com.sist.main;
/*
 * 	초기화 
 *  1. 디폴트 값
 *  	int => 0 , String => null, boolean => false 선언만하면 자동으로 값이 들어가는
 *  	class A
 *  	{
 *  		int a; 0들어가 있음
 *  	}
 *  2. 명시적 초기화 : 직접 값을 설정
 *  	class A
 *  	{
 *  		int a=10;
 *  	}
 *  3. 생성자 초기화
 *  	class A
 *  	{
 *  		int a;
 *  		A() {
 *  		  a=100;
 *  		}
 *  	}
 *  4. 초기화 블록 
 *  	class A
 *  	{
 *  		int a;
 *  		//a=1000;
 *  		{
 *  			a=1000;
 *  		}
 *  	}
 *  	읽어가는 순서 디폴트=> 명시적 => 초기블록 => 생성자 초기블록 => 생성자 같이 쓰지않음
 *  			int a=0 int a=10  int a=100  int a=1000
 */
/*class Student
{
	int hakbun=10;
	String name;
	
	{
		 hakbun=100; //연산처리 , 제어문 , 파일 읽기...
	}
	Student(){
		hakbun=1000;
	}
	
	class A
	{
		void a(){}
		void b(int a){}
	}
}*/
class Student
{
	int hakbun;
	String name;
	Student(){ // 값 하나만 갖고가는 생성자
		System.out.println("Student() call...");
		hakbun=1;
		name="홍길동";
	}
	Student(int h, String n) // 값을 다르게 매개변수 있는 생성자
	{
		hakbun=h;
		name=n;
	}
}
public class 생성자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student(); //갖다 쓰려고 주소저장
		System.out.println(s.hakbun);
		System.out.println(s.name);
		
		Student s1=new Student(); //갖다 쓰려고 주소저장
		System.out.println(s1.hakbun);
		System.out.println(s1.name);
		// 생성자 호출 new를 앞에 붙여서 호출
		//new Student(); //생성자는 반드시 앞에 new를 붙여야한다
		Student s2=new Student(2, "심청이");
		System.out.println(s2.hakbun);
		System.out.println(s2.name);
		Student s3=new Student(3, "박문수");
		System.out.println(s3.hakbun);
		System.out.println(s3.name);
		
	}

}
