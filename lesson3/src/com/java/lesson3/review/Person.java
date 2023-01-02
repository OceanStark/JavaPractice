package com.java.lesson3.review;

public class Person {
	private String Name;
	int age;
	
	 public Person() {
	  //TODO Auto-generated constructor stub
	 	System.out.println("This is a construction of superclass!");
	 }
	 
	 public void Walk() {
		 System.out.println("Person walk");
	 }

	 public String getInfo() {
		 return "Name: "+Name+"Age: "+age;
	 }
	 

	public Person(String name, int age) {
		super();
		Name = name;
		this.age = age;
	}
	

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
}
