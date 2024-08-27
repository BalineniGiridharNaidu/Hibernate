package com.springtest;

public class test
{
	public static void main(String[] args)
	{	
		empFile empf = new empFile();
		
		empDao ed = new empDao();
		ed.setEmpf(empf);
		
		ed.saveDataIntoDatabase();
	}
}
