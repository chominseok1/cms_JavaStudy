package com.sist.main3;
class AA
{
	public AA()
	{
		System.out.println("A() CALL...");
	}
	public AA(int a)
	{
		System.out.println("A(int a) CALL...");
	}
}
class BB extends AA
{
	public BB()
	{
		System.out.println("B()CALL...");
	}
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BB b=new BB(); // 원래
		AA a=new AA();
		AA aa=new BB(); //강제 형변환 할때는 생성자랑 ///인터페이스, 추상클래스
		BB bb=(BB)aa; // 클래스랑 동일해야함
	}

}
