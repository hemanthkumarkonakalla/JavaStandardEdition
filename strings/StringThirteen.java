package com.java.standard.edition.strings;

public class StringThirteen 
{
	public static void main(String[] args) 
	{
		String s1="Hemanth";
		String s2= new String("Hemanth");
		String s3=s2.intern();
		
		System.out.println(s1);//Hemanth
		System.out.println(s3);//Hemanth
		
		if(s1==s3)
		{
			System.out.println("References are equal");
		}
		else
		{
			System.out.println("References are not equal");
		}
		
		if(s1.equals(s3))
		{
			System.out.println("String values are equal");
		}
		else
		{
			System.out.println("String values are not equal");
		}
		
	}

}
