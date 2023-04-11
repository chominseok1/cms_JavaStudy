import java.util.Arrays;

public class 메소드재사용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {30,50,10,20,40};
		메소드조립법_1.sort(arr, 2);
		System.out.println(Arrays.toString(arr));
		메소드조립법_1.sort(arr, 1);
		System.out.println(Arrays.toString(arr));
	}

}
