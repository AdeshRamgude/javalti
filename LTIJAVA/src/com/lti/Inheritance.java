package com.lti;

class Bank
{
     String bankCode;
     String bankName;
     void deposit()
     {
         System.out.println("Deposit Money");
     }
     void withdraw()
     {
         System.out.println("Withdraw Money");
     }
}

class ICICIBank  extends Bank
{

        void setDetails()
        {
            bankCode="B001";
            bankName="ICICI";
        }
         void deposit() // Overriding
         {
        	 super.deposit();
             System.out.println("Deposit Money in ICICI");
         }
        void display()
        {
            System.out.println("ID "+bankCode+" Name "+bankName);
        }
}


public class Inheritance
{
	public static void main(String[] args)
		{
	        ICICIBank ic1=new ICICIBank();
	        ic1.setDetails();
	        ic1.deposit();
	        ic1.withdraw();
	        ic1.display();
	}
}
