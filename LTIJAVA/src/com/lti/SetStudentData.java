package com.lti;

public class SetStudentData 
{

    StudentVO setStudentData()
     {
         StudentVO svo=new StudentVO();

         svo.setSid(100);
         svo.setName("Ritik");
         svo.setAge(21);
         svo.setGender("Male");
         svo.setCity("Delhi");
 
         
        return svo;
     }
 
}
