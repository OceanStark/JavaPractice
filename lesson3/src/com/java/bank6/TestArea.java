package com.java.bank6;

/*
 * polymorphic Homework with dynamic binding and know abstract class
 * Copyright @ 2023.1.2 Haiyang.Zhao
 */

public class TestArea {
	
	public boolean equalsArea(GemetricObject Geme1,GemetricObject Geme2) {
		if(Geme1.findArea() == Geme2.findArea()) {
			System.out.println("Area is equal!");
			return true;
		}
		
		else {
			System.out.println("Area is unequal!");
			return false;	
		}
		
	}
	
	public void GeometricObject(GemetricObject Geme) {
		System.out.println(Geme.findArea());
	}
	
	public static void main(String[] args) {
		GemetricObject cir1 = new Circle("Blue", 20, 5);
		GemetricObject rect1 = new MyRectangle("Green", 15, 4, 5);
		TestArea TestA = new TestArea();
		TestA.equalsArea(cir1, rect1);
		TestA.GeometricObject(rect1);
	}
}
