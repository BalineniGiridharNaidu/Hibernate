package com.springtest;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_details")
public class empPojo
{	
	@Id
	private int eid;
	private String ename;
	private double esal;
	private String edesg;
	
	public empPojo()
	{
		
	}
	
	public int getEid()
	{
		return eid;
	}
	public void setEid(int eid)
	{
		this.eid = eid;
	}
	public String getEname()
	{
		return ename;
	}
	public void setEname(String ename)
	{
		this.ename = ename;
	}
	public double getEsal()
	{
		return esal;
	}
	public void setEsal(double esal)
	{
		this.esal = esal;
	}
	public String getEdesg()
	{
		return edesg;
	}
	public void setEdesg(String edesg)
	{
		this.edesg = edesg;
	}
	
	
}
