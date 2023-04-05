//정수 10개를 입력받은 후 세번째, 다섯번쨰와 마지막으로 입력받은 정수를 차례로 출력하는 프로그램 
import java.util.Scanner;
public class 문제10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int [] a=new int[10];
		for(int i=0; i<a.length; i++)
		{
			System.out.println("정수 입력해라");
			a[i]=scan.nextInt();
		}
		for(int i=0; i<1; i++)
		{
			System.out.println(a[2]+","+a[4]+","+a[9]);
		}
		System.out.println("차례로: "+a[2]+a[4]+a[a.length-1]);
	}

}
