//한 개의 정수를 입력 받아 3의 배수인지 판별하여 출력하라
public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(Math.random()*100)+1;
			System.out.println("숫자는 "+a);
		if(a%3==0)
		{
			System.out.println(a+" 는3의배수입니다.");
		}
		else
		{
			System.out.println(a+" 는 3의배수가 아닙니다");
		}
	}

}
