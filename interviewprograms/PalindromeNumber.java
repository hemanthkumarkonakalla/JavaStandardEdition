package com.java.standard.edition.interviewprograms;

import java.util.Scanner;

public class PalindromeNumber 
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
		
		if(rev==n1)
		{
			System.out.println("Entered Number "+n1+" is Palindrome Number");
		}
		else
		{
			System.out.println("Number is not palindrome");
		}
		
		sc.close();
	}

}
