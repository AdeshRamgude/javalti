package com.lti.app.ems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeDAO {
	Configuration cfg;
	SessionFactory sFac;
	public EmployeeDAO(){

		cfg=new Configuration();
        
        sFac=cfg.addAnnotatedClass(Ems.class).configure().buildSessionFactory();
       
	}
	public void newEmployee(Ems e) {
		Session s=sFac.openSession();
        Transaction tx=s.beginTransaction();
        s.save(e);
        tx.commit();
        s.close();
        System.out.println("Employee Added!");
	}
	
	public void getEmployee(int empid){
		Session s=sFac.openSession();
        Transaction tx=s.beginTransaction();
        
        Ems e=null;
        e=s.get(Ems.class, empid);
        System.out.println(e);
        
        tx.commit();
        s.close();
		
		
	}
	
	public List<Ems> getAllEmployees(){
		Session s=sFac.openSession();
        Transaction tx=s.beginTransaction();
        
        List<Ems> ls=new ArrayList<>();
        ls=s.createQuery("from Ems").list();
        
        tx.commit();
        s.close();
		return ls;
		
	}
	
	 public void updateEmployee(int empid) {
		 Scanner sc=new Scanner(System.in);
		 Session s=sFac.openSession();
	        Transaction tx=s.beginTransaction();
	        

	        Ems e=null;
	        e=s.get(Ems.class, empid);
	        if(e==null) {
	        	System.out.println("Invalid username");
	        	return;
	        }
	        System.out.println(e);
	        
	        System.out.println("Enter new name:");
	        e.setName(sc.next());
	        System.out.println("Enter new age:");
	        e.setAge(sc.nextInt());
	        System.out.println("Enter new city:");
	        e.setCity(sc.next());
	        
	        s.update(e);
	        tx.commit();
	        s.close();
	        System.out.println("Updation done!");
	 }
	 
	 public void deleteEmployee(int empid) {
		 Session s=sFac.openSession();
	        Transaction tx=s.beginTransaction();
	        
	        Ems e=null;
	        e=s.get(Ems.class, empid);
	        if(e==null) {
	        	System.out.println("Invalid id");
	        	return;
	        }
	        s.delete(e);
	        
	        tx.commit();
	        s.close();
	        System.out.println("Deleted successfully!");
	 }
}
