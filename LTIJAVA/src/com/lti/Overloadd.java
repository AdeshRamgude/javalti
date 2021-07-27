package com.lti;

public class Overloadd {
	int max(int x,int y)
	{
		if(x>y)
		{
			return x;
		}
		else
		{
			return y;
		}
	}
	
	double max(double x,double y)
	{
		if(x>y)
		{
			return x;
		}
		else
		{
			return y;
		}
	}
	public static void main(String[] args) {
		Overloadd o1=new Overloadd();
		System.out.println(o1.max(1, 2));
		System.out.println(o1.max(1.1, 2.2));
	}
}
