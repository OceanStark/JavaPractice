package com.java.lesson3.review;

public class Student extends Person {

	
	String school;
	
	/*
	 * public Student() {
	 *	// TODO Auto-generated constructor stub
	 *	System.out.println("This is a construction of subclass!");
	 * }
	 */
	
	
	@Override 
	//This is a override of method   ����  �ڸ���Ļ�������ͬ���͵Ĺ�������
	public String getInfo() {
		// TODO Auto-generated method stub
		//return super.getInfo();
		return super.getInfo()+" School: "+this.school;
	}
	
	public Student(String school) {
		super("zhang",18);
		this.school = school;
	}

	//This is a overload of method ����
	public String getInfo(String school) {
		return "Name: "+this.getName()+" age: "+this.age+" School: "+school;
	}
	
}
