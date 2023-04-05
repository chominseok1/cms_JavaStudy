//10명의 컴퓨터 정수를 입력받아 배열에 저장하고 총점과 평균을 구하여 출력하는 프로그램을 작성 
import java.util.Scanner;
public class 문제12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int total=0;
		double avg=0;
		int[]a=new int[10];
		for(int i=0; i<10;i++)
		{
			System.out.println("정수 입력");
			a[i]=scan.nextInt();
			total+=a[i];
			avg=total/3.0;
		}
		for(int i=0; i<10;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("합: "+total);
		System.out.println("평균:"+avg);
	}

}
