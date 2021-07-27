package com.lti;

public class ConstructChain {
	public ConstructChain() {
		this(10);
		System.out.println("default");
	}
	public ConstructChain(int x,int y) {
	
		System.out.println("2 para:"+x+" "+y);
	}
	public ConstructChain(int x) {
		this(10,20);
		System.out.println("1 para:"+x);
	}
	public static void main(String[] args) {
		ConstructChain c1=new ConstructChain();
	}
}
