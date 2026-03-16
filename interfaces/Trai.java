package com.java.standard.edition.interfaces;

import javax.smartcardio.CommandAPDU;

public interface Trai extends Government
{
	int x=1000; // by default this public static final variable
	
	//abstract methods
	public void call();
	public void message();
	public void data();
	public void recharge();
	
	
	//default method
	default void provide3GSupport()
	{
		System.out.println("Providing 3g support is optional for sim operators");
		commonCode();
	}
	
	//static method
	static void providesLastTwoYearsCallHistory()
	{
		System.out.println("Providing last 2 years call history");
		commonCode();
	}
	
	
	//private method
	private static void commonCode()
	{
		System.out.println("Common code");
	}
	

}
