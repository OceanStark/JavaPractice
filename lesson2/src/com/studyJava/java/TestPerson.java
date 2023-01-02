package com.studyJava.java;

public class TestPerson {
	public static void main(String[] args) {
		
		Person person = new Person(); 
		
		person.age = 18;
		person.name = "haiyang.Zhao";
		System.out.println(person.name+"  "+person.Getage());
		person.Addage(5);
		System.out.println(person.Getage());
		
		
	}

}
