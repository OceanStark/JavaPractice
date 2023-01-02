package com.bankerTest.java;

import com.banker.java.Account;
import com.banker.java.Bank;
import com.banker.java.Customer;

public class TestBanking {
	public static void main(String[] args) {
		Bank bank = new Bank();
		Account account = new Account(666);
		
		bank.addCustomer("Zhao", "haiyang");
		bank.addCustomer("ceshi1", "haiyang");
		bank.addCustomer("ceshi2", "haiyang");
		
		bank.getCustomer(0).setAccout(account);
		
		for(int i = 0; i < bank.getNumofcustomer(); i++) {
			Customer customer = bank.getCustomer(i);
			System.out.println("Customer ["+(i+1)+"] is "+customer.getLastName()+customer.getFirstName()/*+customer.getAccout().getBalance()*/);
		}
	}
}
