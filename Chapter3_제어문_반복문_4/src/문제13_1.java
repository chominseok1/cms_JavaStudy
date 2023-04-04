
public class 문제13_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=10;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1; i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1; i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=1; i<=5;i++)
		{
			char c='A';
			for(int j=1;j<=5;j++)
			{
				System.out.print(c++ +" ");
			}
			System.out.println();
			
		}
		System.out.println();
		char c='A';
		for(int i=1; i<=5;i++)
		{
			
			for(int j=1;j<=5;j++)
			{
				System.out.print(c +" ");
			}
			System.out.println();
			c++;
		}
	}

}
