package com.java.bank6;

public abstract class GemetricObject {
	protected String color;
	protected double weigth;
	
	public GemetricObject(String color, double weigth) {
		super();
		this.color = color;
		this.weigth = weigth;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeigth() {
		return weigth;
	}

	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}
	
	public abstract double findArea();
	
}
