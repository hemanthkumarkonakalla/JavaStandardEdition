package com.java.standard.edition.multilevelinheritance;
 
public class EVCar extends FuelCar 
{
	public EVCar(int x)
	{
		super(x);
		System.out.println("This is EVCar class constructor");
	}
	
	public void ev()
	{
		System.out.println("EVCar is running with electricity");
	}

}
