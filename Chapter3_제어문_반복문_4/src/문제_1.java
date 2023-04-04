
public class 문제_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a7=0; //합
		int c7=0; //갯수
		
		for(int i=100;i<=999;i++)
		{
			if(i%7==0)
			{
				a7+=i;
				c7++;
			}
		}
		System.out.println(a7+" "+c7);
		
	}

}
