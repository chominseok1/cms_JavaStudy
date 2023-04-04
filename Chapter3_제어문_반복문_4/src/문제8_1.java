
public class 문제8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=3;i<=4462;i++)
		{
			if(i%2==0)
				sum+=i;
		}
		System.out.println("3이상 4462 이하에서 짝수의 합"+sum);
	}

}
