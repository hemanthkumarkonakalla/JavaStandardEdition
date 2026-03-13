package com.java.standard.edition.methodoverloading;
//Method Overloading
public class Calculator 
{
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition of "+a+" and "+b+" is :"+c);
	}
	
	float add(float a,int b)
	{
		float c=a+b;
		return c;
	}
	
	void add(int a,float b)
	{
		float c=a+b;
		System.out.println("Addition of "+a+" and "+b+" is :"+c);
	}
	
	int add(int a,int b,int c)
	{
		int d=a+b+c;
		return d;
	}
	
	void add(int a,float b,int c)
	{
		float d=a+b+c;
		System.out.println("Addition of "+a+","+b+" and "+c+" is :"+d);
	}
	
	float add(float a,int b,int c)
	{
		float d=a+b+c;
		return d;
	}
	
	
	public static void main(String[] args) 
	{
		Calculator c = new Calculator();
		c.add(76, 76.5f);
		float res=c.add(45.5f,55,45);
		System.out.println(res);
		
	}

}
