package com.sist.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class EDAO {
	private Connection conn; // 오라클 연결 객체
	private PreparedStatement ps; // 오라클 통신 (SQL 전송, 결과값 받는다)
	
	// 오라클 주소
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	// 드라이버 이름
	private final String DRIVER="oracle.jdbc.driver.OracleDriver";
	// 사용자 명
	private final String USERNAME="hr";
	// 비밀번호
	private final String PASSWORD="happy";
	//--------------------------------------- 파일에 저장 파일 읽기(보안)
	
	// 드라이버 => 한번만 수행 (생성자)
	public EDAO()
	{
		try
		{
			Class.forName(DRIVER); 
			//그리고 Class의 static 메소드인 forName은 클래스의 이름을 매개변수로 받아서 Class 객체를 리턴해줍니다.
		}catch(Exception ex) {}
	}
	public void getConnection()
	{
		try
		{
			conn=DriverManager.getConnection(URL,USERNAME,PASSWORD); // 호출시 = conn hr/happy
		}catch(Exception ex) {}
	}
	public void disConnection()
	{
		try
		{
			if(ps!=null) ps.close();
			if(conn!=null)conn.close();
		}catch(Exception ex) {}
	}
	// 1. 사용자가 사원 전체 목록 요청
	public List<EVO> empListdata()
	{
		List<EVO> list=new ArrayList<EVO>();
		try
		{
			getConnection(); // 오라클 연결
			// 2. 사용자가 요청한 SQL문장을 제작
			String sql="SELECT empno,ename,job,hiredate,sal "+"FROM emp "+"ORDER BY empno";
			ps=conn.prepareStatement(sql); // 오라클 전송
			// 저장된 값을 한 행 단위로 불러올 수 있다. ResultSet
			ResultSet rs=ps.executeQuery();
			while(rs.next()) // 커서 위치 위로
			{
				EVO vo=new EVO();
				vo.setEmpno(rs.getInt(1));
				vo.setEname(rs.getString(2));
				vo.setJob(rs.getString(3));
				vo.setHiredate(rs.getDate(4));
				vo.setSal(rs.getInt(5));
				list.add(vo);
			}
			rs.close();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
		return list;
	}
	
}
