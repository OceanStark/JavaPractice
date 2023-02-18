package com.banker5.java;

public class ChecingAccount extends Account{
	private double overdraftProtection;

	public ChecingAccount(double Balance) {
		super(Balance);
	}

	public ChecingAccount(double Balance, double overdraftProtection) {
		super(Balance);
		this.overdraftProtection = overdraftProtection;//透支额度
	}
	
	@Override
	public boolean withdraw(double expense) {
		//余额足够
		if(balance > expense) {
			balance -= expense;
			return true;
		}
		//透支保护足够
		else if((balance + overdraftProtection) > expense) {
			// overdraftProtection  - (expense - balance) =  overdraftProtection;
			/* 上面这么写一定错啦，别忘记: 左值是结果，右值是计算过程！！ */			
			overdraftProtection =  overdraftProtection - (expense - balance); //透支额度的剩余
			balance = 0;
			return true;
		}
		//啥都不够了
		else return false;
	}
}
