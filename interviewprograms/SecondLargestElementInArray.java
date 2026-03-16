package com.java.standard.edition.interviewprograms;

public class SecondLargestElementInArray
{
	public static void main(String[] args) 
	{
		int arr[]= {45,65,12,78,92,34};
		int firstHighest=Integer.MIN_VALUE;//92
		int secondHighest=Integer.MIN_VALUE;//78
		
		
		for(int i=0;i<=arr.length-1;i++)//5<=5
		{
			if(arr[i]>firstHighest)
			{
				secondHighest= firstHighest;
				firstHighest=arr[i];
				
			}
			else if(arr[i]>secondHighest && arr[i]!=firstHighest)
			{
				secondHighest=arr[i];
			}
		}
		
		
		System.out.println("The second largest element in an array is :"+secondHighest);
		
	}

}
