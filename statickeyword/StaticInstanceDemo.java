package com.java.standard.edition.statickeyword;

public class StaticInstanceDemo 
{
	//static variables
	static int a;
	static int b;
	static int c;
	
	//static block
	static
	{
		a=10;
		b=20;
		c=30;
		System.out.println("This is static block");
	}
	
	//static method
	static void display1()
	{
		System.out.println("The value stored in static variable a is :"+a);
		System.out.println("The value stored in static variable b is :"+b);
		System.out.println("The value stored in static variable c is :"+c);
	}
	
	//instance variables
	int p;
	int q;
	int r;
	
	
	//instance block
	{
		p=1000;
		q=2000;
		r=3000;
		a=100;
		b=200;
		c=300;
	}
	
	//instance method
	
	void display2()
	{
		System.out.println("The value stored in instance variable p is :"+p);
		System.out.println("The value stored in instance variable q is :"+q);
		System.out.println("The value stored in instance variable r is :"+r);
		System.out.println("The value stored in static variable a is :"+a);
		System.out.println("The value stored in static variable b is :"+b);
		System.out.println("The value stored in static variable c is :"+c);
	}
	
	
	public static void main(String[] args) 
	{
		StaticInstanceDemo.display1();
		StaticInstanceDemo sd = new StaticInstanceDemo();
		sd.display2();
		
	}

}
