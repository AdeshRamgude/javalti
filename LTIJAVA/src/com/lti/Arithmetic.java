package com.lti;

import java.util.Scanner;

public class Arithmetic {
	int a,b;
	char op;
	
	void accept() {
		System.out.println("enter a b operator");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		op=sc.next().charAt(0);
		
		switch(op)
		{
			case '+':
				System.out.println(a+b);
				break;
			case '-':
				System.out.println(a-b);
				break;
			case '*':
				System.out.println(a*b);
				break;
			case '/':
				System.out.println(a/b);
				break;
			default:
				System.out.println("invalid operator");
				
		}
	}
	public static void main(String[] args) {
		Arithmetic a1=new Arithmetic();
		a1.accept();
	}
	
}
