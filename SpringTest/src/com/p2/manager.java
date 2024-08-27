package com.p2;

public class manager
{
	private teamlead tl;
	
	public manager(teamlead tl)
	{
		this.tl = tl;
	}
	
	public void doWork()
	{
		System.out.println("Manager work started");
		tl.doWork();
		System.out.println("Manager work completed");
	}
}
