package com.bankerTest.java;

import com.banker.java.Account;
import com.banker.java.Customer;

public class TestBanking1 {
	public static void main(String[] args) {
		
		Account account1 = new Account(500);
		Customer customer1 = new Customer("Zhao", "haiyang");
		customer1.setAccout(account1);
		customer1.getAccout().withdraw(47.62);
		
	    System.out.println("Customer: "+customer1.getFirstName()+customer1.getLastName()+" , "+"account balance :"+customer1.getAccout().getBalance());
		
	}
}
