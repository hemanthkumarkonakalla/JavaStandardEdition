package com.java.standard.edition.strings;

public class StringOne 
{
	public static void main(String[] args) 
	{
		String s1="Hemanth";// String will be created in String Constant Pool
		String s2= new String("Hemanth");//String will be created in Heap area
		System.out.println(s1==s2);//false
		System.out.println(s1);//Hemanth
		System.out.println(s2);//Hemanth
		
	}

}
