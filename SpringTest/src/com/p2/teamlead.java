package com.p2;

public class teamlead
{
	private developer dev;
	
	public teamlead(developer dev)
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
