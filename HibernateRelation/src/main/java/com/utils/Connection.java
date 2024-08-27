package com.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Connection
{
	private static Configuration cfg = new Configuration().configure();
	private static ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
	private static SessionFactory sf = cfg.buildSessionFactory(sr);
	
	public static Session getSession()
	{
		return sf.openSession();
	}
	
	public static void closeSessionFactory()
	{
		sf.close();
	}
	
}
