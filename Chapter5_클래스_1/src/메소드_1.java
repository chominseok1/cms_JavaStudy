/*
 * 메소드
 * 	1) 구조화된 프로그램 (문장을 기능별로 나눠서 작업)
 * 	2) 반복 제거 ==> Spring(AOP)
 * 	3) 메소드는 한개의 기능만 수행
 * 	----------------------------------------
 * 	리턴형 : 처리후 결과값 (한개만 설정이 가능)
 * 	매개변수 : 사용자가 요청하는 값 (여러개 보낼 수 있다)
 * 			 =>3개이상이면 [],class
 * 형식)
 * 	  리턴형  메소드명(매개변수....)
 * 					--------------- 갯수와 상관없다 (사용자 요청값)
 * 	  -----  ------ 한 자바파일안에 모든 메소드명이 달라야 된다(x)
 * 					같은 메소드명이 있을 수 있다 (매개변수가 틀리면 된다)
 * 	  요청 결과값 (한개만) ==> 여러개 : int[],class
 * 
 * 	  ** 사용자가 요청한 값(매개변수)을 받아서 처리후에 결과값을 보내주거나 화면에 출력 => 메소드 역할
 * 															 --------- 
 * 		---------------------- 입력, 마우스 클릭 , 버튼 클릭...		|
 * 														결과값이 없는 상태(void)
 * 	뒤에서 받아서 쓰면 리턴형 안받으면 void형
 * 
 * 		정수 두개를 보내고 더한값을 받는다
 * 			=> return a+b
 * 			=> System.out.println("a+b="+(a+b)) 
 * 		단을 보내고 해당단의 구구단을 출력
 * 			=> 구구단은 자체출력이 편하다
 * 
 * 		main 메소드에서는 가급적이면 => 연결만 (변수 선언(x))
 */
// void 사용 자체에서 출력
// 구구단 => 단을 입력을 받아서 => 자체에서 출력이 가능
import java.util.Scanner;
public class 메소드_1 {
	//public static void main() // 오버로딩 같은 메소드를 갖고 새로운 매개변수
	//{
		
	//}
	//public static void main(int a)
	//{
		
	//}
	static void gugudan(int dan)
	{
		for(int i=1;i<=9;i++)
		{
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
		}
	}
	static void process()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("단을 입력:");
		int dan=scan.nextInt();
		
		gugudan(dan);
	}
	public static void main(String[] args) { //static 공유변수
		// TODO Auto-generated method stub
		process();
	}

}
