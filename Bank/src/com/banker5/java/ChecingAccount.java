package com.banker5.java;

public class ChecingAccount extends Account{
	private double overdraftProtection;

	public ChecingAccount(double Balance) {
		super(Balance);
	}

	public ChecingAccount(double Balance, double overdraftProtection) {
		super(Balance);
		this.overdraftProtection = overdraftProtection;//͸֧���
	}
	
	@Override
	public boolean withdraw(double expense) {
		//����㹻
		if(balance > expense) {
			balance -= expense;
			return true;
		}
		//͸֧�����㹻
		else if((balance + overdraftProtection) > expense) {
			// overdraftProtection  - (expense - balance) =  overdraftProtection;
			/* ������ôдһ��������������: ��ֵ�ǽ������ֵ�Ǽ�����̣��� */			
			overdraftProtection =  overdraftProtection - (expense - balance); //͸֧��ȵ�ʣ��
			balance = 0;
			return true;
		}
		//ɶ��������
		else return false;
	}
}
