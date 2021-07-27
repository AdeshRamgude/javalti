package com.lti;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class DateFormat {
public static void main(String[] args) throws ParseException {
	 String var="15-07-2021";
     SimpleDateFormat sdf1=new SimpleDateFormat("dd-MM-yyyy");
     Date obj=null;
     obj=sdf1.parse(var);
    
     SimpleDateFormat sdf2=new SimpleDateFormat("EEEE");
     String dayName=sdf2.format(obj);
     System.out.println(dayName);
}
}
