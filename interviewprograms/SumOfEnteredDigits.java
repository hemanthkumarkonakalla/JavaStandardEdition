package com.java.standard.edition.interviewprograms;

import java.util.Scanner;

public class SumOfEnteredDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Digits:");
		int n=sc.nextInt();
		int n1=n;
		int sum=0;
		while(n>0)
		{
			int lastDigit=n%10;
			sum+=lastDigit;
			n=n/10;
		}
		
		System.out.println("The sum of entered digit "+n1+" is :"+sum);
		sc.close();
		
	}

}
