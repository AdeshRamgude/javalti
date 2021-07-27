package com.lti;

public class Str {
	public static void main(String[] args) {
		
	
	  String s1="Helloo World";
      
      System.out.println(s1.charAt(0));

      String s2="Ant";
      String s3="    ant";
      System.out.println(s2.compareTo(s3));
      System.out.println(s2.equalsIgnoreCase(s3));
      System.out.println(s1.indexOf('o'));
      System.out.println(s1.lastIndexOf('o'));
      System.out.println(s1.length());
      System.out.println(s2.concat(" Man"));
      System.out.println(s1.replace('o','a'));
      System.out.println(s1.substring(4));
      System.out.println(s1.substring(4,7));
      System.out.println(s3.trim());
     
      s2.replace('t', 'd'); // IMMUTABLE
      System.out.println(s2);
	}
}