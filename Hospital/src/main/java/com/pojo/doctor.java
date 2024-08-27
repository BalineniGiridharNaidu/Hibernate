package com.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class doctor
{	
	
	@Id
	@GeneratedValue
	private int did;
	private String dname;
	private String dspec;
	private double dfees;
	
	
	
	@Override
	public String toString()
	{
		return "doctor [did=" + did + ", dname=" + dname + ", dspec=" + dspec + ", dfees=" + dfees + "]";
	}
	public doctor()
	{
		super();
	}
	public doctor(String dname, String dspec, double dfees)
	{
		super();
		this.dname = dname;
		this.dspec = dspec;
		this.dfees = dfees;
	}
	public int getDid()
	{
		return did;
	}
	public void setDid(int did)
	{
		this.did = did;
	}
	public String getDname()
	{
		return dname;
	}
	public void setDname(String dname)
	{
		this.dname = dname;
	}
	public String getDspec()
	{
		return dspec;
	}
	public void setDspec(String dspec)
	{
		this.dspec = dspec;
	}
	public double getDfees()
	{
		return dfees;
	}
	public void setDfees(double dfees)
	{
		this.dfees = dfees;
	}
	
	
}
