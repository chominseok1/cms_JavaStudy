package com.sist.exception;
/*
 * 	임의 발생 : 테스트 목적
 * 	------------------ 배포전 (배포:상용화)
 *  형식)
 *  	throw new 예외처리 생성자()
 */
public class 예외처리_임의발생_1 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		/*try
		{
		Thread.sleep(10);
		}catch(Exception e) {}*/
		// InterruptedException < Exception <Throwable
		/*try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		try
		{
			int a=10;
			if(a%2==0)
			{
				System.out.println("임의로 예외발생");
				throw new NumberFormatException("정수 변환이 안됨");
				//throw => 사용자 정의 예외처리
				//=> catch로 이동 => 소스코딩을 할 수 없다
				//getMessage변경 => 생성자 매개변수 이용
				/*
				 *  class NumberFormatException extends Exception
				 *  {
				 *  	private String message="For input String: " 10";
				 *  	public NumberFormatException()
				 *  	{
				 *  	}
				 *  public NumberFormatException(String message)
				 *  	{
				 *  		this.message=message
				 *  	}
				 *  getter/setter
				 *  }
				 */
				//Integer.parseInt(" 10");
			}
		}catch(ClassCastException e)
		{
			System.out.println(e.getMessage());
			// 에러 확인 ==> 에러부분을 수정
		}catch(NumberFormatException e)
		{
			System.out.println("NumberFormatException:"+e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
