package com.p1;

public class teamlead
{
	private developer dev;
	
	public void SetDeveloper(developer dev)
	{
		this.dev = dev;
	}
	
	public void doWork()
	{
		System.out.println("teamlead work started");
		dev.doWork();
		System.out.println("teamlead work completed");
	}
}
