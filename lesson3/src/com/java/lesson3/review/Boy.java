package com.java.lesson3.review;

public class Boy {
	private String boyName;
	private int age;
	public String getBoyName() {
		return boyName;
	}

public Boy(String boyName,int age) {
	this.boyName = boyName;
	this.age = age;
}

	void requestmarry(Girl girl) {
		System.out.println(this.getBoyName()+":Please marry me!");
		System.out.println(girl.getGirlName()+":Yes,I do!");
	}
	
}
