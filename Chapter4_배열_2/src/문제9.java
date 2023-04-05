//문자 10개를 저장할 수 있는 배열을 선언하고 10개의 문자를 입력받아 입력받은 문자를 이어서 출력하는 프로그램 
import java.util.Scanner;
public class 문제9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		char[] c=new char[10];
		for(int i=0; i<c.length;i++)
			{
			System.out.println("문자 입력해라");
			c[i]=scan.next().charAt(0);
			}
		for(char i:c)
		{
			System.out.print(i+" ");
		}
	}

}
