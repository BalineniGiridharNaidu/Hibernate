package com.pojos;

import javax.persistence.Embeddable;

@Embeddable
public class twoPojo
{
	private int tid;
	private String tname;
	private double tsal;
	
	
	
	
	
	public twoPojo(String tname, double tsal)
	{
		super();
		this.tname = tname;
		this.tsal = tsal;
	}


	public twoPojo()
	{
		super();
	}
	
	
	public int getTid()
	{
		return tid;
	}
	public void setTid(int tid)
	{
		this.tid = tid;
	}
	public String getTname()
	{
		return tname;
	}
	public void setTname(String tname)
	{
		this.tname = tname;
	}
	public double getTsal()
	{
		return tsal;
	}
	public void setTsal(double tsal)
	{
		this.tsal = tsal;
	}
	@Override
	public String toString()
	{
		return "twoPojo [tid=" + tid + ", tname=" + tname + ", tsal=" + tsal + "]";
	}
	
	
}
