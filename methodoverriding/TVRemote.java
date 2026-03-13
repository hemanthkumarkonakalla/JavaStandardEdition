package com.java.standard.edition.methodoverriding;

public class TVRemote extends Remote
{
	@Override
	public void remote()
	{
		System.out.println("TVRemote is used to turn on,off and change the channels");
	}
	
	public void display1()
	{
		System.out.println("This is the display1 method from TVRemote class");
	}

}
