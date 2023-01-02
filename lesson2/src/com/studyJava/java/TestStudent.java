package com.studyJava.java;

public class TestStudent {
	public static void main(String[] args) {
		Student Stu = new Student(18,"Haiyang.Zhao");
		int Age = Stu.getAge();
		System.out.println(Stu.getName()+" is "+Age);
	}
}
