import java.util.Arrays;

public class 배열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {10,20,30,40,50};
		//		arr[0] arr[1] arr[2] arr[3] arr[4]
		//arr[0] 첫번째 => 값읽기/값변경 가능 => 변수와 동일
		//1. 배열의 크기를 출력
		//2. 3번째 값을 300
		//3.5번재를 출력
		System.out.println(arr.length);
		arr[2]=300;
		System.out.println("arr[2]: "+arr[2]);
		System.out.println(Arrays.toString(arr));
		System.out.println("arr[5]: "+arr[4]);
	}

}
