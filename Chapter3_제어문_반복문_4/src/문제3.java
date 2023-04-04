
public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0; //짝수합
		int b=0; //홀수합
		for(int i=1;i<=30;i++)
		{
			if(i%2==0)
			{
				a+=i;
			}
			else
			{
				b+=i;
			}
		}
		System.out.println("짝수합: "+a+" 홀수합"+b);
	}

}
