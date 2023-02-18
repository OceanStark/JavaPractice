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
	
	//重写Object类中的equals方法
	@Override
	public boolean equals(Object obj) {     /* 这个obj本质是Person person1对象，子类对象可以直接转换成父类对象 */
		if(this == obj) return true;
		else if(obj instanceof Person) {
			Person person3 = (Person)obj;   /* 父类对象转化为子类对象必须要加强制转换 */
			return (person3.getAge() == this.age && person3.getName() == this.name);   //这里的this只能用其本身的属性，而不能用其本身的方法
		}
		else return false;
	
	}
	
}
