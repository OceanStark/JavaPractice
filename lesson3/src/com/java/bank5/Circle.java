package com.java.bank5;

public class Circle extends GemetricObject{
	private double radius;

	public Circle(String color, double weigth, double radius) {
		super(color, weigth);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double findArea() {		//Ó‹ËãÃæ·e
		return radius * radius * 3.14;
	}
	
}
