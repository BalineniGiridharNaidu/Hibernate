package com.giridhar.SqlTestWithHibernate;

import org.hibernate.Session;

import com.utils.connection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try
		{
			Session s = connection.getSession();
			System.out.println(s);
			
			
		} 
        catch (Exception e) {System.out.println("=========== catch block executed =========="); e.printStackTrace();}
		finally { connection.closeSessionFactory(); }
    }
}
