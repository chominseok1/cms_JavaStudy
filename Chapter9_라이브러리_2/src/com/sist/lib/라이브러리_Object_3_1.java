package com.sist.lib;
class Sawon2
{
	private int sabun;
	private String name;
	//초기화 처음에 생성자로 초기화 getter setter로 값변경
	public Sawon2(int sabun, String name)
	{
		this.sabun=sabun;
		this.name=name;
	}
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
	// 오버라이딩
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Sawon2 s=(Sawon2)obj;
		
		return name.equals(s.name) && sabun==s.sabun;
	}
	
	
}
public class 라이브러리_Object_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Sawon s1=new Sawon(1, "홍길동");
		System.out.println(s1);
		s1=new Sawon(1, "박문수");
		System.out.println(s1); //메모리 주소가 바뀜 생성자는 딱한번 호출 나머지는 getter/setter로 값 변경*/
		
		Sawon2 s1=new Sawon2(1, "홍길동");
		Sawon2 s2=new Sawon2(1, "홍길동");
		// 오버라이딩을 하지 않는 경우 => 주소(==)
		if(s1.equals(s2))
		{
			System.out.println("같은 사원이다");
		}
		else
		{
			System.out.println("다른 사원이다");
		}
	}

}
