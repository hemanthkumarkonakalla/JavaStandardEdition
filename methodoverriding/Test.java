package com.java.standard.edition.methodoverriding;

public class Test 
{
	public static void main(String[] args) 
	{
		Remote r1 = new ACRemote();
		Remote r2 = new TVRemote();
		r1.remote();
		new ACRemote().display();
		r2.remote();
		new TVRemote().display1();
		
	}

}
