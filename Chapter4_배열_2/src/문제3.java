/*다음 중 배열 선언이 잘못된 것은  4번
 * 1) int[] n = {1, 2, 3, 4, 5};
2) int n[] = {0};
3) int[] n = new int[3];
4) int n[3] = new int[3];
		---- x
		데이터형
		-----
		  기본형 : int....
		  int[]
		  -----
		  문제3 사용자 정의 데이터형
 * 
 * 
 * 
 * 
 * 
 */
public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alpha = {'a', 'b', 'c', 'd'};

		for(int i=0;i<alpha.length;i++)
		     {
			System.out.print(alpha[i]);
		     }

	}

}
