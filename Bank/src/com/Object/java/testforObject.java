package com.Object.java;

public class testforObject {
	
	public static void main(String[] args) {
		Person person = new Person("BB",12);
		Person person1 = new Person("BB",12);
		
		System.out.println(person == person1);   /* �ж��Ƿ�Ϊͬһ������ */
			//false
		System.out.println(person.equals(person1));  /* ��дequals�������ж�����������Ƿ���ͬ */
			//true
		
	}
}
