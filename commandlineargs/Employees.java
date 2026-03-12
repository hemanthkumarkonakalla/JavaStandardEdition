package com.java.standard.edition.commandlineargs;

public class Employees 
{
	public static void main(String[] args) 
	{
		for(int i=0;i<=args.length-1;i++)
		{
			System.out.println(args[i]+" ");
		}
		
	}

}
