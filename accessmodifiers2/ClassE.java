package com.java.standard.edition.accessmodifiers2;

import com.java.standard.edition.accessmodifiers1.ClassA;

public class ClassE   
{
	public static void main(String[] args) 
	{
		ClassA a = new ClassA();
		System.out.println("The value stored in variable x is :"+a.x);
		a.display();
		
	}

}
