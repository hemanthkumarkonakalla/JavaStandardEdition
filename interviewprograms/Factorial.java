package com.java.standard.edition.interviewprograms;

import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++)//5<=5
		{
			fact=fact*i;
		}
		
		System.out.println("The factorial of entered number "+n+" is :"+fact);
		sc.close();
		
	}

}
