package com.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class course
{	
	@Id
	@GeneratedValue
	private int cid;
	private String cname;
	
	
	
	public course()
	{
		super();
	}
	public course(String cname)
	{
		super();
		this.cname = cname;
	}
	public int getCid()
	{
		return cid;
	}
	public void setCid(int cid)
	{
		this.cid = cid;
	}
	public String getCname()
	{
		return cname;
	}
	public void setCname(String cname)
	{
		this.cname = cname;
	}
	
	@Override
	public String toString()
	{
		return "course [cid=" + cid + ", cname=" + cname + "]";
	}
	
	
	
}
