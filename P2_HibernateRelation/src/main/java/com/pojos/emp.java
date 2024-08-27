package com.pojos;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class emp
{	
	
	private int eid;
	private String ename;
	
	@EmbeddedId
	private address addr;

	public int getEid()
	{
		return eid;
	}

	public void setEid(int eid)
	{
		this.eid = eid;
	}

	public String getEname()
	{
		return ename;
	}

	public void setEname(String ename)
	{
		this.ename = ename;
	}

	public address getAddr()
	{
		return addr;
	}

	public void setAddr(address addr)
	{
		this.addr = addr;
	}
	
	
	
}
