package com.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class foodBeverages
{	
	@Id
	@GeneratedValue
	private int fid;
	private String fname;
	private double fquantity;
	private double famount;
	
	
	
	@Override
	public String toString()
	{
		return "foodBeverages [fid=" + fid + ", fname=" + fname + ", fquantity=" + fquantity + ", famount=" + famount
				+ "]";
	}
	
	public foodBeverages(String fname, double fquantity, double famount)
	{
		super();
		this.fname = fname;
		this.fquantity = fquantity;
		this.famount = famount;
	}
	public foodBeverages()
	{
		super();
	}
	public int getFid()
	{
		return fid;
	}
	public void setFid(int fid)
	{
		this.fid = fid;
	}
	public String getFname()
	{
		return fname;
	}
	public void setFname(String fname)
	{
		this.fname = fname;
	}
	public double getFquantity()
	{
		return fquantity;
	}
	public void setFquantity(double fquantity)
	{
		this.fquantity = fquantity;
	}

	public double getFamount()
	{
		return famount;
	}

	public void setFamount(double famount)
	{
		this.famount = famount;
	}
	
	
}
