package com.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BankAccount
{	
	@Id
	@GeneratedValue
	private int bid;
	private String Bname;
	private double Blnc;
	
	public BankAccount() {}
	
	public BankAccount(String bname, double blnc)
	{
		super();
		Bname = bname;
		Blnc = blnc;
	}

	public int getBid()
	{
		return bid;
	}

	public void setBid(int bid)
	{
		this.bid = bid;
	}

	public String getBname()
	{
		return Bname;
	}

	public void setBname(String bname)
	{
		Bname = bname;
	}

	public double getBlnc()
	{
		return Blnc;
	}

	public void setBlnc(double blnc)
	{
		Blnc = blnc;
	}

	@Override
	public String toString()
	{
		return "BankAccount [bid=" + bid + ", Bname=" + Bname + ", Blnc=" + Blnc + "]";
	}
	
	
	
	
}
