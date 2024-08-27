package com.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class labTest
{	
	@Id
	@GeneratedValue
	private int ltid;
	private String ltname;
	private double ltfees;
	
	
	
	@Override
	public String toString()
	{
		return "labTest [ltid=" + ltid + ", ltname=" + ltname + ", ltfees=" + ltfees + "]";
	}
	public labTest()
	{
		super();
	}
	public labTest(String ltname, double ltfees)
	{
		super();
		this.ltname = ltname;
		this.ltfees = ltfees;
	}
	public int getLtid()
	{
		return ltid;
	}
	public void setLtid(int ltid)
	{
		this.ltid = ltid;
	}
	public String getLtname()
	{
		return ltname;
	}
	public void setLtname(String ltname)
	{
		this.ltname = ltname;
	}
	public double getLtfees()
	{
		return ltfees;
	}
	public void setLtfees(double ltfees)
	{
		this.ltfees = ltfees;
	}
	
	
}
