package com.banker7.java;

public class SavingAccount extends Account{
	private double interesRate;

	public SavingAccount(double Balance, double interesRate) {
		super(Balance);
		this.interesRate = interesRate;
	}

	public double getInteresRate() {
		return interesRate;
	}

	public void setInteresRate(double interesRate) {
		this.interesRate = interesRate;
	}
	
	
}
