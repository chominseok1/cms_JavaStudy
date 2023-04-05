//10개의 정수를 입력받아 그 중 가장 큰 수를 출력하는 프로그램

import java.util.Scanner;

public class 문제11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int [] a=new int[10];
		for(int i=0; i<a.length; i++)
		{
			System.out.println("정수 입력해라");
			a[i]=scan.nextInt();
		}
		int max=a[0];
		for(int i:a)
		{
			if(max<i)
				max=i;
		}
		System.out.println("최댓값"+max);
	}

}
