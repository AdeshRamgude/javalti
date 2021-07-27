package com.lti;

public class MixStr {
	String s1="";
	String s2="";
	
	void mixstring(String str) {
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				s2+=str.charAt(i);
			}
			else {
				s1+=str.charAt(i);
			}
		}
		System.out.println(s1.concat(s2));
	}
	
	public static void main(String[] args) {
		MixStr m1=new MixStr();
		m1.mixstring("123a2hj123");
	}
}
