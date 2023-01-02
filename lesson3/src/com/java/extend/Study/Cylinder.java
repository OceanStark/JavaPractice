package com.java.extend.Study;

public class Cylinder extends Circle{
	private double length;
	
	public Cylinder() {
		this.length = 1;
		// TODO Auto-generated constructor stub
	}

	public double getLength() {
		return length;
	} 

	public void setLength(double length) {
		this.length = length;
	}
	
	public double findVolume() {
		return this.findArea()*this.length;
	}
	
	@Override
	public double findArea() {
		// TODO Auto-generated method stub
		return super.findArea()*2 + super.getRadius()*2*3.14*this.length;
	}
}
