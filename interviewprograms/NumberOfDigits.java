package com.java.standard.edition.interviewprograms;

import java.util.Scanner;

public class NumberOfDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n=sc.nextInt();
		int n1=n;
		int count=0;
		while(n>0)
		{
			
			count++;
			n=n/10;
		}
		
		System.out.println("The Number of digits in the entered number "+n1+" is :"+count);
		sc.close();
		
	}

}
