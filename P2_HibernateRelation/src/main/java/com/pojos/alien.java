package com.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alien_details")
public class alien
{	
	@Id
	@GeneratedValue
	@Column(name = "alien_id")
	private int aid;
	@Column(name = "alien_name")
	private String aname;
	@Column(name = "alien_age")
	private double aage;
	
	public int getAid()
	{
		return aid;
	}
	public void setAid(int aid)
	{
		this.aid = aid;
	}
	public String getAname()
	{
		return aname;
	}
	public void setAname(String aname)
	{
		this.aname = aname;
	}
	public double getAage()
	{
		return aage;
	}
	public void setAage(double aage)
	{
		this.aage = aage;
	}
	
	public alien(String aname, double aage)
	{
		super();
		this.aname = aname;
		this.aage = aage;
	}
	
	public alien()
	{
		super();
	}
	@Override
	public String toString()
	{
		return "alien [aid=" + aid + ", aname=" + aname + ", aage=" + aage + "]";
	}
	
	
	
}
