package com.java.standard.edition.interviewprograms;

public class SecondSmallestElementInArray 
{
	public static void main(String[] args) 
	{
		int arr[]= {54,67,92,12,68,78};
		int firstSmallest=Integer.MAX_VALUE;//12
		int secondSmallest=Integer.MAX_VALUE;//54
		
		for(int i=0;i<=arr.length-1;i++)//5<=5
		{
			if(arr[i]<firstSmallest)
			{
				secondSmallest=firstSmallest;
				firstSmallest=arr[i];
			}
			else if(arr[i]<secondSmallest && arr[i]!=firstSmallest)
			{
				secondSmallest=arr[i];
			}
		}
		
		System.out.println("The second smallest element in an array is :"+secondSmallest);
		
	}

}
