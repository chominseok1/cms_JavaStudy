package com.sist.lib;
// equals => String에서 많이 쓰임
// equals => Object에서는 객체 비교
class Student2
{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Student2(String name)
	{
		this.name=name;
	}
	// if(s1.equals(s2))
	// ((Student2)obj) ==> 형변환
	// (Student2)obj.name .이우선순위 여서 오류남 
	// .이 형변환보다 우선순위
	// 재정의를 하지 않는 경우는 ==과 동일하다 
	// Object => equals는 사용빈도가 많지 않다 => 오버라이딩을 사용해야 한다
	// => String ... equals가 재정의 되어 있다 (실제 문자열) 
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Student2)
		{
			Student2 s=(Student2)obj;
			return name==s.name;
			//return name==((Student2)obj).name; //문자열 비교 형식 괄호 뺴면 오류
		}
		else
			return false;
		
	}
	public void print()
	{
		System.out.println("이름:"+name); 
		
	}
	/*
	 * String s="Hello";
	 * s.length();
	 * "Hello".length() ;
	 * 
	 * 
	 */
}
// == (객체=>주소) , equals (객체가 가지고 있는 변수 값 비교)
public class 라이브러리_Object_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 s1=new Student2("홍길동");
		Student2 s2=new Student2("홍길동");
		
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		/*
		 * s1=com.sist.lib.Student2@5e91993f
			s2=com.sist.lib.Student2@1c4af82c
		 * 
		 */
		// s1=com.sist.lib.Student2@5e91993f (객체비교== 주소값을 비교한다)
			//s2=com.sist.lib.Student2@1c4af82c
		
		if(s1==s2)
		{
			System.out.println("s1과 s2는 같다");
		}
		else
		{
			System.out.println("s1과 s2는 같지 않다");
		}
		// 주소 => default (주소값 비교)
		if(s1.equals(s2))
		{
			System.out.println("s1과 s2는 같다");
		}
		else
		{
			System.out.println("s1과 s2는 같지 않다");
		}
		s1.print();
		new Student2("박문수").print(); //생성과 동시에 호출
	}

}
