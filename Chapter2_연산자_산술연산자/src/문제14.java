import java.util.Scanner;
public class 문제14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("숫자1 입력:");
		int num1=scan.nextInt();
		System.out.println("num1="+num1);
		System.out.print("숫자2 입력:");
		int num2=scan.nextInt();
		System.out.println("num2="+num2);
		
		int Uu= num1%num2;
		System.out.println("나머지:"+Uu);

	}

}
