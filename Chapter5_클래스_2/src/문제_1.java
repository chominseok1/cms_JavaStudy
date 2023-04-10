import java.util.Scanner;

public class 문제_1 {
	//static boolean idCheck(String id)
	
		
	
	//static String[] postfind(String dong)
	
		
	//static void gugudan()
	static void num()
	{
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+" ");
		}
		
	}
	static void num1()
	{
		int sum=0;
		for(int i=0;i<=10;i++)
		{
			sum+=i;
		}
		System.out.println(sum);
	}
	static void num2()
	{
		Scanner scan=new Scanner(System.in);
		int sum=0;
		System.out.println("숫자를 입력하세요");
		int n=scan.nextInt();
		for(int i=0;i<=n;i++)
		{
			sum+=i;
		}
		System.out.println(sum);
	}
	static double div(double a, double b)
	{
		return a/b;
	}
	static void process()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력");
		double a=scan.nextInt();
		System.out.println("정수2 입력");
		double b=scan.nextInt();
		double res=0.0;
		res=div(a,b);
		System.out.println(res);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		num();
		num1();
		num2();
		process();
		
		/*String s="Hello Java";
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}*/
	}

}
