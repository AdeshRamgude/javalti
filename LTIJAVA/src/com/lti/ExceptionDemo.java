package com.lti;

class InvalidAgeException extends Exception
{
    public InvalidAgeException(String message)
    {
        super(message);
    }
}
class VerifyAge
{
        void verify(int age) throws InvalidAgeException
        {
            if(age<18)
                throw new InvalidAgeException("Invalid Age");
            System.out.println("Age Verified");
        }
}
public class ExceptionDemo
{   
public static void main(String[] args)
{
                VerifyAge va=new VerifyAge();   
                try {
                    va.verify(20);
                } catch (InvalidAgeException e)
                {
                System.out.println(e.getMessage());
                }
}
}
 