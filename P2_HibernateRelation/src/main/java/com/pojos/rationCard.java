package com.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rationcard_details")
public class rationCard
{	
	@Id
	@GeneratedValue
	 private int rid;
	 private String rnum;
	 
	 public rationCard() {}

	public rationCard(String rnum)
	{
		super();
		this.rnum = rnum;
	}

	public int getRid()
	{
		return rid;
	}

	public void setRid(int rid)
	{
		this.rid = rid;
	}

	public String getRnum()
	{
		return rnum;
	}

	public void setRnum(String rnum)
	{
		this.rnum = rnum;
	}

	@Override
	public String toString()
	{
		return "rationCard [rid=" + rid + ", rnum=" + rnum + "]";
	}
	
	
		
		
	 
	 
}
