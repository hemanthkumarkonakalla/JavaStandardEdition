package com.java.standard.edition.interviewprograms;

import java.util.Scanner;

public class ReverseNumber 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n=sc.nextInt();
		int n1=n;
		int rev=0;
		while(n>0)
		{
			int lastDigit=n%10;
			rev=rev*10+lastDigit;
			n=n/10;
			
		}
		
		System.out.println("The reverse of entered digit "+n1+" is:"+rev);
		sc.close();
		
	}

}
