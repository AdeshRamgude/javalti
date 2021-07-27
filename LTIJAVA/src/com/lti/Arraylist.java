package com.lti;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Arraylist {
	    List res=new ArrayList();
	    
	    List getNames(String input)
	    {
	//Q1//WAP to accept the names list as a string , split them , Convert to title case ,
	        //store it in array list and return.
	        //Sample Input "ram,rahim,robert,farhan,aditi,reshma,guna";
	        // [Ram , Rahim, Robert....]
	        StringTokenizer stz=new StringTokenizer(input, ",");
	        while(stz.hasMoreTokens())
	        {
	            String text=stz.nextToken();
	            text=text.substring(0, 1).toUpperCase()+text.substring(1);
	            res.add(text);
	        }

	 

	        return res;    
	    }
	    String getNames2(String input)
	    {
	        getNames(input);
	        String result="";
	        for(int x=0;x<res.size()-1;x++)
	        {
	            result=result+res.get(x)+",";
	        }
	        result=result+res.get(res.size()-1);
	        return result;    
	    }

	 

	    public static void main(String[] args)
	    {
	        String input="ram,rahim,robert,farhan,aditi,reshma,guna";
	        System.out.println(new Arraylist().getNames(input));
	        System.out.println(new Arraylist().getNames2(input));
	    }
	    
	}

