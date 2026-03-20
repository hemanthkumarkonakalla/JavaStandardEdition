package com.java.standard.edition.uncheckedexception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo 
{
	public static void readingFile()
	{
		try {
			FileReader fr = new FileReader("./testing.txt");
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			throw new ChainingException("File NotFound", e);
		}
	}
	
	public static void main(String[] args) 
	{
		try
		{
			readingFile();

		}
		catch(Exception e)
		{
			System.out.println("Exception :"+e.getMessage());
			System.out.println("Root Cause:"+e.getCause());
			
			// ChainingException is BUSINESS LEVEL - meaningful message
		    // original cause 'e' is preserved inside for debugging
		}
		
	}

}
