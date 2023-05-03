package com.sist.io;
import java.util.*;
import java.io.*;
public class Object_inputOutput_2 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		FileInputStream out=new FileInputStream("c:\\java_datas\\sawon.txt");
		ObjectInputStream ois= new ObjectInputStream(out); //
		// 객체 단위로 값을 읽어온다
		List<Sawon> list=(List<Sawon>)ois.readObject(); // 통째로 저장
		for(Sawon s:list)
		{
			System.out.println(s.getSabun()+" "+s.getName()+" "+s.getDept()+" "+s.getJob()+" "+s.getPay());
		}
	}

}
