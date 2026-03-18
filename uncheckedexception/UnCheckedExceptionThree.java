package com.java.standard.edition.uncheckedexception;

public class UnCheckedExceptionThree 
{
	public static void main(String[] args) 
	{
		try
		{
			int arr[]= {10,20,30,40,50};
			System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("This is the last line of the code");
		
	}

}
