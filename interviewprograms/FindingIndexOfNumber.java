package com.java.standard.edition.interviewprograms;

import java.util.Scanner;

public class FindingIndexOfNumber
{
	public static void main(String[] args) 
	{
		int arr[]= {10,20,30,40,50};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find its index:");
		int num=sc.nextInt();
		int index=0;
		for(int i=0;i<=arr.length-1;i++)//4<=4
		{
			if(num==arr[i])
			{
				index=i;
			}
		}
		
		System.out.println("The index of entered number "+num+" is :"+index);
		sc.close();
		
	}

}
