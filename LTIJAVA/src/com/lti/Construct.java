package com.lti;

public class Construct {
	int x,y,z;
	public Construct()
	{
		x=10;
		y=20;
	}
	
	public Construct(int x1,int y1)
	{
		x=x1;
		y=y1;
	}
	
	void add()
	{
		z=x+y;
	}
	
	void disp()
	{
		System.out.println("RES:"+z);
	}
	
	public static void main(String[] args) {
		Construct c1=new Construct();
		c1.add();
		c1.disp();
		
		Construct c2=new Construct(10,10);
		c2.add();
		c2.disp();
	}
}
