package com.java.lesson3.review;

/* CopyRight For haiyang.Zhao */
/* Test for ��̬ */

/* ����ı���ָ��ͬ��ĵ�ַ */
/* ���ܵ��������ж��еķ��������ڶ�̬������£����Խ���ǿ������ת�� */
/* ֻ�����и��ӹ�ϵ������£����ܽ��н���ǿ������ת�� */
/* ����Ķ������ת��Ϊ�κ���������ͣ������ܻᷢ��ǿ��ת������ ������Ķ���֮ǰ����������ǿ��ת�������ڽ���ת��Ϊ���µ����࣬������������ݲ�һ�� */

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
		Man PP2 = (Man) p2;   /* ǿ������ת������ʱ���Ե��������ж��еķ���Work */ 
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
