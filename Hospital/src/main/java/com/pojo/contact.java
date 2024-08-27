package com.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class contact
{	
	@Id
	@GeneratedValue
	private int cid;
	private String cname;
	private long cmobnum;
	
	
	
	@Override
	public String toString()
	{
		return "contact [cid=" + cid + ", cname=" + cname + ", cmobnum=" + cmobnum + "]";
	}



	public contact(String cname, long cmobnum)
	{
		super();
		this.cname = cname;
		this.cmobnum = cmobnum;
	}
	
	
	
	public contact()
	{
		super();
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
	public long getCmobnum()
	{
		return cmobnum;
	}
	public void setCmobnum(long cmobnum)
	{
		this.cmobnum = cmobnum;
	}
	
	
}
