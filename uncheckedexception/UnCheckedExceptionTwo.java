package com.java.standard.edition.uncheckedexception;

public class UnCheckedExceptionTwo 
{
	public static void main(String[] args) 
	{
		try
		{
			String s=null;
			System.out.println(s.length());
		}
		
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("This is the last line of the code");
		
	}

}
