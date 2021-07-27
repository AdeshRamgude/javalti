package com.lti;
import java.util.Scanner;

public class Scaner {
	int empno;
	String name;
	double salary;
	
	void accept() {
		System.out.println("enter empno name salary");
		Scanner sc=new Scanner(System.in);
		empno=sc.nextInt();
		name=sc.next();
		salary=sc.nextDouble();
	
	}
	
	void display() {
		System.out.println(empno+" "+name+" "+salary);
	}
	
	public static void main(String[] args) {
		Scaner s1=new Scaner();
		s1.accept();
		s1.display();
	}
}
