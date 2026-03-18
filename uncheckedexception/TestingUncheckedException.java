package com.java.standard.edition.uncheckedexception;

public class TestingUncheckedException 
{
	static void checkAge(int age)
	{
		if(age<18)
		{
			throw new UnCheckedException("Age is less than 18,Not eligible to vote");
		}
		else
		{
			System.out.println("Eligible to vote");
		}
	}
	public static void main(String[] args) 
	{
		try
		{
			checkAge(15);
		}
		catch(UnCheckedException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("This the last line of the code");
		
	}

}
