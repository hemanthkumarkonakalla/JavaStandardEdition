package com.java.standard.edition.hierarchicalinheritance;
 
public class EVCar extends Vehicle
{
	public EVCar(int x)
	{
		super(x);
		System.out.println("This is EVCar class constructor");
	}
	
	
	public void eV()
	{
		System.out.println("Car is running with electricity");
	}

}
