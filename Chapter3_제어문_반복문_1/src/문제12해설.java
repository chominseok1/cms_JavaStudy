
public class 문제12해설 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=30;i++)
		{
			if(i%2==0)
			{
				System.out.printf("%2d\t",i); // \t일정간격
				if(i%3==0)
					System.out.println(' '); // 다음줄에 출력한다
			}
		}
	}

}
