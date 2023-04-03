import java.util.Scanner;
public class 문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score=scan.nextInt();
		
		if(score>100&&score<0)
		{
			System.out.println("다시 입력하세요");
		}
		else
		{
			if(score>=90)
			
				System.out.println('A');
			else if(score>=80)
				System.out.println('B');
			else if(score>=70)
				System.out.println('C');
			else if(score>=60)
				System.out.println('D');
			else
				System.out.println('F');
				
		}
	
	}

}
