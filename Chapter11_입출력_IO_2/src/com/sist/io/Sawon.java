package com.sist.io;

import java.io.Serializable;

// 직렬화 : Serializable
public class Sawon implements Serializable { // 직렬화 할때 객체단위로 저장할때 implements Serializable 이거 써야됨
 private int sabun;
 private String name;
 private String dept;
 private String job;
 private int pay;
public int getSabun() {
	return sabun;
}
public void setSabun(int sabun) {
	this.sabun = sabun;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public String getJob() {
	return job;
}
public void setJob(String job) {
	this.job = job;
}
public int getPay() {
	return pay;
}
public void setPay(int pay) {
	this.pay = pay;
}
public Sawon(int sabun, String name, String dept, String job, int pay) {
	// 매개 변수 있는 생성자 
	this.sabun = sabun;
	this.name = name;
	this.dept = dept;
	this.job = job;
	this.pay = pay;
}
public Sawon()
{
	// 매개변수가 있는 생성자가 나오면 default 생성자를 만들어놔야함
	// 자동생성이 안되서 만들어놔야함
}

 
}
