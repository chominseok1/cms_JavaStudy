package com.sist.mumje;
// 1. 캡슐화
// => 데이터보호
// => 데이터를 은닉화 (private)/메소드를 통해서 접근이 가능 (다른 클래스 연결 =>public)
// 사용자 정의 데이터형 => 필요에 의해서 데이터를 묶어서 관리할 목적으로 만든다
// 사용자 정의 데이터형 => ~VO 
class SutdaCard
{
	private int num;
	private boolean iskwang;
	//getter => 읽기
	//setter => 저장
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public boolean isKwang() {
		return iskwang;
	}
	public void setKwang(boolean kwang) {
		this.iskwang = kwang;
	}
	class Student
	{
		private String name;
		private int ban;
		private int no;
		private int kor;
		private int eng;
		private int math;
		//private int ban,no,kor,eng,math; 모아서 써도됨
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getBan() {
			return ban;
		}
		public void setBan(int ban) {
			this.ban = ban;
		}
		public int getNo() {
			return no;
		}
		public void setNo(int no) {
			this.no = no;
		}
		public int getKor() {
			return kor;
		}
		public void setKor(int kor) {
			this.kor = kor;
		}
		public int getEng() {
			return eng;
		}
		public void setEng(int eng) {
			this.eng = eng;
		}
		public int getMath() {
			return math;
		}
		public void setMath(int math) {
			this.math = math;
		}
		
	}
	
	/*
	 *  인스턴스 변수 : 데이터를 각각 저장시에 사용
	 *  =>kind num
	 * 	정적변수(공유변수) : 공통으로 사용되는 변수 => 메모리가 1개만 생성
	 * =>width, height
	 * 	------------------------------ 프로그램 종료시까지 메모리 유지(자동 초기화)
	 * 	지역변수 : 메소드에서 선언되는 변수 (지역변수, 매개변수)
	 * 			=> 메소드안에서만 사용 ({}을 벗어나면 사라진다)
	 * 			=> 반드시 초기화 후에 사용
	 */			//=> k, n
	
	/*
	 * 생성자
	 * 1) 모든 생성자의 이름은 클래스명과 동일하다
	 * 2) 생성자는 객체를 생성하기 위한 것이다 (x) 객체 생성은 new
	 * 3) 클래스에는 생성자를 반드시 하나 이상 있어야한다 (x)
	 * 	  => 생성자는 없어도 상관없다
	 * 		 -------------------- 없는 경우 컴파일러가 자동으로 기본 생성자를 추가한다 
	 * 4) 생성자는 오버로딩 할 수 없다 (x) 오버로딩 지원함
	 * 			 ------ 같은 이름의 메소드를 여러개 만들어서 사용
	 * 			= 여러개를 만들 수 있다
	 * 	*** 오버로딩의 조건
	 * 	= 한개의 클래스나 상속관계의 클래스
	 * 	= 메소드명 동일
	 * 	= 매개변수의 갯수나 데이터형이 달라야한다
	 *  = 리턴형은 관계 없다
	 *  
	 *  class A
	 *  {
	 *  	public void display(){}
	 *  	public int display(int a){}
	 *  }
	 *  class B extends A
	 *  {
	 *  	//public void display(){}
	 *  	//public int display(int a){}
	 *  	public int display(int a, intb){}
	 *  }
	 */
	/*
	 * this
	 * ----
	 * 1) 모든 클래스는 this를 가지고 있다
	 * 2) 객체 자신을 가리키는 참조변수 (static Object this) => new
	 * 	  => this는 생성자 , 인스턴스 메소드에서 사용이 가능하다.
	 * 
	 * 	class A
	 * 	{
	 * 		public A(A this){
	 * 		}
	 * 		public void display(A this){
	 * 		}
	 * 		public static void aaa(){
	 * 		}
	 * 3) 클래스 내에서는 어디서든 사용이 가능(x)
	 * 4) 지역변수와 인스턴스 변수를 구분할 때 사용한다
	 * class A
	 * {
	 * private String name; =>heap
	 * public void display(String name) =>stack
	 * 			{			
	 * 				this.name=name (매개변수)
	 * 				---------
	 * 				A클래스에 설정된 변수
	 * 			}
	 * }
	 * 5) 클래스 메소드(static) 내에서는 사용할 수 없다 
	 * 인스턴스 메소드 , 객체 메소드
	 * 객체명.메소드
	 * 정적 메소드 , 공유 메소드 , 클래스 메소드 =>static 메소드
	 * 클래스명.메소드
	 * --------------------------------------------
	 * 
	 * 오버로딩 조건
	 * 1) 메소드명이 동일 (한개의 이름으로 여러개의 새로운 기능을 추가)
	 * 2) 매개변수의 갯수나 데이터형이 달라야 한다
	 * 3) 리턴형은 관계가 없다
	 * 4) 매개변수의 이름이 달라야 한다
	 * 		void display(int a) => display(int) => 메모리에 이렇게 저장됨
	 * 		void display(int b) => 두개는 같은 메소드 display(int)
	 * 
	 * 메소드 이름이 같아야한다
	 *  매개변수의 개수나 타입이 달라야한다
	 *   매개변수 명
	 *   
	 *  ---------------------------
	 *  long add(int a, int b) { return a+b; } add(int,int)
		(x) a. long add(int x, int y) { return x+y; } add(int,int)
		b. long add(long a, long b) { return a+b; } add(long,long)
		c. int add(byte a, byte b) { return a+b; }  add(byte,byte)
		d. int add(long a, int b) { return (int)(a+b); add(long, int)
		----------------------------------------------------
		 다음 중 초기화에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
			a. 멤버변수는 자동 초기화되므로 초기화하지 않고도 값을 참고할 수 있다.
				------ 인스턴스 변수, 정적 변수 => 자동 초기화
				int => 0
				double => 0.0
				boolean => false
				String => null (클래스,배열)
				null => 참조하는 주소가 없는 경우
				=> String s=null
					if(s==null)
					String s="";
					if(s.equals(""))
			b. 지역변수는 사용하기 전에 반드시 초기화해야 한다.
				지역변수는 자동 초기화 안된다 (반드시 초기화 후에 사용)
		 	c. 초기화 블럭보다 생성자가 먼저 수행된다.
		 		명시적 초기화->초기화 블록->생성자
		 					  |(안에서도 순서)
		 				(클래스변수-> 인스턴스)
 			d. 명시적 초기화를 제일 우선적으로 고려해야 한다.
 				-------
 				class A
 				{
 				int a=100;
 				}
 			e. 클래스변수보다 인스턴스변수가 먼저 초기화된다.
 				클래스 변수가 먼저 초기화
 				--------- 컴파일시  인스턴스변수----new

			
			기본값-명시적초기화-초기화블럭-생성자
							static => instance
	 *  
	 */
	
	
	
	
	
	
	
	
	
	
	/*답안: 인스턴스: kind num
	 * 정적: width, height
	 * 지역변수: int k, int n 
	 * 4. b,c,e
	 * 5. b
	 * 6. c,d
	 * 7.메소드 매개변수 매개변수 명
	 * 8. b,c, d
	 * 9. a
	 * 10.ade
	 * 11.a,e
	 * 12.a
	 * 13. private default protected public
	 * 14.C 지역변수는 static , 접근지정어, abstract는 사용이 불가능
	 * 지역변수중에 유일하게 사용: final
	 */
	
}
class A
{
	int a=10;
	static int b=20;
	{
		a=100;
		System.out.println("a="+a);
	}
	static
	{
		b=200;
		System.out.println("b="+b);
	}
	A(){
		a=1000;
		b=2000;
		System.out.println("a="+a+"b="+b);
	}
}
public class 문제풀이_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			A a=new A();
	}

}
