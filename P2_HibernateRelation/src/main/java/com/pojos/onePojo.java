package com.pojos;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class onePojo
{	
	@Id
	@GeneratedValue
	private int oid;
	private String oname;
	private double osal;
	
	
	@Embedded
	private twoPojo tp;
	
	
	
	
	
	

	public onePojo()
	{
		super();
	}

	public onePojo(String oname, double osal, twoPojo tp)
	{
		super();
		this.oname = oname;
		this.osal = osal;
		this.tp = tp;
	}

	public int getOid()
	{
		return oid;
	}

	public void setOid(int oid)
	{
		this.oid = oid;
	}

	public String getOname()
	{
		return oname;
	}

	public void setOname(String oname)
	{
		this.oname = oname;
	}

	public double getOsal()
	{
		return osal;
	}

	public void setOsal(double osal)
	{
		this.osal = osal;
	}

	public twoPojo getTp()
	{
		return tp;
	}

	public void setTp(twoPojo tp)
	{
		this.tp = tp;
	}
	
	
}
