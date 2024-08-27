package com.giri;

public class A
{	
	
	A(int a)
	{
		System.out.println("in 1 constr");
	}
	
    A(int a, int b)
	{	
    	this(1,"ui");
		System.out.println("in 2 constr");
	}
	
	
     A(int a, String b)
	{
    	 System.out.println("in 3 constr");
	}
	
	{
		System.out.println("In instance block");
	}
	
	public static void main(String[] args)
	{
		A a = new A(1,2);
	}
}
