package com.bankerAdd.java;

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
	
	public boolean deposit(double money) {
		balance += money;
		return true;
	}
	
	public boolean withdraw(double expense) {
		if(balance > expense) {
			balance -= expense;
			return true;
		}
		else 
			return false;
			//System.out.println("Balance is not sufficient!");
	}
}
