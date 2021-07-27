package com.lti;

	interface MyInterface
	{
	    void sampleMethod();
	}
	public class LambdaFn
	{
	    public static void main(String[] args)
	    {
	            MyInterface obj= ()->{
	                System.out.println("Hello");
	                };
	            obj.sampleMethod();
	    }
	}
