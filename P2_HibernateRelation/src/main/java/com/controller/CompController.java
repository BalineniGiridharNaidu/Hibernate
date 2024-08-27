package com.controller;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pojos.emp;
import com.utils.connection;

public class CompController
{
	public void save(emp e)
	{
		Session s = connection.getSession();
		Transaction t =  s.beginTransaction();
		s.save(e);
		t.commit();
		s.close();
	}
}
