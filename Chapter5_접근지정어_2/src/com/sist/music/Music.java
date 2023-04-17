package com.sist.music;
/*
 * 1. 재사용
 * 	  = 상속 => is-a
 * 		기존의 클래스를 확장해서 사용
 * 					-----
 * 				   extends
 * 		=> 자바는 단일 상속만 가능하다
 * 				-------
 * 		class A
 * 		class B extends A A클래스를 확장해서 사용
 * 		class C extends JFrame(윈도우) ==> 상속으로 라이브러리에서 제공하는 클래스 많이 받음
 * 		----------------------------------------------------------------
 * 		class A
 * 		class B
 * 		class C extends A,B =>이렇게 쓰면(C언어) 오류 자바는 단일 상속이기에
 * 		C=A+B+알파
 * 
 * 		class A
 * 		class B extends A  얘가 A꺼를 받고
 * 		class C extends B  얘가 C꺼를 받는 형식으로 
 * 		------------------------------------
 * 		
 * 		class A(int a,b,c,d)  16byte 데이터가 많다고 큰게 아님
 * 		class B(int a,b) 8byte
 * 		A > B 이러면 오류
 * 		--------- A와B는 다른 클래스 => 크기를 가지지 않는다
 * 		float > long
 * 
 * 		class A(int a,b)
 * 		class B(int c) extends A
 * 					   ---------- int a,b,c
 * 		A > B => 상속을 내리는 클래스가 크다
 * 		
 * 			동물 
 * 			 |
 * 		------------
 * 		|    |     |
 * 	  포유류  양서류  조류
 * 		|
 * 	   인간 //남자는 인간'이다' 인간은 포유류'이다' 포유류는 동물'이다'
 * 		|
 * 	  ----
 * 	  |  |
 * 	 남자	 여자	
 * 	 형변환 남자m=(남자)인간; **** 형변환 중요 계속 나올거임
 * 		*** 모든 클래스는 Object 상속을 받고 있다
 * 			Object => 모든 클래스 최상위 클래스
 * 		*** 상속의 예외 조건
 * 			생성자 , static , private, 초기화 블록
 * 	  = 포함 => has-a (얘를 많이 씀****)
 */
public class Music {
	private int rank;
	private String state;
	private String title;
	private String singer;
	private String album;
	private int idcrement; //등폭
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public int getIdcrement() {
		return idcrement;
	}
	public void setIdcrement(int idcrement) {
		this.idcrement = idcrement;
	}
	
}
