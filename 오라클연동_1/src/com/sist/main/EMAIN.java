package com.sist.main;
import java.util.*;
import com.sist.dao.*;
public class EMAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		EDAO dao=new EDAO();
		while(true)
		{
		System.out.println("==========메뉴=========");
		System.out.println("1. 사원 목록");
		System.out.println("2. 사원 상세보기");
		System.out.println("3.사원 찾기");
		System.out.println("9. 종료하기");
		System.out.println("======================================");
		System.out.println("메뉴 입력:"); 
		int menu=scan.nextInt();
		if(menu==9)
		{
			System.out.println("종료");
			break;
		}
		else if(menu==1)
		{
			List<EVO> list=dao.empListdata();
			for(EVO vo:list)
			{
				System.out.println(vo.getEmpno()+" "+vo.getEname()+" "+vo.getJob()+" "+vo.getHiredate()+" "+vo.getSal());
			}
		}
		}
	}

}
