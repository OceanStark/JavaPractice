package com.banker.java;

public class Account {

	private double balance;	//ÕË»§Óà¶î
	public Account(double Balance) {
		this.balance = Balance; 
		// TODO Auto-generated constructor stub
		System.out.println("Init successed!");
	}
	public double getBalance() {
		return this.balance;
	}
	
	public void deposit(double money) {
		balance += money; 
	}
	
	public void withdraw(double expense) {
		if(balance > expense) balance -= expense;
		else System.out.println("Balance is not sufficient!");
	}
}
