package com.lti;

public class StrPrac {
	String res="";
	void changeStr(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
			{
				res+=str.charAt(i);
			}
			else if(str.charAt(i)=='Z')
			{
				res+="A";
			}
			else {
				res+=(char)(str.charAt(i)+1);
			}
		}
		System.out.println(res);
	}
	
	public static void main(String[] args) {
		StrPrac p1=new StrPrac();
		p1.changeStr("ZAVA");
	}
}
