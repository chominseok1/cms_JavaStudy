import java.util.Scanner;
public class 연습장 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("첫번째 정수 입력:");
		int num1=scan.nextInt();
		System.out.println("두번째 정수 입력:");
		int num2=scan.nextInt();
		System.out.println("세번째 정수 입력:");
		int num3=scan.nextInt();
		int total=num1+num2+num3;
		double avg=total/3.0;

		
		 if(num1>100||num2>100||num3>100) 
		 { 
			 System.out.println("제대로 입력하세요"); 
		 } 
		 else 
		 {
				System.out.println("num1 점수:"+num1);
				System.out.println("num2 점수:"+num2);
				System.out.println("num3 점수:"+num3);
				
				System.out.println("총점:"+total);
				System.out.printf("평균:%.2f\n",avg);
		  if(avg>=90) { System.out.println("A학점"); 
		  }
		  else if(avg>=80) 
		  {
		  System.out.println("B학점"); 
		  }
		  else if(avg>=70) 
		  { System.out.println("C학점"); 
		  }
		 else if(avg>=60) 
		 { System.out.println("D학점"); 
		 } 
		 else 
		 {
		  System.out.println("F"); 
		  } 
		  }
		 
		
	}

}
