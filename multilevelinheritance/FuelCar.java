package com.java.standard.edition.multilevelinheritance;
 
public class FuelCar extends Vehicle
{
	public FuelCar(int x)
	{
		super(x);
		System.out.println("This is FuelCar class constructor");
	}
	
	public void fuel()
	{
		System.out.println("Car is running with fuel");
	}

}
