package com.java.standard.edition.accessmodifiers1;

public class ClassB     
{
	public static void main(String[] args) 
	{
		ClassA a = new ClassA();
		System.out.println("The value stored in variable x is :"+a.x);
		a.display();
		
	}

}
