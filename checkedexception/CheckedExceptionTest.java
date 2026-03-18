package com.java.standard.edition.checkedexception;

public class CheckedExceptionTest
{
	static void checkAge(int age) throws CustomCheckedException
	{
		if(age<18)
		{
			throw new CustomCheckedException("Age is less than 18,not eligible to vote");
		}
		else
		{
			System.out.println("Eligible to vote");
		}
	}
	
	public static void main(String[] args) 
	{
		
			try {
				checkAge(15);
			} catch (CustomCheckedException e) {
				System.out.println(e.getMessage());
			}
		
		finally
		{
			System.out.println("This is finally block executed regardless wheather an exception occurs or not");
		}
		
		System.out.println("This is the last line of the code");
		
	}
	

}
