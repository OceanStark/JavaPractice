package com.java.lessonDuotai;


public class Testinstance {
	 
	public void method(Person e) {
		System.out.println(e.GetInfo()); 
	}
	
	public static void main(String[] args) {
		Person p1 = new Person();
	    Testinstance test1 = new Testinstance();
	    test1.method(p1);
	}

}
