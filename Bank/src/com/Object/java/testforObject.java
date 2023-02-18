package com.Object.java;

public class testforObject {
	
	public static void main(String[] args) {
		Person person = new Person("BB",12);
		Person person1 = new Person("BB",12);
		
		System.out.println(person == person1);   /* 判断是否为同一个对象 */
			//false
		System.out.println(person.equals(person1));  /* 重写equals方法，判断年龄和姓名是否相同 */
			//true
		
	}
}
