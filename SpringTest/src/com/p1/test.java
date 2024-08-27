package com.p1;

public class test
{

	public static void main(String[] args)
	{
		
		developer d = new developer();
		teamlead t = new teamlead();
		t.SetDeveloper(d);
		
		manager m = new manager();
		m.setTeamlead(t);
		m.doWork();
	}

}
