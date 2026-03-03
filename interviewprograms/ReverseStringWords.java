package com.java.standard.edition.interviewprograms;

import java.util.Scanner;

public class ReverseStringWords
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.nextLine();
		String res[]=s.split(" ");
		for(int i=res.length-1;i>=0;i--)
		{
			System.out.print(res[i]+" ");
		}
		
		System.out.println();
		sc.close();
		
	}

}
