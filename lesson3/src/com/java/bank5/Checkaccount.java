package com.java.bank5;

public class Checkaccount extends Account {
	
	private double overdraft;

	public Checkaccount(int id, double balance, double annual,double overdraft) {
		super(id, balance, annual);
		// TODO Auto-generated constructor stub
		this.overdraft = overdraft;
	}
		
	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(this.getBalance() > amount)
			super.withdraw(amount);
		else if(this.overdraft > (amount - this.getBalance())) {
			this.overdraft -= amount;
			this.setBalance(0);
		}
		else
			System.out.println("the balance and overdraft is unsatisfied!");
	}

	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}
		
	

}
