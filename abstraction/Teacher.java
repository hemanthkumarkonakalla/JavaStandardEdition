package com.java.standard.edition.abstraction;

public abstract  class Teacher 
{
	int x=100;
	
	//abstract methods
	public abstract void teach();
	public abstract void doExperiments();
	
	//concrete method
	public void display()
	{
		System.out.println("This is display method from Teacher class");
	}

}
