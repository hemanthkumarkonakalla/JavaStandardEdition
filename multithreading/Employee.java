package com.java.standard.edition.multithreading;

public class Employee extends Thread 
{
	public Employee(String name)
	{
		super(name);
	}
	
	@Override
	public void run()
	{
		System.out.println("Hii");
		System.out.println(Thread.currentThread().getName()+" >>>> "+Thread.currentThread().threadId());
	}
}


class Manager extends Thread
{
	public Manager(String name)
	{
		super(name);
	}
	
	@Override
	public void run()
	{
		System.out.println("Hello");
		System.out.println(Thread.currentThread().getName()+" >>>> "+Thread.currentThread().threadId());
	}
}
