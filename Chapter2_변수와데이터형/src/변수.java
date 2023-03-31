/*
 * 	1장 자바의 특징
 * ---------------
 * 	1) 특징
 * 		= 운영체제의 독립적 (모든 운영체제의 호환성이 좋다)
 * 		  예) 윈도우에서 작성 => 리눅스에서 사용이 가능
 * 		  C/C++ => 소스 작성 ==> 컴파일 (컴퓨터가 인식하는 언어로 변경)
 * 								.obj
 * 								운영체제마다 다르다
 * 		  Java => 소스 작성 ==> 컴파일
 * 								.class 운영체제마다 동일한 파일 생성 
 * 		  ** 자바 실행
 * 		 A.java ==========> A.class ========> 실행 화면 출력
 * 			  컴파일(javac)	바이트(2진파일) 인터프리터(java)
 * 			  두번의 검증을 거친다 (보안이 뛰어나다)
 * 		***(핵심) = 객체 지향 프로그램 (재사용 편리한 상태) => 유지보수 (대규모 프로그램)
 * 		  재사용 : 수정 , 추가 , 데이터 보호 (캡슐화) ==> 5장에서
 * 				---------- 오버라이딩/오버로딩
 * 				포함 (수정할 내용이 없는 경우)  =>  has-a
 * 				상속 (수정할 내용이 있는 경우)  =>  is-a
 * 		= 비교적 배우기 쉽다
 * 		  C/C++에서 파생 => 포인터(메모리 주소),구조체 , 다중 상속, 지원하는 API가 미약
 * 			=> 자바언어 => 강력한 API를 가지고 있다 (필요한 기능이 이미 제작)
 * 				=> 조립식 (자바 공부 => 직접 구현)
 * 		= 자동 메모리 관리 (가비지 컬렉션)
 * 		= 네트워크 / 분산 / 멀티쓰레드 기능을 가지고 있다 
 * 	  2. 소스 코딩 방법
 * 		 주석 : //  => 번역이 안된다 (프로그래머만 보는 상태)
 * 		 프로그램은 명령어(JVM) => ;
 * 		 대소문자를 구분한다 a/A 다름
 * 		 {}을 사용
 * 		 들여쓰기 
 * 		 == 구성요소
 * 			***1) 클래스명: 첫자는 대문자
 * 			***2) 변수: 소문자 시작
 * 			***3) 상수: 전체가 대문자
 * 			4) 메소드: 소문자
 * 			5) 생성자: 클래스명과 동일
 * 		공부
 * 		1) 데이터 저장 방법 : 변수/ 상수
 * 			----------- 메모리 저장 (메모리 크기 결정) => 기본형(데이터형)
 * 			----------- 사용자 정의 : 참조형(배열,클래스)
 * 		2) 데이터 가공
 * 			연산자 / 제어문
 * 		-------------------------------------- 기본 문법
 * 		3) 관련된 데이터를 모아서 관리: 배열
 * 		4) 관련된 명령어를 모아서 관리: 메소드
 * 		5) 데이터/명령어를 동시에 관리 : 클래스
 * 		6) 객체 지향 프로그램
 * 		7) 프로그램이 비정상 종료를 방지 / 오류를 처리 = 예외처리
 * 		=============================================== 자바기본
 * 		8) 자바에서 지원하는 라이브러리
 * 	  3. 자바의 구성
 * 		 package : 한번만 사용 => 위치
 * 		 import: 기존에 만들어진 클래스를 불러온다 (여러개)
 * 		 ----------------------------------------
 * 		 class ClassName{
 * 			-----------------
 * 				변수 설정
 * 			-----------------
 * 				생성자
 * 			-----------------
 * 				메소드
 * 			-----------------
 * 			프로그램의 시작점
 * 			public static void main(String[] args) 
 *  		{
					기본 문법
			}
 * 		 }
 * 		1. 기본 형식 2. 활용 (알고리즘)
 * 
 * 		*** 변수
 * 		=>한개의 데이터를 저장하는 메모리 공간 
 * 		=> 사용법
 * 		   데이터형 변수명=값;
 * 		   -----
 * 		=> 변수명 식별자 : 변수 => 같은 이름을 사용할 수 없다
 * 		   1) 알파벳, 한글 시작한다 (알파벳은 대소문자를 구분한다)
 * 			  a/A
 * 		   2) 숫자 사용이 가능하다 (단 맨앞에 사용금지)
 * 				a2, a3 ... 이런식으로 써야함 2a 안돼
 * 		   3) 특수문자 사용이 가능 (_ , $)
 * 				a_b , _a... (임시변수, 단어가 2개인 경우)
 * 				file_name , fileName
 * 		   4) 키워드는 사용 할 수 없다 (자바에서 사용하는 단어)
 *			  => 빨간색으로 표시
 *		   5) 길이는 제한이 없다 => (3글자~7글자) 정도로 쓰기
 *			  변수 => 의미가 약간 부여
 *			  a => id , name ... address , phone... 이런식으로 알아볼 수 있게
 *		   ============================================================
 *			과일 가게에는 사과5 , 배 10, 바나나 7, 딸기 1
 *		저장시에는 반드시 앞에 메모리 크기 지정 
 *		기본형(자바에서 지원)
 *		참조형(사용자 정의) => 배열/클래스 
 *		---------------------------------
 *		기본형
 *		----
 *		 정수 저장 방법
 *			1byte => byte byte a=10; //네트워크 전송 , 파일 읽기...
 *			2byte => short // C언어와 호환
 *			4byte => int 평상시에 사용하는 모든 정수 (default)
 *			System.out.println(100)
 *			8byte => long
 *		 실수 저장 방법
 *			4byte => float ==> 소수점 6자리
 *			8byte => double (default) ==> 소수접 15자리
 *			10.5F 10.5D(생략이가능)
 *		 문자 저장 방법
 *			2byte => char
 *			 => 1byte(싱글바이트 =>ASC) / 2byte(멀티바이트 => Unicode)
 *			*** 한글이나 중국,독일,일본 .. 한글자당 바이트가 2byte
 *			byte => bit(8) => 256문자
 *			byte => bit(16) => 65535문자 사용이 가능
 *			UTF-8
 *			각문자마다 번호
 *		 논리 저장 방법
 *				true/false만 저장 => 1byte =>boolean
 *		 자동 지정 (jdk 10이상)
 *			 var a=10 => a: int
 *			 var b=10.5 => b: double
 *			 var c='A' => c:char
 *		=> 저장이 가능한 데이터
 *		byte => -128~127
 *		1byte
 *      128   64    32   16    8    4     2    1(0)       
 *		---------------------------------------------
 *		 0	ㅣ  1  ㅣ 1  ㅣ 1  ㅣ 1  ㅣ 1  ㅣ 1  ㅣ 1  ㅣ
 *		---------------------------------------------
 *		      64+32+16+8+4+2+1 ==>127
 *		부호비트 (0:양수, 1:음수)
 *		
 *		2byte => -32768~32767 =>short
 *
 *		4byte => -21억 4천~21억4천 ==> int
 *
 *		8byte ===> long 
 *		변수
 *		데이터형 변수명=값;    int a=10;           // 실제 저장된 값: 리터럴 => 여기서는 10 저장되는 공간: 변수 a int: 데이터 타입
 *      ----------------------------
 *      
 *      값을 부여 크기에 맞게 지정한다. //long a=1000000000000L; // 일반적으로 숫자는 int 인데 int 범위를 벗어나면 데이터타입 long 을 쓰고 숫자뒤에 l을 붙임 l L 대소문자 상관X
 *      
 *      int a=10.5 ==> 오류       
 *      --- -------
 *      4      8(double)
 *      
 *      데이터형 크기
 *      byte< short< int< long< float< double //실수형은 정수형보다 크다.
 *      	  char
 */
public class 변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int Ab;
		//Ab=10; // 실제 저장된 값: 리터럴 => 여기서는 10 저장되는 공간: 변수 a int: 데이터 타입
		//System.out.println(Ab);
		/*int a=123456;
		double b=123456.78;
		int c=(int)((b-a)*100);
		System.out.println(c);*/
		//모든 숫자는 int 인식
		//*****
		byte byte_value=127; // -128~127 =은 대입연산자 계산순서: 오른쪽에서 왼쪽이동 ****
		// 127을 byte_value라는 공간 첨부해라  
		short short_value=32767; //-32768~32767
		//*****
		int int_value=2140000000; //*****
		//*****
		long long_value=9999999999999L; //크면 long 범위 넘으면 l(L) 붙이기 *****
		// int/long의 구분은 l(L)
		char char_value='홍';
		float float_value=10.5F;// float은 f(F)붙이기
		//*****
		double double_value=10.5; // 초기값 D(d)는 생략 가능 *****
		//*****
		boolean boolean_value=true; //true/false *****
		//모든 정수는 int
		//모든 실수는 double
		//지역변수는 반드시 초기값을 부여한 후에 사용이 가능
		/*
		 *  변수
		 *   = 멤버변수
		 *   = 공유변수
		 *   ---------------------- 프로그램 종료시까지 메모리 유지
		 *                          => 자동 초기화
		 *   = 지역변수
		 *   
		 *   ---------------------- 블록이 종료되면 사라지는 변수
		 *   						=> 직접 초기화
		 *   
		 *   
		 *   class A
		 *   {
		 *   	--------
		 *   	--------
		 *   	public static void main(String[] arg)
		 *   	{
		 *   		---------
		 *   		지역변수 main(){}안에서 사용이 가능하다 => 지역변수는 반드시 초기화를 한다
		 *   		---------
		 *   	}
		 *   }
		 *   변수 => 변경이 가능
		 *   상수 => 변경할 수 없다 (고정)
		 */
		// 변수 => 데이터형 변수명=값 int a=10;
		// 상수 => 데이터형 변수명=값 final int B=20; final 붙어있으면 상수
		int kor=80;
		kor=90;
		kor=100;
		
		final int SCORE=70; //final 붙으면 상수 변경 불가능 고정 변수도 대문자로
		// = 대입 , == 같다 != 같지않다
		//(JavaScript) => = ,===, !==
		//오라클 같다 (=)
		/*
		 * 변수
		 * 선언
		 * 초기화
		 * 
		 * 선언
		 * int a;
		 * a=10;
		 * 
		 * => 선언과 동시에 초기화
		 * 		int a=10;
		 * 
		 * => int a;
		 * 	  int b;
		 *    int c;
		 *    	==> int a,b,c;
		 *    int a=10;
		 *    int b=20;
		 *    int c=30;
		 *    ==> int a=10,b=20,c=30;
		 *    
		 *    int a=10;
		 *    long b=20;
		 *    double c=10.5;
		 *        
		 */
		// 자동 지정 변수 (데이터형이 무엇인지 모를때 var 사용)	
		/*
		 * var a = 100; //int a=100; a=200 int로 들어온거 a=200; var b=10.5; //double b=10.5;
		 * var c= 'A'; // char c='A' c=97; // char는 int와 호환 그래서 들어올수있음
		 * System.out.println(c); System.out.println(b);
		 */
		int a= 10;
		int b=20;
		int temp=a;
		a=b; //a=20
		//10+"20"=1020
		b=temp; //b=10 
		System.out.println("a="+a);
		System.out.println("b="+b);
		/*
		 *  int a=100;
		 *  a= 200;
		 *  a=300;
		 *  a=400;
		 *  a=500;
		 * 
		 */
		
	}

}
