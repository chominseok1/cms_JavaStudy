
public class 문제8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=2; i<=100; i+=2)
		{
			sum+=i;
			System.out.println("sum="+sum+", i="+i);
		}
		System.out.println("총합은"+sum);
	}

}
