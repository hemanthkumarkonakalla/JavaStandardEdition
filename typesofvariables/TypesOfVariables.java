package com.java.standard.edition.typesofvariables;

public class TypesOfVariables
{
	int x=100; // instance variable
	static int y=200;//static variable
	public static void main(String[] args) 
	{
		int z=300;//local variable
		
		TypesOfVariables tv = new TypesOfVariables();
		System.out.println("The value stored in instance variable x is :"+tv.x);//100
		System.out.println("The value stored in static variable y is :"+y);//200
		System.out.println("The value stored in local variable z is :"+z);//300
	}

}
