import java.util.Scanner;
public class 문제16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("몇 월?");
		int a=scan.nextInt();
		
		if(a>=3&&a<=5)
		{
			System.out.println(a+"는 봄");
		}
		else if(a>=6&&a<=8)
		{
			System.out.println(a+"는 여름");
		}
		else if(a>=9&&a<=11)
			System.out.println(a+"는 가을");
		else if((a>=1&&a<=2)||(a==12))
			System.out.println(a+"는 겨울");
		
		System.out.println("================");
		System.out.println("몇월인가요?");
		int month=scan.nextInt();
		switch(month)
		{
		case 12: case 1: case 2:
			System.out.println("겨울");
			break;
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
		}
	}

}
