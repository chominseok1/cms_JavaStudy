import java.util.Arrays;
import java.util.Scanner;

public class 문제 {
	static void process1()
	{
		
	}
	static void process2()
	{
		int[]arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		sort(arr,1);
		System.out.println("정렬후(ASC):"+Arrays.toString(arr));
		sort(arr,2);
		System.out.println("정렬후(DESC):"+Arrays.toString(arr));
	}
	static void process3()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력:");
		int year=scan.nextInt();
		//메소드 호출
		//isYear(year);
		//호출시에는 실제 데이터값을 전송
		boolean bCheck=isYear2(year);
		if(bCheck==true)
			System.out.println(year+"년도는 윤년이다");
		else
			System.out.println(year+"년도는 윤년이 아닙니다");
	}
	static void sort(int[]arr,int n)
	{
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				boolean bCheck=false;
				if(n==1)
				
					bCheck=arr[i]>arr[j];
					else
						bCheck=arr[i]<arr[j];
				if(bCheck)
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
					
					
			}
		}
	}
	static void isYear(int year)
	{
		if((year%4==0&& year%100!=0)||(year%400==0))
			System.out.println(year+"년도는 윤년");
		else
			System.out.println(year+"년도는 윤년 아님");
	}
	
	static boolean isYear2(int year)
	{
		boolean bCheck=false;
		if((year%4==0&& year%100!=0)||(year%400==0))
			bCheck=true;
	
		return bCheck;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process2();
		process3();
	}

}
