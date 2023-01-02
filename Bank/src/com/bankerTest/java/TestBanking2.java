package com.bankerTest.java;

import com.banker.java.Account;

public class TestBanking2 {
	public static void main(String[] args) {
		
		Account bank1 = new Account(100.0);
		bank1.deposit(56.3);
		System.out.println(bank1.getBalance());
		bank1.withdraw(22.2);
		System.out.println(bank1.getBalance());
		bank1.withdraw(18.8);
		System.out.println(bank1.getBalance());
	}
}
