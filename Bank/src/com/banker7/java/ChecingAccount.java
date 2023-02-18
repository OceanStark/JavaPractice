package com.banker7.java;  /* 利用protectedBy来做透支保护 */

public class ChecingAccount extends Account{
	
	private SavingAccount protectedBy;

	public ChecingAccount(double Balance, SavingAccount protectedBy) {
		super(Balance);
		this.protectedBy = protectedBy;
	}

	public ChecingAccount(double Balance) {
		super(Balance);
	}

	
	@Override
	public boolean withdraw(double expense) {
		//余额足够
		if(balance > expense) {
			balance -= expense;
			return true;
		}
		//透支保护足够
		else if(protectedBy.getBalance() > expense - balance) {			
			protectedBy.withdraw(expense - balance);//透支额度的剩余
			balance = 0;
			return true;
		}
		//啥都不够了
		else return false;
	}
}
