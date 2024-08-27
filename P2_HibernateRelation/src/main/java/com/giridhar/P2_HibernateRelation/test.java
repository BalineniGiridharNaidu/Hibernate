package com.giridhar.P2_HibernateRelation;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pojos.alien;
import com.utils.connection;

public class test
{
	public static void main(String[] args)
	{
		try
		{
			Session s = connection.getSession();
//			Transaction t = s.beginTransaction();
//			
//			s.save( new alien("Giri", 89) );
//			s.save( new alien("NIna", 9) );
//			s.save( new alien("vini", 67) );
//			s.save( new alien("jesse", 67) );
//			s.save( new alien("sai", 23) );
//			s.save( new alien("lessa", 90) );
//			s.save( new alien("eer", 90) );
//			s.save( new alien("vani", 12) );
//			s.save( new alien("hima", 23) );
//			
//			t.commit();
//			s.close();
			
			
//			List<alien> al = s.createQuery("from alien").list();
//			
//			for(alien a : al)
//			{
//				System.out.println(a);
//			}
			
			
			Query q = s.createQuery("select count(aid), sum(aage), max(aage), min(aage) from alien as a");
			
			
			
			
			List<Object[]> l = q.list();
			for(Object[] oa : l)
			{
				for(Object aa : oa) {
					System.out.print(" " + aa);
				}
				System.out.println();
			}
			
			
			
			
			
		}catch(Exception e) { System.out.println("================== catch block executed =============="); e.printStackTrace();}
		finally { connection.closeSessionFactory(); }
	}
}
