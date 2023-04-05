import java.util.Arrays;

public class 배열_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//확장
		int[] arr1= {10,20,30,40,50};
		int[] arr2=new int[10];
		System.arraycopy(arr1, 0, arr2, 0, arr1.length); //밑에 복사 주석이랑 동일
		//0 ,1 ,2...
		System.out.println(Arrays.toString(arr2));
		//	int[] arr3=new int[10];
		//for(int i=0;i<arr1.length;i++)
		//{
			//arr3[i]=arr1[i];
		//}
	}

}
