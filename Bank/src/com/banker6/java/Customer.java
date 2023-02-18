package com.banker6.java;

public class Customer {
	
	private String firstName;
	private String lastName;
	
	private Account[] accounts;
	private int numberOfAccounts; 
	
	
	public Customer(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		
		accounts = new Account[2];
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void addAccout(Account accout) {
		accounts[numberOfAccounts++] = accout;
	}
	
	public Account getAccout(int index) {
		return accounts[index];
	}
	
	public int getNumberOfAccounts() {
		return numberOfAccounts;
	}
}
