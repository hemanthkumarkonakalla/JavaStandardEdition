package com.java.standard.edition.interviewprograms;

import java.util.Scanner;

public class FetchDataBasedOnIndex 
{
	public static void main(String[] args) 
	{
		int arr[]= {10,20,30,40,50};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index:");
		int n=sc.nextInt();
		
		int res=0;
		for(int i=0;i<=arr.length-1;i++)//1<=4
		{
			if(n==i)
			{
				res=arr[i];
				
			}
		}
		
			System.out.println("The element present at index:"+n+" is :"+res);

		


		sc.close();
		
	}

}
