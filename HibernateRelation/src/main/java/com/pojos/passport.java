package com.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class passport
{	
	@Id
	@GeneratedValue
	private int passid;
	private String passnum;
	private int passexpd;
	
	
	public passport()
	{
		super();
	}

	public passport(String passnum, int passexpd)
	{
		super();
		this.passnum = passnum;
		this.passexpd = passexpd;
	}

	@Override
	public String toString()
	{
		return "passport [passid=" + passid + ", passnum=" + passnum + ", passexpd=" + passexpd + "]";
	}
	
	public int getPassid()
	{
		return passid;
	}
	public void setPassid(int passid)
	{
		this.passid = passid;
	}
	public String getPassnum()
	{
		return passnum;
	}
	public void setPassnum(String passnum)
	{
		this.passnum = passnum;
	}
	public int getPassexpd()
	{
		return passexpd;
	}
	public void setPassexpd(int passexpd)
	{
		this.passexpd = passexpd;
	}
	
	
	
}
