
import java.util.Scanner;
public class 문제11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("숫자 입력");
		int a=scan.nextInt();
		int sum=0;
		for(int i=1; i<=a; i++)
		{
			sum+=i;
		}
		System.out.println("1부터 "+a+"까지의 합: "+sum);
	}

}
