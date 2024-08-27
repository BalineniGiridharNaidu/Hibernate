package com.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class address
{	
	@Id
	@GeneratedValue
	private int aid;
	private String aloc;
	private int apincode;
	
	
	
	@Override
	public String toString()
	{
		return "address [aid=" + aid + ", aloc=" + aloc + ", apincode=" + apincode + "]";
	}

	public address()
	{
		super();
	}

	public address(String aloc, int apincode)
	{
		super();
		this.aloc = aloc;
		this.apincode = apincode;
	}
	
	public int getAid()
	{
		return aid;
	}
	public void setAid(int aid)
	{
		this.aid = aid;
	}
	public String getAloc()
	{
		return aloc;
	}
	public void setAloc(String aloc)
	{
		this.aloc = aloc;
	}
	public int getApincode()
	{
		return apincode;
	}
	public void setApincode(int apincode)
	{
		this.apincode = apincode;
	}
	
	
}
