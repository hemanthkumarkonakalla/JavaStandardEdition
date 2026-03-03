package com.java.standard.edition.wrapperclasses;

public class WrapperDemo 
{
	public static void main(String[] args) 
	{
		Boolean a =true;
		Character b='k';
		Byte c=100;
		Short d=30000;
		Integer e=7654321;
		Long f=9515537631L;
		Float g=76.2f;
		Double h=78.987654;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
		//Autoboxing
		int x=1000;
		Integer y=x;
		
		System.out.println("The value stored in variable x is :"+x);
		System.out.println("The value stored in variable y is :"+y);
		
		//unboxing
		int res=y;
		System.out.println("The value stored in variable res is :"+res);
		
	}

}
