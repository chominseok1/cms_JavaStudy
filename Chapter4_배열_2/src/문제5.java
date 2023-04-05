/*
 * 1) 10개의 문자를 가지는 배열 c를 생성하는 코드를 한 줄로 쓰라.
​
2) 0에서 5까지 정수 값으로 초기화된 정수 배열 n을 선언하라.
​
3) '일', '월', '화', '수', '목', '금', '토'로 초기화된 배열 day를 선언하라.
​
4) 4개의 논리 값을 가진 배열 bool을 선언하고 true, false, false, true로 선언하라.

 * 
 *
 */
import java.util.Arrays;

public class 문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c=new char[10];
		int[] n= {0,1,2,3,4,5};
		char[] day= {'일','월','화','수','목','금','토'};
		boolean[]bool= {true, false, false, true};
		System.out.println(Arrays.toString(n));
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(day));
		System.out.println(Arrays.toString(bool));
		char[] alpha = {'a', 'b', 'c', 'd'};

		for(int i=0;i<alpha.length;i++)
		     System.out.print(alpha[i]);
		System.out.println();
		//for(char c:alpha)
		//{
			//System.out.print(c)
		//}

	}

}
