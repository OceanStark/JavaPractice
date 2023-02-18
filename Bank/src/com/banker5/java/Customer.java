package com.banker5.java;

public class Customer {
	
	private String firstName;
	private String lastName;
	private Account accout;
	
	public Customer(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setAccout(Account accout) {
		this.accout = accout;
	}
	
	public Account getAccout() {
		return accout;
	}
}
