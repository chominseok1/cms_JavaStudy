package com.sist.main; 
class Member{
	private String name; //메모리에 읽기 get / 쓰기 set
	private static Member mem;
	// 메모리에 저장된 데이터 읽기
	public String getName() {
		return name;
	}
	// 메모리에 저장
	public void setName(String name) {
		this.name = name;
	}
	
	public static Member newInstatnce()
	{
		if(mem==null)
			mem=new Member();
		return mem;
	}
}
//191 page
public class 정적초기화_싱글턴 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1=Member.newInstatnce();
		m1.setName("홍길동");
		System.out.println("m1="+m1);
		Member m2=Member.newInstatnce();
		m2.setName("심청이");
		System.out.println("m2="+m2);
		Member m3=Member.newInstatnce();
		m3.setName("박문수");
		System.out.println("m3="+m3);
		
		System.out.println(m1.getName());//주소값동일
		System.out.println(m2.getName()); // 맨마지막에 바뀌는 애가 바뀜
		System.out.println(m3.getName()); //생성했는데 다 같은 객체 하나의 객체를 사용하는 것이 싱글톤 메모리 누수방지
	}

}
