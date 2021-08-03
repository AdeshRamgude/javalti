package com.lti.app.Hibernateddl2hbm;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import inheritance.Bank;
import inheritance.ICICIBank;
import inheritance.SBIBank;
import mapping.Course;
import mapping.Student;


public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
        SessionFactory sFac=cfg.configure().buildSessionFactory();   

        Session s=sFac.openSession();   
        Transaction tx=s.beginTransaction();
        
        Dept d1=new Dept(100,"adesh","shirdi",20);
        
        //Course course1=new Course(201,"Angular", 200);
//        Student s1=new Student(1001,"Rahul","Male");
//        Student s2=new Student(1002,"Rani","Female");
//        
//        Set<Student> obj=new HashSet<Student>();
//        obj.add(s1);
//        obj.add(s2);
//        
//      
//        Set<Course> crs=new HashSet<Course>();
//        Course c1=new Course(100,"Java",20);
//        Course c2=new Course(101,"React",30);
//        
//        crs.add(c1);
//        crs.add(c2);
//        
//        s1.setCourses(crs);
//        s2.setCourses(crs);
// 
        
//        Bank bank=new Bank(101,"RBI","Delhi");
//        ICICIBank ico=new ICICIBank(201,"Icici Bank", "Chennai", null);
//        ico.setLombardInsurance("With Higher benefits");
//
//        SBIBank sbi=new SBIBank(301, "SBI Bank", "Mumbai", null);
//        sbi.setCarLoanInt("10.67/annum");
//
//        s.save(bank);
//        s.save(ico);
//        s.save(sbi);


//        s.save(s1);
//        s.save(s2);
        s.save(d1);
        tx.commit();
        s.close();
        sFac.close();

        System.out.println("Data Saved....");
       }
}
