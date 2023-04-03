import java.util.Scanner;
public class 문제15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("2자리 정수를 입력해라:");
		int a=scan.nextInt();
		
		if(a>=10&& a<=99)
		{
			if(a%11==0)
				System.out.println("십의 자리 1의 자리 같다");
			else
				System.out.println("십의 자리와 1의자리가 같지 않다");
		}
		else
		{
			System.out.println("잘못된 입력");
		}
	}

}
