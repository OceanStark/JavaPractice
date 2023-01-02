package com.java.extend.Study;

public class ManKind {
	String Name;
	//int age;
	int sex;
	int salary;
	
    public void manOrwoman() {
    	if(this.sex == 1) System.out.println("This is a Man");
    	if(this.sex == 0) System.out.println("This is a Woman");
    }
    
    public void employeed() {
    	if(this.salary == 0) System.out.println("No job");
    	if(this.salary != 0) System.out.println("Have job");
    }
}
