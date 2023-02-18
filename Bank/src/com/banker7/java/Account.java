package com.banker7.java;

public class Account {

	protected double balance;	//ÕË»§Óà¶î
	public Account(double Balance) {
		this.balance = Balance; 
		// TODO Auto-generated constructor stub
		System.out.println("Init successed!");
	}
	public double getBalance() {
		return this.balance;
	}
	
	public boolean deposit(double money) {
		balance += money;
		return true;
	}
	
	public boolean withdraw(double expense) {
		if(balance > expense) {
			balance -= expense;
			return true;
		}
		else {
			System.out.println("Balance is not sufficient!");
			return false;
		}
	}
}
