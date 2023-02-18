package com.java.bank5;

public class Account {
	
	private int id;
	private double balance;
	private double annual; //年利率
	public Account(int id, double balance, double annual) {
		super();
		this.id = id;
		this.balance = balance;
		this.annual = annual;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnual() {
		return annual;
	}
	public void setAnnual(double annual) {
		this.annual = annual;
	}
	
	public double getmonthlyInterest() {
		return this.annual / 12;
	}
	
	public void withdraw(double amount) {	//取款
		if(amount > balance) 
			System.out.println("balance is unsatisfy!");
		else
			balance = balance - amount;
	}
	
	public void deposit(double amount) {	//存款
		balance += amount;
	}
	
}
