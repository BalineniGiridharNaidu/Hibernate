package com.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class bed
{	
	@Id
	@GeneratedValue
	private int bid;
	private String btype;
	private boolean isOccupied;
	private double bfees;
	
	
	public bed(String btype, boolean isOccupied, double bfees)
	{
		super();
		this.btype = btype;
		this.isOccupied = isOccupied;
		this.bfees = bfees;
	}
	
	
	
	@Override
	public String toString()
	{
		return "bed [bid=" + bid + ", btype=" + btype + ", isOccupied=" + isOccupied + ", bfees=" + bfees + "]";
	}



	public bed()
	{
		super();
	}



	public int getBid()
	{
		return bid;
	}
	public void setBid(int bid)
	{
		this.bid = bid;
	}
	public String getBtype()
	{
		return btype;
	}
	public void setBtype(String btype)
	{
		this.btype = btype;
	}
	public boolean isOccupied()
	{
		return isOccupied;
	}
	public void setOccupied(boolean isOccupied)
	{
		this.isOccupied = isOccupied;
	}
	public double getBfees()
	{
		return bfees;
	}
	public void setBfees(double bfees)
	{
		this.bfees = bfees;
	}
	
	
	
}
