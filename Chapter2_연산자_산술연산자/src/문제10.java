
public class 문제10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int num1 = 2;
	    int num2 = 7;
	    int num3; 
	    int num4; 
	    num1++; 
	    num3 = --num1; 
	    --num2; 
	    num4 = num2++; 
	    System.out.printf("%d\n", num3);
	    System.out.printf("%d\n", num4); 
	    // num1:2 num3:2 num2:7 num4: 6
	    //답: 2
	    //   6
	}

}
