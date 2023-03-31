
public class 문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(Math.random()*100)+1;
		int b=(int)(Math.random()*100)+1;
		int c=(int)(Math.random()*100)+1;
		
		int total=a+b+c;
		double avg=total/3.0;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("total="+total);
		System.out.printf("평균:%.2f\n",avg);
		
		//최대값
		int max=a;
		if(max<b)
			max=b;
		if (max<c)
			max=c;
		System.out.println("최대값:"+max);
		// 최솟값
		int min=a;
		if(min>b)
			min=b;
		if(min>c)
			min=c;
		System.out.println("최솟값:"+min);
		

		
	}

}
