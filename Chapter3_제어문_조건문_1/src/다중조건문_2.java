// 성적계산 프로그램=> Rank,정렬...
//세개의 정수를 받아서 평균을 구해서 => 등급출력
//다중 조건문 사용
/*
 *     >=90
 *     >=80
 *     >=70
 *     >=60
 *     --------- else
 *     Web 개발/ 호스팅(AWS) => 운영체제와 고정ip를 빌려서(Paas)
 *     ------------------------------------------------
 *     Java/Oracle/HTML/CSS/JavaScript/
 *     --------------------------------Spring/MyBatis/JPA
 *     Java: 데이터관리		프론트엔드
 *     oracle: 데이터 저장(공유)          			 MyBatis/JPA
 *     HTML/CSS: 브라우저에서 인식하는 언어      			Spring                  백엔드
 *     JavaScript:동정(클라이언트)					=>ReactJS/Ajax/VueJS
 */
import java.util.Scanner;
public class 다중조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		// System.in 키보드 입력값=> 입력값을 받아서 메모리에 저장해주는 역할
		//정수:nextInt() 실수:nextDouble(), nextBoolean()
		//next() : 문자열 => char는 존재하지 않는다
		// Scanner는 도스창에서만 사용이가능
		System.out.println("첫번째 정수 입력:");
		int num1=scan.nextInt();
		System.out.println("두번째 정수 입력:");
		int num2=scan.nextInt();
		System.out.println("세번째 정수 입력:");
		int num3=scan.nextInt();
		int total=num1+num2+num3;
		double avg=total/3.0;
		System.out.println("num1 점수:"+num1);
		System.out.println("num2 점수:"+num2);
		System.out.println("num3 점수:"+num3);
		
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f\n",avg);
		/*
		 * if(num1>100&&num2>100&&num3>100) { System.out.println("제대로 입력하세요"); } else {
		 * if(avg>=90) { System.out.println("A학점"); } else if(avg>=80) {
		 * System.out.println("B학점"); } else if(avg>=70) { System.out.println("C학점"); }
		 * else if(avg>=60) { System.out.println("D학점"); } else {
		 * System.out.println("F"); } }
		 */
		
		char score ='F'; //값이 변경이 없는 경우에 처리되는 값(default)
		if(avg>=90)
			score ='A'; //종료
		else if(avg>=80)
			score ='B'; //종료
		else if(avg>=70)
			score ='C';//종료
		else if(avg>=60)
			score ='D';//종료
		else // 생량가능
			score = 'F';
		System.out.println("학점:"+score);
	}

}
