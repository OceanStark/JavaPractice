package com.banker7.java;	/* 让Customer拥有两个可选的银行账户  */
/*
 *  savingAccount	存储总数
 * 	checingAccount	支票
 */

public class Customer {
	
	private String firstName;
	private String lastName;
	private Account savingAccount;
	private Account checingAccount;
	
	
	public Account getSavingAccount() {
		return savingAccount;
	}

	public void setSavingAccount(Account savingAccount) {
		this.savingAccount = savingAccount;
	}

	public Account getChecingAccount() {
		return checingAccount;
	}

	public void setChecingAccount(Account checingAccount) {
		this.checingAccount = checingAccount;
	}

	public Customer(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
}
