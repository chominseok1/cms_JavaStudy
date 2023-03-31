//정수 한 개를 입력받아서, 그 수가 50 이상의 수인지 50미만의 수인지 
         //판단해보자.
import java.util.Scanner;
public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("num=");
		int num=scan.nextInt();
		if (num>=50)
			
			System.out.println("50이상의 정수");
			
			else
			System.out.println("50미만의 정수");
	}
	}


//int num=(int)(Math.random()*100)+1