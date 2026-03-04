package com.java.standard.edition.strings;

public class StringTwelve
{
	public static void main(String[] args) 
	{
		String s1="Hemanth";
		String s2="Kumar";
		
		if(s1.compareTo(s2)>0)
		{
			System.out.println("String s1 is greater");
		}
		else if(s1.compareTo(s2)<0)
		{
			System.out.println("String s2 is greater");
		}
		else
		{
			System.out.println("Both String values are equal");
		}
		
	}

}
