//정수 2개와 연산자(+,-,*,/)를 입력 받아 사칙 연산하는 프로그램을 만들어라 
  // (switch~case 사용) 

import java.util.Scanner;
public class 문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 두개 입력");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("연산자 입력");
		char c=scan.next().charAt(0);
		
		switch(c)
		{
		case '+':
			System.out.println("a+b="+(a+b));
			break;
		case '-':
			System.out.println("a-b="+(a-b));
			break;
		case '/':
			System.out.println("a/b="+(a/b));
			break;
		case '*':
			System.out.println("a*b="+(a*b));
			break;
			
		}

	}

}
