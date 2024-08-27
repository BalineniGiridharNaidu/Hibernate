package com.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class mobile
{	
	@Id
	@GeneratedValue
	private int mid;
	private String msim;
	private long mnum;
	
	
	
	public mobile()
	{
		super();
	}

	public mobile(String msim, long mnum)
	{
		super();
		this.msim = msim;
		this.mnum = mnum;
	}

	@Override
	public String toString()
	{
		return "mobile [mid=" + mid + ", msim=" + msim + ", mnum=" + mnum + "]";
	}
	
	public int getMid()
	{
		return mid;
	}
	public void setMid(int mid)
	{
		this.mid = mid;
	}
	public String getMsim()
	{
		return msim;
	}
	public void setMsim(String msim)
	{
		this.msim = msim;
	}
	public long getMnum()
	{
		return mnum;
	}
	public void setMnum(long mnum)
	{
		this.mnum = mnum;
	}
	
	
}
