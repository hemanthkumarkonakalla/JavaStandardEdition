package com.java.standard.edition.checkedexception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CheckedExceptionOne 
{
	public static void main(String[] args) 
	{
		try {
			FileReader fr = new FileReader("./test.txt");
			Scanner sc = new Scanner(fr);
			while(sc.hasNext())
			{
				String data=sc.nextLine();
				System.out.println(data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("This is the last line of the code");
		
	}

}
