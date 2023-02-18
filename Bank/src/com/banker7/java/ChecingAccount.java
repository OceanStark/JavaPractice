package com.banker7.java;  /* ����protectedBy����͸֧���� */

public class ChecingAccount extends Account{
	
	private SavingAccount protectedBy;

	public ChecingAccount(double Balance, SavingAccount protectedBy) {
		super(Balance);
		this.protectedBy = protectedBy;
	}

	public ChecingAccount(double Balance) {
		super(Balance);
	}

	
	@Override
	public boolean withdraw(double expense) {
		//����㹻
		if(balance > expense) {
			balance -= expense;
			return true;
		}
		//͸֧�����㹻
		else if(protectedBy.getBalance() > expense - balance) {			
			protectedBy.withdraw(expense - balance);//͸֧��ȵ�ʣ��
			balance = 0;
			return true;
		}
		//ɶ��������
		else return false;
	}
}
