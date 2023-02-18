package com.bankerTest.java;

import com.banker5.java.*;

public class TestBanking4 {
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		Customer customer;
		Account account;
		
		bank.addCustomer("Zhao", "haiyang");
		bank.getCustomer(0).setAccout(new SavingAccount(500, 0.03));  
		// 这里new SavingAccount(500, 0.03)本质是添加一个SavingAccount 的对象（setAccout函数里的参数本来是添加的Account的对象，但是存在多态的用法，可以换成其子类）。
		
		bank.addCustomer("Shi", "hao");
		bank.getCustomer(1).setAccout(new ChecingAccount(500));
		
		bank.addCustomer("Xiao", "shi");
		bank.getCustomer(2).setAccout(new ChecingAccount(500, 500));
		
		bank.addCustomer("Da", "shi");
		bank.getCustomer(3).setAccout(bank.getCustomer(2).getAccout()); //Da shi 与Xiao shi公用一个account。
		
		}
}
