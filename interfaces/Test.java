package com.java.standard.edition.interfaces;

public class Test 
{
	public static void main(String[] args) 
	{
		Airtel a = new Airtel();
		Jio j = new Jio();
		Sim s = new Sim();
		s.simOperator(a);
		a.xStream();
		a.spectrum();
		a.display();
		s.simOperator(j);
		j.jioTV();
		
	}

}
