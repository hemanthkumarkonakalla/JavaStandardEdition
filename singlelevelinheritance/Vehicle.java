package com.java.standard.edition.singlelevelinheritance;
 
public class Vehicle 
{
	int x;
	
	public Vehicle(int x)
	{
		
		this.x=x;
		System.out.println("This is vehicle class constructor");
	}
	
	public void start()
	{
		System.out.println("Vehicle is started");
	}

}
