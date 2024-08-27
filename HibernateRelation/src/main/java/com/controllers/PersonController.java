package com.controllers;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pojos.*;
import com.utils.Connection;

public class PersonController
{
	public void savePerson(person p)
	{
		Session s = Connection.getSession();
		Transaction tx = s.beginTransaction();
		s.save(p);
		tx.commit();					
	}
	
	public void getAll()
	{
		Session s = Connection.getSession();
		Query q = s.createQuery(" from person p");
		List<person> pl = q.list();
		for(person p : pl)
		{
			System.out.println(p);
		}
	}
	
	public void getByid(int id)
	{
		Session s = Connection.getSession();
		person p = (person) s.get(person.class, id);
		System.out.println(p);
	}
	
	public void getByName(String name)
	{
		Session s = Connection.getSession();
		Query q = s.createQuery("from person p where p.pname = :n");
		q.setParameter("n", name);
		person p = (person) q.uniqueResult();
		System.out.println(p);
	}
}
