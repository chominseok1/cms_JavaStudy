package com.sist.io;
/*
 *  IO : Input/ Output
 *  			------쓰기
 *  	 ----읽기
 *  1) 자바에서 IO는 Stream을 사용하고 있다
 *  			  ------ 데이터 이동하는 통로 (FIFO=>Queue)
 *  	=> IO
 *  		=메모리 입출력
 *  		= 파일 입출력
 *  		= 네트워크 입출력
 *  	=> IO의 특징 : 단방향 통신=> 빨대
 *  2) 읽기/쓰기(1byte,2byte)
 *  	= 1byte => ~InputStream , ~OutputStream
 *  				=> 한글자당 1byte 읽기/ 쓰기 => 한글은 깨진다
 *  				=> 업로드, 다운로드
 *      = 2byte => ~Reader , ~writer
 *      			=> 한글제어
 *      ------------------- 							 --------------
 *       메모리 (데이터저장)    ========== 자바응용프로그램======== 모니터 출력
 *       ------------------								 ---------------
 *       				   |							|
 *       			   InputStream				 OutputStream
 *    356page
 *    -------
 *   	Stream : 데이터가 이동하는 통로(단방향)
 *   			 읽기 통로: 데이터가 저장된 위치로부터 프로그램에서 데이터를 읽어 들이기 위한 연결
 *   					  InputStream(바이트 스트림:1byte씩 이동) / Reader(문자 스트림: 2byte)
 *   														  --------- 한글쓸때 reader
 *   					  메모리에 있는 데이터
 *   					  파일에 있는 데이터
 *   					  소켓에 있는 데이터 (네트워크)
 *   				
 *   			 쓰기 통로 : 출력위치로 프로그램에 전송하는 통로
 *   					  OutputStream(바이트 스트림:1byte) / Writer(문자 스트림: 2byte)
 *   	IO관련 클래스
 *   		Object
 *   		  |
 *   	 바이트 스트림 (1byte)            문자 스트림(2byte)
 *   	------------------------------------------
 *   	|										 |
 *    ------------------						파일 입출력 (추천)
 *    	***업로드/다운로드					    ---------------------
 *    |			  		|					|					|
 *    InputStream OutputStream		  		Reader			  Writer
 *    	|				|					 |					|
 *    FileInputStream  FileOutputStream		FileReader		  FileWriter
 *    FilterInputStream FilterOutputStream	  |					|
 *    	|					|				BufferedReader		BufferedWriter  Buffered:최적화
 *    BufferdInputStream  BufferedOutputStream
 *    ---------------------------------------
 *    ObjectInputStream / ObjectOutputStream
 *    
 *    *** 모드(mode) => r, w, a
 *    				  read, write, append
 *    				  ----	-----
 *    				  Reader Writer로 구분 append는 구분이 안되어있어서
 *    				
 *    				=> new FileWriter("파일명",true) => append (회원가입)
 *    				=> new FileWriter("파일명") => create  (장바구니)
 *    -------------------------------------------------------------
 *    File : 독립 클래스
 *    ==> 1) 파일
 *    	  2) 디렉토리 (폴더)
 *    	
 *    	  File 사용방법
 *    		생성방법
 *    		File file=new File("c:\\javaDev\\back.png")
 *    			파일 정보 읽기
 *    		File file=new File("c:\\javaDev\\")
 *    			디렉토리 정보 읽기
 *    	  File의 주요기능(메소드)
 *    		= 파일 정보
 *    		 *** getName() : 파일명
 *    		 *** getPath() : 경로명/파일명
 *    		  getParent() : 경로명
 *    		= 파일 특성 : boolean
 *    		  canRead() : 읽기 전용
 *    		  canWrite() : 쓰기 전용
 *    		  isHidden() : 숨긴 파일
 *    		= 파일 여부 확인
 *    		 *** boolean isFile()
 *    		 *** boolean isDirectory()
 *    		= 파일 조작
 *    		 *** createNewFile() 파일 만들기
 *    		 *** mkdir() : 디렉토리 만들기
 *    		= 파일 삭제
 *    		 *** delete() => 한개만 (파일이 있는 디렉토리는 삭제 못함)
 *    							=> 파일을 먼저 삭제 => 디렉토리삭제
 *    		= 파일이나 디렉토리의 존재여부
 *    		 *** boolean exists()
 *          = 수정날짜
 *            long lastModified()
 *          = 파일 크기
 *           *** long length()
 *          = 디렉토리에 있는 목록 읽기
 *           *** listFiles()
 *     => read() write() close()
 *     
 *     FileInputStream
 *     -----------------
 *     	int read()  write(byte)
 *     FileReader
 *     	char read()	write(String)
 */
// CheckedException => 반드시 예외처리를 해야 사용이 가능
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
public class InputOutputMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 파일 선언
		File file=new File("c:\\javaDev\\back.jpg");
		long size=file.length();
		String res="";
		if(size/1024==0)
		{
			res=size+"Bytes";
		}
		else
		{
			size=size/1024;
			res=size+"KB";
		}
		System.out.println("파일크기:"+res);
		System.out.println("읽기 전용:"+file.canRead());
		System.out.println("쓰기 전용:"+file.canWrite());
		System.out.println("숨긴파일:"+file.isHidden());
		System.out.println("수정날짜:"+new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초").format (new Date(file.lastModified()))); 
		//java.util //file.lastModified() long형 => new Date() 날짜로 바뀜
		System.out.println("경로명:"+file.getParent()); //경로명
		System.out.println("파일명:"+file.getName()); //파일명
		System.out.println("경로명+파일명:"+file.getPath()); //경로명+파일명
	
		
	}

}
