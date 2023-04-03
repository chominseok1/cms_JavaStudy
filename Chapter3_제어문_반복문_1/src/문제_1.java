//Scanner 클래스를 이용하여 한 개의 정수를 입력 받아 양수인지 음수인지 판별하여 출력하라
import java.util.Scanner; //라이브러리, 사용자 정의
//=>클래스가 다른 폴더에 저장된경우
//import가 생략이 가능한 라이브러리 =>java.lang.*
//Math,String,Object...
/*
 * java.util
 * java.text
 * java.io
 * java.net
 * ---------
 * java.sql ==> 1.0
 * javax~~ ==>1.2 web
 * 기타 => 외부에서 만든 라이브러리 =>org/com
 * 
 */
public class 문제_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int a=scan.nextInt();
		
		if(a==0)
		{
			System.out.println("0입니다");
		}
		else 
		{
			if(a>0)
			
				{
				System.out.println("양수");
				}
			else
			{
				System.out.println("음수");
			}
		}

	}

}
