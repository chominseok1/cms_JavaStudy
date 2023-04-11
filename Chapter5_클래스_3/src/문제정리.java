import java.util.Scanner;
/*
 * method => 140page
 * 1) 메소드 형식 => 기능처리
 * 	-----------
 * 		웹=> 화면 변경
 * 		------------- 메뉴클릭,버튼클릭, 이미지클릭...
 * 		검색, 글쓰기, 수정, 회원가입, 회원탈퇴...
 * 		사용자의 동작과 관련
 * 		=리턴형 메소드명(매개변수...)=> 선언부
 * 		{
 * 			구현부
 * 		}
 * 		=리턴타입 (리턴형)
 * 		 처리후 결과값 한개만 전송이 가능하다
 * 		 *** 여러개인 경우 : 배열 , 클래스
 * 		 *** 한개인 경우: 일반 기본형 , String
 * 		 1) 결과값이 있는 경우
 * 			리턴형 메소드명(매개변수...)
 * 			{
 * 			   return 값; 일치 ==> 리턴형 클수도 있다
 * 					  ---
 * 			}
 * 			예)
 * 				int method()
 * 				 {
 * 					return 10.5; => 오류발생
 * 				}
 * 				int method()
 * 				 {
 * 					return (int)10.5; => 오류발생
 * 				}
 * 				==> int a==method();
 * 					==> method()
 * 				double method()
 * 				 {
 * 					return 10; => 오류발생
 * 				}
 * 				==> double d=method()
 * 					==> 결과값을 받아서 처리
 * 				예) 오라클에서 데이터를 읽기
 * 					------------------
 * 					=> 브라우저로 보낸다
 * 					=> 자바: 데이터관리
 * 					=> 자바스크립트 : 이벤트 처리(브라우저)
 * 						NodeJs/ ReactJs/ VueJs/ Redux /Vuex /TypeScript/Ajax/Jquery
 * 								---------------------------------------
 * 				int[] method()
 * 				{
 * 					int[] arr={1,2,3,4,5};
 * 					return arr;// 배열 주소만 넘겨준다
 * 				}
 * 				String method()
 * 				{
 * 				  return "";
 * 				}
 * 				==> String s=method()
 * 		 2) 결과값이 없는 경우
 * 			void method()
 * 			----
 * 			{
 * 				return;// 메소드 종료
 * 			}
 * 			void method1()
 * 			{
 * 
 * 				생략 => 컴파일러가 자동으로 추가 return
 * 			}
 * 			==> import 추가
 * 				import java.lang.* => 자동 추가
 * 						System
 * 						String
 * 						Math
 * 						--------
 * 			==> method()
 * 			
 * 		=메소드명 => 식별자와 동일 
 * 					길이의 제한이 없다 => 의미를 부여
 * 					aaa(), bbb(), ccc()
 * 					getName(), getTitle()
 * 					setName()...
 * 		=매개변수 : 사용자 요청값 
 * 
 * 		메소드 종류
 * 	  리턴형		매개변수
 * 	 -----------------
 *  	O  		  O
 *  	==> String
 *  	String substring (int s)
 *  	String replace (String s1, String s2)
 * 	 ------------------
 * 		0		  X
 * 		String trim()
 * 		double random()
 *   --------------------
 *  	X 		  O
 *  	void println(String s)
 *  	void main(String[]arg)
 *  	-----결과값이 없는 경우 void 
 *   -------------------
 *   	X		  X
 *   	void println()
 *  --------------------- 
 */
public class 문제정리 {
	static void process1()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력:");
		int num=scan.nextInt();
		int[] binary=new int[16];
		int index=15;
		while(true)
		{
			binary[index]=num%2;
			num=num/2;
			if(num==0)
				break;
			index--;
		}
		for(int i=0;i<binary.length;i++)
		{
			if(i%4==0 &&i!=0)
				System.out.print(" ");
			System.out.print(binary[i]);
		}
		//System.out.println(Integer.toBinaryString(num));
	}
	static void process3()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("년도 입력:");
		int year=scan.nextInt();
		if((year%4==0&& year%100!=0)||(year%400==0))
			System.out.println(year+"년도는 윤년");
		else
			System.out.println(year+"년도는 윤년 아님");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process1();
		process3();
	}

}
