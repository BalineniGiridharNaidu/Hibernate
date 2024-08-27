package com.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class connection
{
	private static final Configuration cfg = new Configuration().configure();
	private static final ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
	private static final SessionFactory sf = cfg.buildSessionFactory(sr);
	
	public static Session getSession()
	{
		return sf.openSession();
	}
	
	public static void closeSessionFactory()
	{
		if(!sf.isClosed())
			sf.close();
	}
	
}
