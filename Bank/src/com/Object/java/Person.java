package com.Object.java;

public class Person {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person() {
		
	}
	
	//��дObject���е�equals����
	@Override
	public boolean equals(Object obj) {     /* ���obj������Person person1��������������ֱ��ת���ɸ������ */
		if(this == obj) return true;
		else if(obj instanceof Person) {
			Person person3 = (Person)obj;   /* �������ת��Ϊ����������Ҫ��ǿ��ת�� */
			return (person3.getAge() == this.age && person3.getName() == this.name);   //�����thisֻ�����䱾������ԣ����������䱾��ķ���
		}
		else return false;
	
	}
	
}
