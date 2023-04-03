import java.util.Scanner;
public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int a=scan.nextInt();
		if(a>=0)
		{
			System.out.println(a+"입니다");
		}
		else
		{
			System.out.println(-a+"입니다");
		}
		
//System.out.println(Math.abs(a)); **절대값
	}

}
