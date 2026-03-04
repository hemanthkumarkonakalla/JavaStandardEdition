package com.java.standard.edition.methods;

public class TypeOneMethod 
{
	//type-1 method
	void add()
	{
		int a=10;
		int b=2;
		int c=a+b;
		System.out.println("Addition of "+a+" and "+b+" is :"+c);
	}
	
	public static void main(String[] args)
	{
		TypeOneMethod to1 = new TypeOneMethod();
		to1.add();
		
	}

}
