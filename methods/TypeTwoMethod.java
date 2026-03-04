package com.java.standard.edition.methods;

public class TypeTwoMethod 
{
	void add(int a,int b)//parameters
	{
		int c=a+b;
		System.out.println("Addition of "+a+" and "+b+" is :"+c);
	}
	
	public static void main(String[] args) 
	{
		TypeTwoMethod to2 = new TypeTwoMethod();
		to2.add(10, 20);//arguments
		
	}

}
