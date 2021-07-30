package com.lti.app.ems;

import java.util.List;
import java.util.Scanner;


public class EmpUI {

	public void ui() {
		Scanner sc=new Scanner(System.in);
		EmployeeDAO x=new EmployeeDAO();
		while(true) {
			System.out.println("-----MENU-----");
			System.out.println("1.New Employee");
			System.out.println("2.Edit Employee");
			System.out.println("3.Delete Employee");
			System.out.println("4.View All Employees");
			System.out.println("5.Exit");
			System.out.println("Enter your choice:");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter id:");
				int id=sc.nextInt();
				System.out.println("Enter name");
				String name=sc.next();
				System.out.println("Enter age:");
				int age=sc.nextInt();
				System.out.println("Enter city:");
				String city=sc.next();
				Ems e=new Ems(id, name,city, age );
				
				x.newEmployee(e);
				break;
			case 2:
				System.out.println("Enter emp id to edit:");
				int eid=sc.nextInt();
				x.updateEmployee(eid);
				break;
			case 3:
				System.out.println("Enter emp id:");
				int eid1=sc.nextInt();
				x.deleteEmployee(eid1);
				break;
			case 4:
				List<Ems> ls=x.getAllEmployees();
				System.out.println("Employee List:");
				for(Ems y:ls) {
					System.out.println(y);
				}
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("Invalid choice");
			}
		}
	}
}