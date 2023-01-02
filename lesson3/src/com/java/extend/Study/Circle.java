package com.java.extend.Study;

public class Circle {
	private double radius;
	public Circle() {
		this.radius = 1;
		// TODO Auto-generated constructor stub
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double findArea() {
		return this.radius*this.radius*3.14;
	}
}
