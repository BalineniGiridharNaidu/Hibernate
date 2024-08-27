package com.giridhar.HibernateRelations;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.controllers.PersonController;
import com.pojos.course;
import com.pojos.mobile;
import com.pojos.passport;
import com.pojos.person;
import com.utils.Connection;

public class App 
{
	
	public static void main(String[] args)
	{
		try
		{
			
			PersonController pc = new PersonController();
			pc.getByName("Giridhar Naidu");
			
			
			
			
		}
		catch(Exception e) { System.out.println("\n============ Catch block executed ============\n"); e.printStackTrace(); }
	    finally { Connection.closeSessionFactory(); } 
	}  

	
	public static void mainGetByid(String[] args)
	{
		try
		{
			
			
			PersonController pc = new PersonController();
//			pc.getAll();
			pc.getByid(4);
			
			
			
			
		}catch(Exception e) { System.out.println("\n============ Catch block executed ============\n"); e.printStackTrace(); }
	    finally { Connection.closeSessionFactory(); } 
	}  
	
	
    public static void mainSave( String[] args )
    {
       try
       {
    	   
    	   List<mobile> mob = new ArrayList<>();
    	   
    	   mobile m1 = new mobile("Vodafone", 90876L);
    	   mobile m2 = new mobile("Bsnl", 3467689L);
//    	   mobile m3 = new mobile("Vimeo", 9097689L);
//    	   mobile m4 = new mobile("Bsnl", 34689L);
    	   
    	   mob.add(m1);
    	   mob.add(m2);
//    	   mob.add(m3);
//    	   mob.add(m4);
    	   
//    	   List<course> cou = new ArrayList<>();
//    	   
//    	   course c1 = new course("Medical Coding");
//    	   course c2 = new course("C++");
 //   	   course c3 = new course("Amazon Web Services");
//    	   course c4 = new course("Devops");
//    	   course c5 = new course("Python");
//    	   course c6 = new course("Testing");
    	   
//    	   cou.add(c1);
//    	   cou.add(c2);
 //   	   cou.add(c3);
//    	   cou.add(c4);
//    	   cou.add(c5);
//    	   cou.add(c6);
    	   
    	   passport pt = new passport("VGT", 2056);
    	   
    	  person p = new person("Ajay", 19, "Indore", pt, null, mob);
    	   
    	   
    	  PersonController pc = new PersonController();
    	  
    	  pc.savePerson(p);
    	       	 
       }
       catch(Exception e) { System.out.println("\n============ Catch block executed ============\n"); e.printStackTrace(); }
       finally { Connection.closeSessionFactory(); }
    }
}
