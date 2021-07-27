package com.lti;

public class StaticKey {
	static int x=100;
	int y;
	void display()
	{
		System.out.println(x);
		x++;
	}
	static void disp()
	{
		int d=100;
		x=900;
		System.out.println(x);
		System.out.println(d);
	}
	public static void main(String[] args) {
		StaticKey s1=new StaticKey();
		StaticKey s2=new StaticKey();
		s1.display();
		s2.display();
		StaticKey.disp();
	}
}
