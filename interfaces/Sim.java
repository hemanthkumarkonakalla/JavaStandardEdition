package com.java.standard.edition.interfaces;

public class Sim 
{
	public void simOperator(Trai ref)
	{
		ref.call();
		ref.message();
		ref.data();
		ref.recharge();
		ref.provide3GSupport();
		Trai.providesLastTwoYearsCallHistory();
		System.out.println("The value stored in variable x is :"+Trai.x);

	}

}
