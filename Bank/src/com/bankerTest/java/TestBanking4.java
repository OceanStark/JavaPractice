package com.bankerTest.java;

import com.banker5.java.*;

public class TestBanking4 {
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		Customer customer;
		Account account;
		
		bank.addCustomer("Zhao", "haiyang");
		bank.getCustomer(0).setAccout(new SavingAccount(500, 0.03));  
		// ����new SavingAccount(500, 0.03)���������һ��SavingAccount �Ķ���setAccout������Ĳ�����������ӵ�Account�Ķ��󣬵��Ǵ��ڶ�̬���÷������Ի��������ࣩ��
		
		bank.addCustomer("Shi", "hao");
		bank.getCustomer(1).setAccout(new ChecingAccount(500));
		
		bank.addCustomer("Xiao", "shi");
		bank.getCustomer(2).setAccout(new ChecingAccount(500, 500));
		
		bank.addCustomer("Da", "shi");
		bank.getCustomer(3).setAccout(bank.getCustomer(2).getAccout()); //Da shi ��Xiao shi����һ��account��
		
		}
}
