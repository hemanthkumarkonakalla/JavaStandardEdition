package com.java.standard.edition.singlelevelinheritance;
 
public class Car extends Vehicle
{
	public Car(int x)
	{
		super(x);
		this.x=x;
		System.out.println("This is Car class constructor");
	}
	
	public void run()
	{
		System.out.println("Car is running with petrol");
	}

	
	public static void main(String[] args) 
	{
		Car c = new Car(1000);
		System.out.println("The value stored in variable x is :"+c.x);
		c.start();
		c.run();
		
		
	}
}
