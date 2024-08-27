package com.cisco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class manager
{	
	@Autowired
	private teamlead tl;
	
	public void doWork()
	{
		System.out.println("manager work started");
		tl.doWork();
		System.out.println("manager work completed");
	}
}
