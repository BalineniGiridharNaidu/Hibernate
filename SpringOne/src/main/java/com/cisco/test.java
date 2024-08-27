package com.cisco;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test
{

	public static void main(String[] args)
	{
		ApplicationContext ac = new AnnotationConfigApplicationContext(ConfigurationFile.class);
		
		manager m = ac.getBean(manager.class);
		
		m.doWork();
	}

}
