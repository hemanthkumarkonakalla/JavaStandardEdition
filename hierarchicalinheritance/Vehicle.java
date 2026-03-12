package com.java.standard.edition.hierarchicalinheritance;
 
public class Vehicle 
{
	 int x=1000;
	
	public Vehicle(int x)
	{
		this.x=x;
		System.out.println("This is vehicle class constructor");
	}
	
	public void start()
	{
		System.out.println("Vehicle is started sucessfully");
	}

}
