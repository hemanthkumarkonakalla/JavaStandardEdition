package com.java.standard.edition.uncheckedexception;

public class UnCheckedExceptionOne 
{
	public static void main(String[] args) 
	{
		try
		{
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println("The value in c is :"+c);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("This is the last line of the code");
		
	}

}
