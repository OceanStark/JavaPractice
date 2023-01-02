package com.studyJava.java;

public class Student {
	
	private int age;
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int age,String name) {
		// TODO Auto-generated constructor stub
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
