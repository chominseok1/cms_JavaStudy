
public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a4=0; //합
		int c4=0; //갯수
		
		for(int i=100;i<=999;i++)
		{
			if(i%4!=0)
			{
				a4+=i;
				c4++;
			}
		}
		System.out.println(a4+" "+c4);
	}

}
