package com.sist.lib;
// clone => 복제할때 사용 (메모리가 새롭게 생성) => prototype 
class Sawon implements Cloneable
{
	private int sabun;
	private String name;
	
	public int getSabun() {
		return sabun;
	}

	public void setSabun(int sabun) {
		this.sabun = sabun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 초기화
	public Sawon(int sabun, String name) //생성자는 한번만 호출 값을 변경할때는 getter/setter가 있어야함 
	//생성자는 호출할때마다 새로운 주소
	{
		// 지역변수 우선순위 => 멤버변수와 지역변수의 구분 => this.
		// this는 자신의 객체 => static 변수 ,모든 클래스는 this를 가지고 있다
		this.sabun=sabun;
		this.name=name;
		/*
		 * 	오버로딩
		 * 	생성자 => 여러개 사용이 가능 , 객체 생성시에 호출
		 * 	// 생성자는 무조건 한개이상이 있다.
		 * 	// 생성자를 사용하지 않으면 자동으로 기본 생성자를 추가
		 * 	// 시작과 동시에 필요한 내용을 서술
		 * 	예) 데이터베이스 연결 => 드라이버 설정 (클래스로 만들어져 있다)
		 * 		thin드라이버 (연결만 해주는 역할)
		 * 		윈도우 모양 설정
		 * 	// 필요시에만 사용
		 */
	}
	// 재정의 => 오버라이딩 (Object)

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	public void print()
	{
		System.out.println("사번:"+sabun+",이름:"+name);
	}
	
}
class Saram implements Cloneable
{
	private int no;
	private String name;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public  Saram(int no,String name)
	{
		this.no=no;
		this.name=name;
	}
	public void print()
	{
		System.out.println("번호:"+no+", 이름:"+name);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
public class 라이브러리_Object_1 {

	public static void main(String[] args) throws CloneNotSupportedException  {
		// TODO Auto-generated method stub
		// 메모리할당
		Sawon s1=new Sawon(1, "홍길동");
		s1.print();
		Sawon s2=s1; //참조
		s2.print();
		s1.setSabun(2);
		s1.setName("심청이");
		// 주소를 이용할때는 같은 주소인 경우 => 다른 객체의 내용도 변경된단
		System.out.println("s1="+s1+"s2="+s2);
		// Spring , Game(아바타)  Clone 씀
		//복제
		Sawon s3=(Sawon)s1.clone(); //예외처리 해야 오류 안남 Sawon으로 형변환 해줘야함 //새로운메모리를 만든다
		s3.print();
		System.out.println("s3="+s3); //주소 다름
		s3.setSabun(3);
		s3.setName("박문수");
		s3.print();
		
		s1.print();
		s2.print();
		
		
		Saram h=new Saram(20170982, "조민석");
		h.print();
		Saram h1=h;
		h1.print();
		h1.setNo(222);
		h1.setName("홍길동");
		
		h.print();
		h1.print();
		
		System.out.println(h+"    "+h1);
		
		Saram h2=(Saram)h.clone();
		// Saram h2=(Saram)h.clone();         Saram h2=(Saram)h.clone();
		
		h2.setNo(33333);
		h2.setName("장광만");
		h2.print();
		
		h.print();
		h1.print();
		
		h2.print();
		
		
	}

}
