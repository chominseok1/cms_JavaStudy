package com.sist.main;
import java.util.*;
import com.sist.dao.*;
public class EmpClientMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 오라클 연결 (DAO=> 오라클)
		EmpDAO dao=new EmpDAO();
		//1. 목록 요청
		List<EmpVO> list=dao.empListdata();
		for(EmpVO vo:list)
		{
			System.out.println(vo.getEmpno()+" "
							+vo.getEname()+" "
							+vo.getJob()+" "
							+vo.getHiredate().toString()+" "
							+vo.getSal()+" "
							+vo.getDeptno()+" "
							+vo.getDvo().getDname()+" "
							+vo.getDvo().getLoc()+" "
							+vo.getSvo().getGrade());
		}
	}

}
