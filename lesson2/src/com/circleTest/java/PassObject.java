package com.circleTest.java;

public class PassObject {
	public void printAreas(Circle c,int time) {
		
		System.out.println("Radius\t\tArea");
		for(int i = 1;i<=5;i++) {
			c.setRadius(i);
			System.out.println(c.getRadius()+"\t\t"+c.findAera());
		}
	}
}
