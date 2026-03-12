package com.java.standard.edition.interviewprograms;

import java.util.Scanner;

public class PrimeNumbersInRange 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting value:");
		int start=sc.nextInt();
		System.out.println("Enter the ending value:");
		int end=sc.nextInt();
		System.out.println("Prime Numbers between "+start+" and "+end+" is:");
		int count=0;
		for(int i=start;i<=end;i++)//10<=10
		{
			if(i<2)
			{
				continue;
			}
			
			boolean isPrime=true;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					isPrime=false;
					break;
				}
			}
			if(isPrime)
			{
				count++;
				System.out.print(i+" ");
				
			}
			
			
			
		}
		System.out.println();
		System.out.println("The no of prime numbers between the entered range is :"+count);

		sc.close();
		
		
		
		
		
	}

}
