package com.sist.main2;
import java.util.*;
//인터페이스 => 여러개를 묶어서 쉽게 관리할 목적
//스프링 (클래스 관리자) => 인터페이스
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("해당 클래스 번호:");
		int no=scan.nextInt();
		Container cc=new Container();
		Exec a=(Exec)cc.getBean(no);
		a.execute();
		/*if(no==1)
		{
			A a=(A)cc.getBean(no); //Object가 A보다 크니까 형변환 해줘야함
			a.execute();
		}
		if(no==2)
		{
			B a=(B)cc.getBean(no); //Object가 A보다 크니까 형변환 해줘야함
			a.execute();
		}
		if(no==3)
		{
			C a=(C)cc.getBean(no); //Object가 A보다 크니까 형변환 해줘야함
			a.execute();
		}
		if(no==4)
		{
			D a=(D)cc.getBean(no); //Object가 A보다 크니까 형변환 해줘야함
			a.execute();
		}
		if(no==5)
		{
			E a=(E)cc.getBean(no); //Object가 A보다 크니까 형변환 해줘야함
			a.execute();
		}*/
	}

}
