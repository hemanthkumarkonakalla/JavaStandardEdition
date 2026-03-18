package com.java.standard.edition.uncheckedexception;

public class MultiCatchExample
{
	public static void main(String[] args)
	{
		try
		{
			int arr[]= {10,20,30,40,50};
			System.out.println(arr[1]);
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println("The value of c is :"+c);
		}
		catch(ArrayIndexOutOfBoundsException  | ArithmeticException e1)
		{
			System.out.println(e1.getMessage());
		}
		
		
		System.out.println("This is the last line of the code");
		
	}

}
