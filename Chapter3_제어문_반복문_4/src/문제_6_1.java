import java.util.Scanner;
public class 문제_6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("첫번째정수입력:");
		int start=scan.nextInt();
		//System.out.println("두번째정수입력:");
		//int end=scan.nextInt();
		int end=0;
		while(true)
		{
			System.out.println("두번째정수입력:");
			end=scan.nextInt();
			if(end<start)
			{
				System.out.println("첫번째 정수보다 큰 수여야 합니다");
				continue;
			}
			break;
		}
		int gop=1;
		for(int i=start;i<=end;i++)
		{
			gop*=i;
		}
		System.out.println(start+"부터"+end+"까지의 합:"+gop);
	}

}
