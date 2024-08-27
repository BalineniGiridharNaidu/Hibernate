package com.pojos;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class address implements Serializable
{
	private int pk1;
	private int pk2;
	
	public int getPk1()
	{
		return pk1;
	}
	public void setPk1(int pk1)
	{
		this.pk1 = pk1;
	}
	public int getPk2()
	{
		return pk2;
	}
	public void setPk2(int pk2)
	{
		this.pk2 = pk2;
	}
	
	
}
