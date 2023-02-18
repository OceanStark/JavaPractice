package com.bankerTest.java;

/* import com.banker6.java.SavingAccount;  不能包含别的java类，否则setSasetSavingAccount会报错 */
import com.banker7.java.*;

public class TestBanking5 {
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		Customer customer;
		Account account; 
		
		bank.addCustomer("Zhao", "haiyang");
		bank.getCustomer(0).setSavingAccount(new SavingAccount(500, 0.03)); 
		// 这里new SavingAccount(500, 0.03)本质是添加一个SavingAccount 的对象（setAccout函数里的参数本来是添加的Account的对象，但是存在多态的用法，可以换成其子类）。
		bank.getCustomer(0).setChecingAccount(new ChecingAccount(200,(SavingAccount)bank.getCustomer(0).getSavingAccount()));
			/* 
			 * 
			 * public ChecingAccount(double Balance, SavingAccount protectedBy) {
			 *	super(Balance);
			 *	this.protectedBy = protectedBy;
			 *	}
			 * 
			 * 	private Account savingAccount;
			 *	private Account checingAccount;
			 *	public Account getSavingAccount() {
			 *	return savingAccount;
			 *	}
			 * 
			 *  bank.getCustomer(0).getSavingAccount()获取的是  Account类型 savingAccount，
			 *  而ChecingAccount函数里的参数类型需要是SavingAccount类型的，父子对象转换成子类对象需要强制转换！这就是(SavingAccount)的由来
			 */
		
		}
}
