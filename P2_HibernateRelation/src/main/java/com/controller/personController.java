package com.controller;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Restrictions;

import com.pojos.person;
import com.utils.connection;

public class personController
{	
	
	public void testJoinsCriterion()
	{
		Session s = connection.getSession();
		Criteria cr = s.createCriteria(person.class, "p" ).createAlias("p.Ban", "jt");
		
	}
	
	public void getAllByCriteriaWithRestrictions()
	{
		Session s = connection.getSession();
		Criteria cr = s.createCriteria(person.class)//add(Restrictions.eq("pname", "Giri"))
													.add(Restrictions.ge("pid", 4));
		List<person> list = cr.list();
		for(person p : list)
		{
			System.out.println(p);
		}
	}
	
	
	
	
	public void getAllByCriteria()
	{
		Session s = connection.getSession();
		Criteria cr = s.createCriteria(person.class);
		List<person> list = cr.list();
		for(person p : list)
		{
			System.out.println(p);
		}
	}
	
	
	
	public void getAll()
	{
		Session s = connection.getSession();
		Query q = s.createQuery("from person p");
		List<person> list = q.list();
		for(person p : list)
		{
			System.out.println(p);
		}
	}
}
