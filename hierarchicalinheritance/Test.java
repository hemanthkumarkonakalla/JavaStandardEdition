package com.java.standard.edition.hierarchicalinheritance;
 
public class Test 
{
	public static void main(String[] args) 
	{
		FuelCar fc = new FuelCar(1000);
		fc.start();
		fc.fuel();
		System.out.println("The value stored in variable x is :"+fc.x);
		
		System.out.println("========================================================================");
		
		EVCar ev = new EVCar(2000);
		ev.start();
		ev.eV();
		System.out.println("The value stored in variable x is :"+ev.x);

		
	}

}
