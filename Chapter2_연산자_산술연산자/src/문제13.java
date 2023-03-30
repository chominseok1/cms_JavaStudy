import java.util.Scanner;

public class 문제13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("숫자1 입력:");
		int num1=scan.nextInt();
		System.out.println("num1="+num1);
		System.out.print("숫자2 입력:");
		int num2=scan.nextInt();
		System.out.println("num2="+num2);
		System.out.print("숫자3 입력:");
		int num3=scan.nextInt();
		System.out.println("num3="+num3);
		
		int Ms=num1*num2+num3;
		System.out.println("num1*num2+num3:"+Ms);
		

	}

}
