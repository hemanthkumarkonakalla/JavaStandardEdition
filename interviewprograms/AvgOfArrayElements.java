package com.java.standard.edition.interviewprograms;

public class AvgOfArrayElements 
{
	public static void main(String[] args) 
	{
		int arr[]= {10,20,30,40,50};
		int sum=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			sum+=arr[i];
		}
		
		System.out.println("The average of array elements is :"+sum/arr.length);
		
	}

}
