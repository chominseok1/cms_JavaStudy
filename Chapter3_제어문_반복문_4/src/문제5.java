
public class 문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a7=0;
		int a9=0;
		for(int i=1; i<=1000; i++)
		{
			if(i%7==0)
			{
				a7+=i;
			}
			if(i%9==0)
			{
				a9+=i;
			}
		}
		System.out.println(a7+" "+a9);
		System.out.println(a7+a9);
	}

}
