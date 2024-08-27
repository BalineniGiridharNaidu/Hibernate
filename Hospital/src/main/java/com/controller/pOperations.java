package com.controller;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.pojo.address;
import com.pojo.bed;
import com.pojo.contact;
import com.pojo.doctor;
import com.pojo.foodBeverages;
import com.pojo.labTest;
import com.pojo.patient;
import com.utils.connection;

public class pOperations
{
	
	public double labBill(int pid)
	{	
		Session s = connection.getSession();
		Criteria cr = s.createCriteria(patient.class, "p");
		cr.createAlias("p.labt", "lab");
		
		ProjectionList pl = Projections.projectionList();
		//pl.add(Projections.property("p.pname"));
		pl.add(Projections.property("lab.ltfees"));
		
		cr.setProjection(pl);
		
		cr.add(Restrictions.idEq(pid));
		
		double fee = 0;
		List<Object> data = cr.list();
		for(Object obj : data)
		{
			fee += (int) obj; 
		}
		
		
		return fee;
	}
	
	public double doctorBill(int pid)
	{
		return 0.0;
	}
	
	public double foodBill(int pid)
	{
		return 0.0;
	}
	
	
	public void save(patient p)
	{	
		Session s = connection.getSession();
		List<Object> b = s.createQuery("select count(*) from patient p").list();
		long count = (long) b.get(0);
		System.out.println("You can add upto 8 patients only");
		if(count < 8)
		{
			if(p.getAdr() != null)
			{	
				p.setB(new bed("AC", true, 8976));
				Transaction t = s.beginTransaction();
				s.save(p);
				t.commit();
				s.close();
				System.out.println("patient admitted to the hospital successfully");
			}
			else
			{
				System.out.println("Address data cannot be empty, please add your address!!!!");
			}
		}
		else
		{
			System.out.println("Sorry the beds in our hospital is filled completely.....");
		}
		
	}
	
	public void addDoctorsById(int pid, List<doctor> doc)
	{
		Session s = connection.getSession();
		Transaction t = s.beginTransaction();
		patient p = (patient) s.get(patient.class, pid);
		p.setDoc(doc);
		s.update(p);
		t.commit();
		s.close();
		System.out.println("List of doctors added successfully");
	}
	
	public void UpdateAddressById(int pid, address add)
	{
		Session s = connection.getSession();
		Transaction t = s.beginTransaction();
		patient p = (patient) s.get(patient.class, pid);
		p.setAdr(add);
		s.update(p);
		t.commit();
		s.close();
		System.out.println("Address added successfully");
	}
	
	public void addLabtestsById(int pid, List<labTest> tests)
	{
		Session s = connection.getSession();
		Transaction t = s.beginTransaction();
		patient p = (patient) s.get(patient.class, pid);
		p.setLabt(tests);
		s.update(p);
		t.commit();
		s.close();
		System.out.println("List of labtests added successfully");
	}
	
	public void addFoodBeveragesById(int pid, List<foodBeverages> tests)
	{
		Session s = connection.getSession();
		Transaction t = s.beginTransaction();
		patient p = (patient) s.get(patient.class, pid);
		p.setFb(tests);
		s.update(p);
		t.commit();
		s.close();
		System.out.println("List of Foods added successfully");
	}
	
	public void addContactDetailsById(int pid, List<contact> contacts)
	{
		Session s = connection.getSession();
		Transaction t = s.beginTransaction();
		patient p = (patient) s.get(patient.class, pid);
		p.setCdetails(contacts);
		s.update(p);
		t.commit();
		s.close();
		System.out.println("List of contacts added successfully");
	}
	
	public patient getById(int id)
	{
		Session s = connection.getSession();
		return (patient) s.get(patient.class, id);
	}
	
	
	public void getPatientByName(String name)
	{
		Session s = connection.getSession();
		List<patient> data = s.createQuery("from patient as p where p.pname = :a").setParameter("a", name).list();
		for(patient p : data)
		{
			System.out.println(p.getPid()+" -- "+p.getPname()+" -- "+p.getPage()+" -- "+p.getPcondition()+" -- "+p.getAdr()+" -- "+p.getB()+" -- "+p.getLabt()+" -- "+p.getCdetails()+" -- "+p.getDoc());;
		}
	}
	
	public void dischargePatientById(int pid)
	{
		Session s = connection.getSession();
		Transaction t = s.beginTransaction();
		s.delete(s.get(patient.class, pid));
		t.commit();
		s.close();
		System.out.println("Patient data deleted from our database successfully");
	}
	
	
	
}
