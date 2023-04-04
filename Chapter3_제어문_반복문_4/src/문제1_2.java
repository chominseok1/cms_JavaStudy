import java.util.Scanner;

public class 문제1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("숫자 입력하세요");
		int x=scan.nextInt();
		if(x>=10&&x<=20)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}

}
