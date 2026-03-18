package com.java.standard.edition.interviewprograms;

import java.util.Scanner;

public class ArmStrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n=sc.nextInt();
		int n1=n;
		int sum=0;
		while(n>0)
		{
			int lastDigit=n%10;
			sum=sum+(lastDigit*lastDigit*lastDigit);
			n=n/10;
			
		}
		
		if(n1==sum)
		{
			System.out.println("ArmStrong Number");
		}
		else
		{
			System.out.println("Not ArmStrong Number");
		}
		
		sc.close();
		
	}

}
