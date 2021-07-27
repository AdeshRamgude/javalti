package com.lti;
import java.sql.*;
import java.util.Scanner;

public class SQLInsert {
	


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter Employee Details: ");
			System.out.print("EmpID");
			int eid=sc.nextInt();
			System.out.print("FName: ");
			String fname= sc.next();
			System.out.print("LName");
			String lname=sc.next();
	
			try {
		    	 //load a driver
				Class.forName("oracle.jdbc.driver.OracleDriver");
				//establishing a connection with DB
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","LTI","adesh");
				
				/*Statement stmt= con.createStatement();
				String qry="insert into ProductInfo values("+pid+",'"+pname+"',"+price+",'"+cat+"')";
			    stmt.executeUpdate(qry);*/
				//it is difficult to write so use below statement
				
				
				PreparedStatement ps= con.prepareStatement("insert into employee values(?,?,?)");
			    ps.setInt(1, eid);
			    ps.setString(2, fname);
			    ps.setString(3, lname);
			   
			    
			    ps.executeUpdate();
			    
				System.out.println("Data Saved Successfully...");
			    
		     
		     } catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		     catch(SQLException e)
		     {
		    	 //e.printStackTrace();
		    	 System.out.println("ProducrID Existing...");
		     }
			

	}

	}


