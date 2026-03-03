package com.java.standard.edition.interviewprograms;

import java.util.Scanner;

public class NumberOfCharactersInString
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.next();
		int count=0;
		for(int i=0;i<=s.length()-1;i++)//6<=6
		{
			count++;
		}
		
		System.out.println("The number of characters in the entered string "+s+" is :"+count);
		sc.close();
		
	}

}
