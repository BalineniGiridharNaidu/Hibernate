package com.controller;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pojos.onePojo;
import com.utils.connection;

public class twoPojoOneTableController
{
	public void save(onePojo p)
	{
		Session s = connection.getSession();
		Transaction t = s.beginTransaction();
		s.save(p);
		t.commit();
		s.close();
	}
}
