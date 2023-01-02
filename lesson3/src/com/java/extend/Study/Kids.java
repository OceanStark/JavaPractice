package com.java.extend.Study;


/*
 * Subclass will call construction method in superclass when subclass object is created. 
 */

public class Kids extends ManKind {
	int yearsold;
	public void printfAge() {
		System.out.println("The old of kid is :"+yearsold);
	}
	
	@Override
	public void employeed() {
		// TODO Auto-generated method stub
		//super.employeed();
		super.employeed();
		System.out.println("He do not need to  Have job beacuse he is a Kid!");
		
		
	}
	
	public static void main(String[] args) {
		Kids kid1 = new Kids();
		kid1.Name = "Haiyang";
		kid1.salary = 14000;
		kid1.sex = 1;
		kid1.yearsold = 18;
		
		System.out.println("The Name of kid is: "+kid1.Name+"; Employee Status is: ");
		kid1.manOrwoman();
		kid1.employeed();
		//kid1.employeed();
		
	}
}
