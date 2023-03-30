import java.util.Scanner;
public class 문제13정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a,b,c;
		System.out.println("세개의 정수 입력 (10 20 30)");
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		
		System.out.printf("%d*%d+%d=%d",a,b,c,a*b+c);

	}

}
