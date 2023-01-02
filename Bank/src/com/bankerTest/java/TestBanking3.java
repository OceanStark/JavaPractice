package com.bankerTest.java;

import com.bankerAdd.java.Account;
import com.bankerAdd.java.Customer;

public class TestBanking3 {
	public static void main(String[] args) {
		Customer customer = new Customer("Chen", "haibo");
		Account account1 = new Account(800);
		
		customer.setAccout(account1);
		customer.getAccout().deposit(20);
		
		if(customer.getAccout().withdraw(799)) {
			System.out.println("Customer: "+customer.getFirstName()+"."+customer.getLastName()+" , "+"account balance :"+customer.getAccout().getBalance());
		}
		else
			System.out.println("The balance is unsatisfied!");
		}
}
