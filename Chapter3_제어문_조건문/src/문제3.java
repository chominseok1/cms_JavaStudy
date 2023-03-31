/*
 * if(score<0 || score>100
 * {
 * 경고
 * }
 * else
 * {
 * 	i
 * 
 */
import java.util.Scanner;
public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("학년 입력:");
		int hak=scan.nextInt();
		System.out.println("점수 입력:");
		int score=scan.nextInt();
		if(score<0|| score>100)
		{
			System.err.println("잘못된 입력");
		}
		else
		{
			if(hak==4)
			{
				if(score>=70)
					System.out.println("합격");
			}
			else
			{
				System.out.println("불합격");
			}
		}
		
		{
			if(score>=60)
				{
				System.out.println("합격");
				}
			else
			{
				System.out.println("불합격");
			}
		}
	}	
		
	}
