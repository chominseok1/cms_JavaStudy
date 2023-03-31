
public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=(int)(Math.random()*2);
		char ch;
		if(no==0)
			ch=(char)((Math.random()*26)+65);
		else
			ch=(char)((Math.random()*26)+97);
		if(ch>='A' && ch<= 'Z')
			System.out.println(ch+"는(은)대문자");
		else
			System.out.println(ch+"는(은)소문자");
	}

}
