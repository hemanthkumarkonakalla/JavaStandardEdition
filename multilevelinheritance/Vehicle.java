package com.java.standard.edition.multilevelinheritance;
 
public class Vehicle
{
	int x=100;
	
	public Vehicle(int x)
	{
		System.out.println("This is Vehicle class constructor");
		this.x=x;
	}
	
	public void start()
	{
		System.out.println("Vehicle is started sucessfully");
	}

}
