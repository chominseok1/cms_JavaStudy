
public class 문제1 {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		a=3;
		b=a+5;
		System.out.printf("a의값: %d\n", a);
		System.out.printf("b의값: %d\n",b);*/
		/*
		 * a의 값: 3
		 * b의 값: 8
		 * 1. 메모리 저장
		 * 2. System.out.println() => JDK 1.5 => C언어에서 도입 (printf())
		 * 	  서식이 있는 출력 
		 * 	%d => 정수값
		 * 	%f => 실수값
		 * 	%c => 문자
		 * 	%s => 문자열
		 * 
		 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int a=10;
			double d= 10.5;
			char c='A';
			System.out.println("a="+a+",d="+d+",c="+c);
			System.out.printf("a=%3d b=%4.1f c=%2c",a,d,c);
		
	}

}
