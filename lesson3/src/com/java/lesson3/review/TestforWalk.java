package com.java.lesson3.review;

/* CopyRight For haiyang.Zhao */
/* Test for 多态 */

/* 父类的变量指向不同类的地址 */
/* 不能调用子类中独有的方法，但在多态的情况下，可以进行强制类型转换 */
/* 只有在有父子关系的情况下，才能进行进行强制类型转换 */
/* 父类的对象可以转换为任何子类的类型，但可能会发生强制转换错误 ：父类的对象之前被其他子类强制转化过，在将其转化为当下的子类，两个子类的内容不一致 */

public class TestforWalk {
	
	public void Test(Person person) {
		//person.Walk();      /*  */
		System.out.println(person instanceof Person);
		System.out.println(person instanceof Man);
		System.out.println(person instanceof Woman);

	}
	
	public static void main(String[] args) {
	   /*
		Man man1 = new Man();
		Woman girl1 = new Woman();
		girl1.Walk();
		girl1.Life();
		man1.Walk();
		man1.Work();
		*/
	
		Person p1 = new Person();
		p1.Walk();
		Person p2 = new Man(); 
		Man PP2 = (Man) p2;   /* 强制类型转换，此时可以调用子类中独有的方法Work */ 
		p2.Walk();
		PP2.Work();
		Person p3 = new Woman();
		p3.Walk();
		
		
		TestforWalk testforwalk = new TestforWalk();
		testforwalk.Test(p3);
		testforwalk.Test(p2);
		testforwalk.Test(p1);
		
	}
}
