package com.springtest;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.utils.Connection;

public class empDao
{
	private empFile empf;

//	public empFile getEmpf()
//	{
//		return empf;
//	}

	public void setEmpf(empFile empf)
	{
		this.empf = empf;
	}
	
	public void saveDataIntoDatabase()
	{	
		Session s = null;
		try
		{
			List<empPojo> data = empf.getEmpData();
			s = Connection.getSession();
			Transaction t = s.beginTransaction();
			for(empPojo e : data)
			{
				s.save(e);
			}
			t.commit();
		}
		finally 
		{
			if(s.isOpen())
				s.close();
			Connection.closeSessionFactory();
		}
		
	}
}
