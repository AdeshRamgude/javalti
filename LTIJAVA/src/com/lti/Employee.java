package com.lti;

public class Employee {
	String name="ram";
	
	void display()
	{
		System.out.println("Name:"+name);
	}
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.display();
	}
}
