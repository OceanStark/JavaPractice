package com.bankerTest.java;

/* import com.banker6.java.SavingAccount;  ���ܰ������java�࣬����setSasetSavingAccount�ᱨ�� */
import com.banker7.java.*;

public class TestBanking5 {
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		Customer customer;
		Account account; 
		
		bank.addCustomer("Zhao", "haiyang");
		bank.getCustomer(0).setSavingAccount(new SavingAccount(500, 0.03)); 
		// ����new SavingAccount(500, 0.03)���������һ��SavingAccount �Ķ���setAccout������Ĳ�����������ӵ�Account�Ķ��󣬵��Ǵ��ڶ�̬���÷������Ի��������ࣩ��
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
			 *  bank.getCustomer(0).getSavingAccount()��ȡ����  Account���� savingAccount��
			 *  ��ChecingAccount������Ĳ���������Ҫ��SavingAccount���͵ģ����Ӷ���ת�������������Ҫǿ��ת���������(SavingAccount)������
			 */
		
		}
}
