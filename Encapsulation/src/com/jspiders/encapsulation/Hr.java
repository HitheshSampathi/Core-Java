package com.jspiders.encapsulation;

public class Hr {
public static void main(String[] args) {
	Employee e1=new Employee("hithesh", 123, 20000);
	System.out.println(e1.getName());
	System.out.println(e1.getId());
	System.out.println(e1.getSalary());
	
	e1.setName("abc");
	e1.setId(199);
	e1.setSalary(1000);
	
	System.out.println(e1.getName());
	System.out.println(e1.getId());
	System.out.println(e1.getSalary());
	
}
}
