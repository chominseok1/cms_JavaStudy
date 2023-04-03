
public class 문제12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		for(int i=2; i<=30; i+=2)
		{
			a++;
			switch(a)
			{
			case 1:
				System.out.print(i+ " ");
				break;
			case 2:
				System.out.print(i+ " ");
				break;
			case 3:
				System.out.println(i+ " ");
				a=0;
				break;
			}
			
		}
	}

}
