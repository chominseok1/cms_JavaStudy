import java.util.Arrays;

/*
 *  버블 정렬 : 인접한 데이터끼리 비교 
 *  => 선택정렬 : 앞에서부터 정렬
 *  => 버블정렬 : 뒤에서 부터 정렬
 *  
 *  40 30 10 50 20 => ASC
 *  -- --
 *  30 40
 *     -- --
 *     10 40
 *        -- --
 *        40 50
 *           -- --
 *           20 50(고정)   0번일 때 바퀴수 4
 *  -----------------
 *  30 10 40 20 50
 *  -- --		*
 *  10 30
 *     -- --
 *     30 40
 *     	  -- --
 *        20 40(고정)     1번일 때 바퀴수 3
 * -------------------
 * 10 30 20  40 50
 * 			  *  *
 * -- --
 * 10 30
 *    -- --
 *    20 30(고정)         2번일 때 바퀴수 2
 * -----------------
 * 10 20 30 40 50
 * 		  * *  *
 * -- --
 * 10 20(고정)           3번일때 바퀴수 1
 * ------------------
 * 10 20 30 40 50
 * --
 * 
 * i=0 j=4
 * i=1 j=3
 * i=2 j=2
 * i=3 j=1
 * ---------- i+j=4 ==> j=4(length-1)-i
 */
public class 배열응용_알고리즘_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		for(int i=0; i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("===========정렬전==============");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("===========정렬후==============");
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				// i=0 일때 j=4바퀴
				//i=1 일때 j=3바퀴
				//i=2 일때 j=2바퀴
				//i=3 일때 j=1바퀴
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
