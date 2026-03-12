package com.java.standard.edition.accessmodifiers2;

import com.java.standard.edition.accessmodifiers1.ClassA;

public class ClassD extends ClassA 
{
	public static void main(String[] args) 
	{
		ClassD d = new ClassD();
		System.out.println("The value stored in variable x is :"+d.x);
		d.display();
		
	}

}
