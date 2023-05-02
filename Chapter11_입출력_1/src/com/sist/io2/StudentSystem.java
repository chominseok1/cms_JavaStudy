package com.sist.io2;
import java.util.*;
import java.io.*;
public class StudentSystem {
	// 모든 학생을 읽어서 메모리에 저장
	private static List<Student> stdList=new ArrayList<Student>(); // 통째로 저장 => ObjectInputStream ObjectOutputStream
	// 파일을 읽어서 메모리에 저장 => 메모리를 제어   파일자체를 제어x 속도가 느려짐
	//page+10 ==> 1 => 110 ?page=1 ==> "1" page를 Integer로 형변환
	//Web => String,Window => String
	static
	{
		FileReader fr=null; // 지역변수는 초기값 줘야됨  null 값 안주면 오류남 // int i=0;
		try
		{
			fr=new FileReader("c:\\java_datas\\school.txt"); //빈파일
			//fr.r
			StringBuffer sb=new StringBuffer();
			int i=0; // 문자 받기
			while((i=fr.read())!=-1) // 문자 끝날때 까지 읽기
			{
				sb.append((char)i); // 데이터 집어 넣음
			}
			// 홍길동|90|90|90|270|90.00\n  \r=> 다음줄에 맨앞부터 출력 파일에서 \r을 쓰고 \n을 해야 밑으로 내려감
			String[] stds=sb.toString().split("\n"); //1줄씩 1명씩 저장 모아 놓고 짜르기 split
			// 학생별 구분
			for(String ss:stds)
			{
				StringTokenizer st=new StringTokenizer(ss,"|"); //각 학생 데이터별로 짜르기
				//학생 데이터별 구분
				Student s=new Student();
				s.setHakbun(Integer.parseInt(st.nextToken())); //1번 갖다박기 1이 문자열이어서 정수형 변환 hakbun이 int
				s.setName(st.nextToken()); // name String
				s.setKor(Integer.parseInt(st.nextToken()));
				s.setEng(Integer.parseInt(st.nextToken()));
				s.setMath(Integer.parseInt(st.nextToken()));
				int total=s.getKor()+s.getEng()+s.getMath();
				s.setTotal(total);
				s.setAvg(total/3.0);
				stdList.add(s);
			}
			
		}catch(Exception ex) 
		{
			ex.printStackTrace(); // 에러 위치 확인
		}
		finally
		{
			try
			{
				fr.close();
			}catch(Exception ex) {}
		}
		
	}
	public int menu()
	{
		System.out.println("======== 메뉴 =========");
		System.out.println("1. 학생 목록");
		System.out.println("2. 학생 등록");
		System.out.println("3. 학생 수정");
		System.out.println("4. 학생 삭제");
		System.out.println("5. 프로그램 종료");
		System.out.println("======================");
		int no=0;
		try
		{
			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
			// 키보드 입력값 읽는 io => 예외처리 => 얘가 Scanner를 대체 
			System.out.println("메뉴 번호 입력:");
			String str=in.readLine(); // 입력한 값 읽기
			no=Integer.parseInt(str);
		}catch(Exception ex) {}
		return no;
	}
	public void process() // 백엔드 개발
	{
		while(true)
		{
			int no=menu();
			if(no==5)
			{
				System.out.println("프로그램 종료");
				FileWriter fw=null; //한글 저장시
				//FileOutPutStream => FileWriter 편리
				try
				{
					fw=new FileWriter("c:\\java_datas\\school.txt");
					// 자바 프로그램과 파일 연결 => 스트림 (출력 스트림)
					// 2byte씩 전송한다 (문자 스트림) => 한글(2byte)
					// 알파벳, 숫자는 1byte, 2byte 상관없이 가능
					String temp="";
					for(Student ss:stdList)
					{
						temp+=ss.getHakbun()+"|"+ss.getName()+"|"+ss.getKor()+"|"+ss.getEng()+"|"+ss.getMath()+"\n";
					}
					fw.write(temp);
				}catch(Exception ex)
				{
					ex.printStackTrace();
				}
				finally
				{
					try
					{
						fw.close();
					}catch(Exception ex) {}
				}
				break;
			}
			else if(no==1)
			{
				for(Student ss:stdList)
				{
					int total=ss.getKor()+ss.getEng()+ss.getMath();
					ss.setTotal(total);
					ss.setAvg(total/3.0);
					System.out.println(
						ss.getHakbun()+" "
						+ss.getName()+" "
						+ss.getKor()+" "
						+ss.getEng()+" "
						+ss.getMath()+" "
						+ss.getTotal()+" "
						+String.format("%.2f",ss.getAvg()) // 출력형식을 "%.2f" 바꾼다
							);
				}
			}
			else if(no==2)
			{
				try
				{
					BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
					System.out.println("이름 입력:");
					String name=in.readLine();
					System.out.println("국어점수:");
					String kor=in.readLine();
					System.out.println("영어점수:");
					String eng=in.readLine();
					System.out.println("수학점수:");
					String math=in.readLine();
					// 시퀀스 => 자동 증가 번호 만들기=> 구분자
					int max=0;
					for(Student ss:stdList)
					{
						if(ss.getHakbun()>max)
							max=ss.getHakbun();
					}
					
					Student s=new Student();
					s.setName(name);
					s.setHakbun(max+1);
					s.setKor(Integer.parseInt(kor));
					s.setEng(Integer.parseInt(eng));
					s.setMath(Integer.parseInt(math));
					stdList.add(s);
				}catch(Exception ex) {}
			}
			else if(no==4)
			{
				try
				{
					BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
					System.out.println("학번입력:");
					String hak=in.readLine();
					int i=0;	
					for(Student ss:stdList)
					{
						if(ss.getHakbun()==Integer.parseInt(hak))
						{
							stdList.remove(i);
							break;
						}
						i++;
					}
				}catch(Exception ex) {}
			}
			
		}
	}
}
