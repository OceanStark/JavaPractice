package com.java.extend.Study;

public class TestCyAndCi {
	
	public static void main(String[] args) {
		Cylinder Cl1 = new Cylinder();
		Cl1.setRadius(2);
		Cl1.setLength(3);
		System.out.println(Cl1.findVolume());
		System.out.println(Cl1.findArea());
	}
}
