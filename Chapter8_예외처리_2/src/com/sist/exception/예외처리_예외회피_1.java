package com.sist.exception;

import java.io.IOException;
import java.sql.SQLException;

// 예외 떠맡기 , 예외 회피 ...
// => 메소드를 읽는다 => JVM에 이런 예외가 발생할 수 있다 (알려만 주는 것) => 예외선언
// => 메소드 호출시에 반드시 => 직접처리 할건지, 선언만 할건지
// => RuntimeException => 생략이 가능 (예외처리를 안해도 된다)
/*
 *		상위 클래스를 이용해서 전체를 처리가 가능하다
 *			Throwable (Exception/Error)
 *				|
 *	---------------------------------
 *	|								|
 *Error							Exception
 *(x)						Check	|	UnCheck
 *						---------------------------
 *						|				  		  |
 *					IOException				RuntimeException
 *					SQLException				  |
 *											NumberFormatException, Arr...
 *
 *					void method() 	throws RuntimeException
 *					***void method() 	throws Exception 예외처리 안하면 오류남
 *					void method() 	throws NumberFormatException,ClassCastException
 *					***void method()   throws IOException 예외처리 안하면 오류남
 *					***void method() 	throws SQLException,NumberFormatException 예외처리 안하면 오류남
 * 
 * 					private static void divide(int n, int n1)
 * 					throws ArithmethickException=> throws뒤에는 check
 * 						-------------------------- uncheck=>
 * 					=>divide(10,2)
 */
public class 예외처리_예외회피_1 {
	public static void methods() throws Exception
	{
		// 예외처리 대상
	}
	public static void method1() throws Exception // 간접 처리 (JVM이 처리)
	{
		methods();
	}
	
	public static void method2()  // 간접 처리 (JVM이 처리)
	{
		try
		{
			methods();
		}catch(Throwable e) //같거나 커야함
		{
			
		}
	}
	public static void method3() throws IOException,SQLException,ClassNotFoundException
	{
		
	}
	public static void method4() throws IOException,SQLException,ClassNotFoundException
	{
		method3();
	}
	public static void method5() throws Exception
	{
		method3();
	}
	public static void method6() throws Throwable
	{
		method3();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
