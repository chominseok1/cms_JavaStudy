package com.sist.main;
import static java.lang.Math.random; //스태틱인경우에는 메소드를 지정하고 갖다쓸수 있다
/*
 * import 패키지명.클래스명
 * import 패키지명.*  //패키지안에 모든것을 갖고 올떄
 * import static java.lang.Math.random;
 * java.lang.* => 자동 로딩이 된다 , import를 사용하지 않는다
 * -------------- String , Math
 * 
 * void method()
 * {
 * 	return; // 컴파일러가 자동으로 return이 설정 (생략이 가능)==> void에서만 메소드종료는 return에서
 * 	==> 중간에 return이 존재할때도 있다
 * }
 * class A
 * {
 * 	 A(){} // 자동으로 default 생성자 추가 되어있다
 * }
 */
// Math클래스는 지원하는 모든 메소드가 static
public class 클래스_메소드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a=(int)(random()*100)+1;
		//System.out.println(a);
		//return; void 일때 return 자동으로 설정
		int a=10;
		if(a%2==0)
		{
			System.out.println("a="+a);
			return;
		}
		System.out.println("1"); // 실행하면 1 2 3 안나옴 위에서 return으로 종료
		System.out.println("2"); // 필요시 리턴 중간에 
		System.out.println("3"); // 메소드 빠져나가는 건 return 반복문 break처럼
		return;
			
	}

}
