package com.giridhar.P2_HibernateRelation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.controller.personController;
import com.controller.twoPojoOneTableController;
import com.pojos.address;
import com.pojos.emp;
import com.pojos.onePojo;
import com.pojos.twoPojo;
import com.utils.connection;
import com.controller.*;

public class App 
{	
	
	public static void main(String[] args)
	{
		try
		{
			CompController compc = new CompController();
			
			emp e1 = new emp();
			e1.setEid(1);
			e1.setEname("Siva");
			
			address a1 = new address();
			a1.setPk1(2);
			a1.setPk2(2);
			e1.setAddr(a1);
			
			compc.save(e1);
			
			
			
		} 
       catch (Exception e) {System.out.println("============ Catch Block Executed ============"); e.printStackTrace(); }
	   finally { connection.closeSessionFactory(); }
	}
	
	
	
	
	public static void mainonepojotwotables( String[] args )
    {	
		try
		{
			
			onePojo op = new onePojo();
			op.setOname("Siva");
			op.setOsal(6789);
			
			twoPojo tp = new twoPojo();
			tp.setTid(123);
			tp.setTname("Ram");
			tp.setTsal(89000);
			
			op.setTp(tp);
			
			twoPojoOneTableController tpc = new twoPojoOneTableController();
			tpc.save(op);
			
			
		} 
        catch (Exception e) {System.out.println("============ Catch Block Executed ============"); e.printStackTrace(); }
		finally { connection.closeSessionFactory(); }
    }
	
	
	
	 public static void mainioo( String[] args )
	    {	
		 
		 
	        try
			{
				personController pc = new personController();
			    
				pc.testJoinsCriterion();
							
			} 
	        catch (Exception e) {System.out.println("============ Catch Block Executed ============"); e.printStackTrace(); }
			finally { connection.closeSessionFactory(); }
	    }
	
	
	
    public static void main1( String[] args )
    {
        try
		{
			personController pc = new personController();
		    
			pc.getAll();
			
			
			
			
			
		} 
        catch (Exception e) {System.out.println("============ Catch Block Executed ============"); e.printStackTrace(); }
		finally { connection.closeSessionFactory(); }
    }
}
