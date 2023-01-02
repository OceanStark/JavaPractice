package com.banker.java;

public class Bank {
	
	private Customer[] customers;
	private int numofcustomer;
	
	public Bank() {
		customers = new Customer[10];
	}
	
	public void addCustomer(String firstName, String lastName) {
		Customer customer = new Customer(firstName, lastName);
		customers[numofcustomer] = customer;
		numofcustomer++;
	}
	
	public int getNumofcustomer() {
		return numofcustomer;
	}
	
	public Customer getCustomer(int index) {
		return customers[index];
	}
	
	
}

