import java.util.Scanner;
public class 문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int a=scan.nextInt();
		
		if(a>=60)
		{
			System.out.println("합격");
		}
		else 
		{
			System.out.println("불합격");
		}
	}

}
