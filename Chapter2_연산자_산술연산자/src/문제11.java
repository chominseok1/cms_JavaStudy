
public class 문제11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int re=0;
		i=3;
		re = ++i;
		System.out.println("re:"+re+",i:" +i);
		i=3;
		re = i++;
		System.out.println("re:"+re+",i:"+i);
		/*
		 * re 4  
		 * 첫 출력 re:4, i: 4
		 * 두번째 출력 re:3 i:4
		 */
	}

}
