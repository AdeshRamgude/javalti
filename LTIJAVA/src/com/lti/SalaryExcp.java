package com.lti;

class InvalidSalException extends Exception
{
    public InvalidSalException(String message)
    {
        super(message);
    }
}
class VerifySal
{
        void verify(int sal) throws InvalidSalException
        {
            if(sal<0) {
                throw new InvalidSalException("negative sal");
            }
            else if(sal>5000)
            {
            	throw new InvalidSalException("raised sal");
            }
            else
            {
            	System.out.println("Sal verified");
            }
        }
}
public class SalaryExcp
{   
public static void main(String[] args)
{
                VerifySal va=new VerifySal();   
                try {
                    va.verify(-1);
                } catch (InvalidSalException e)
                {
                System.out.println(e.getMessage());
                }
}
}
