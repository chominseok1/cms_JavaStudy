//5개 정수를 입력받은 후 차례로 출력하는 프로그램 
import java.util.Arrays;
import java.util.Scanner;
public class 문제8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int[] a=new int[5];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("정수를 입력하세요");
			a[i]=scan.nextInt();
			
		}
		for(int i=0; i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		System.out.println(Arrays.toString(a));
	}

}
