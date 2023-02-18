package com.java.bank6;

public class TestAccount {
	public static void main(String[] args) {
		/*
		 * 
		 * Account Acc1 = new Account(0,20000, 0.023);
		 * Acc1.withdraw(23000);
		 * System.out.println("Balance: "+ Acc1.getBalance());
		 */
		System.out.println( );
		
		Checkaccount Check1 = new Checkaccount(1, 10000, 0.012,20000);
		Check1.withdraw(50000);
		System.out.println("Balance: " + Check1.getBalance());
		System.out.println("Overdraft: " + Check1.getOverdraft());
	}
}
