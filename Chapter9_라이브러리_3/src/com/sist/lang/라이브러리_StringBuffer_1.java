package com.sist.lang;
// append() => 데이터 수집 , delete() , insert()
// delete, insert => 원본 변경
// substring => 원본의 변경이 없다
public class 라이브러리_StringBuffer_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("홍길동입니다");
		sb.delete(3, 6); // endIndex는6-1까지 delete(int s, int e) => e-1 
		System.out.println(sb.toString());
		
		sb.insert(3, "입니다"); //자체변경 (append delete insert)
		System.out.println(sb.toString());
		
		
		String s=sb.substring(3); //자체 변경이 되지 않는다 (새로운 메모리에 저장) 원본이 안바뀜
		System.out.println(s);
		System.out.println(sb.toString()); 
	}

}
