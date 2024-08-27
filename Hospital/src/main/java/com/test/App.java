package com.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.controller.pOperations;
import com.pojo.address;
import com.pojo.doctor;
import com.pojo.patient;
import com.utils.connection;

public class App 
{
    public static void main( String[] args )
    {
       try
       {	
    	   pOperations pop = new pOperations();	  
    	  System.out.println( pop.labBill(1) );
    	       	   
       }
       catch(Exception e) {System.out.println("=============== Catch block executed ==============="); e.printStackTrace();}
       finally {connection.closeSessionFactory();}
    }
}
