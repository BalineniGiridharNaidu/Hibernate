package com.p2;

public class test
{

	public static void main(String[] args)
	{
		
		developer d = new developer();
		teamlead t = new teamlead(d);
		//t.SetDeveloper(d);
		
		manager m = new manager(t);
		//m.setTeamlead(t);
		m.doWork();
	}

}
