package com.java.lesson3_2;

public class TestPerson {
	public static void main(String[] args) {
		Person P1 = new Person();
		
		//P1.address = "ShouChuanLiFang";
		P1.age = 18;
		P1.setName("Zhaohaiyang");
		System.out.println(P1.getName()); 
	}
}
