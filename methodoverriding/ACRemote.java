package com.java.standard.edition.methodoverriding;

public class ACRemote extends Remote 
{
	@Override
	public void remote()
	{
		System.out.println("AC Remote is used to turn on/off the AC");	
	}
	
	public void display()
	{
		System.out.println("This is the display method from ACRemote class");
	}

}
