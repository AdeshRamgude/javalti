package com.lti;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
	String pat="A001";
	char a=pat.charAt(3);
	int b=Integer.parseInt(String.valueOf(a));
	System.out.println(b);
	for (int i=1;i<=5;i++)
	{
		System.out.println("A00"+(b+i));
	}
	
	int sum=0;
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	for (int i=0;i<s.length();i++)
	{
		if (Character.isDigit(s.charAt(i)))
			{
				int j=Character.getNumericValue(s.charAt(i));
				sum=sum+j;
			}
	}
		System.out.println("Sum " +sum);
	}
}
