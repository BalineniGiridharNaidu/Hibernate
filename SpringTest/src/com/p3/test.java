package com.p3;

class A 
{
	private C c = new C();
	
	public void doWork()
	{
		c.doWork();
	}
}

class B
{
	private C c;

	public C getC()
	{
		return c;
	}

	public void setC(C c)
	{
		this.c = c;
	}
	
	public void doWork()
	{
		c.doWork();
	}
	
}

class C
{
	public void doWork()
	{
		System.out.println("Work done successfully..............");
	}
}


public class test
{
	public static void main(String[] args)
	{
		A a = new A();
		a.doWork();
		
		System.out.println("------------------------------------------");
		
		B b = new B();
		
		C c = new C();
		
		b.setC(c);
		b.doWork();
		
		
	}
}
