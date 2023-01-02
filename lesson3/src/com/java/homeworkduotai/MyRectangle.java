package com.java.homeworkduotai;

public class MyRectangle extends GemetricObject{
	private double width;
	private double height;
	
	public MyRectangle(String color, double weigth, double width, double height) {
		super(color, weigth);
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public double findArea() {		//”ãÀ„√Ê∑e
		return height * width;
	}
}
