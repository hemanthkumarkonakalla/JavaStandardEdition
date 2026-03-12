package com.java.standard.edition.interviewprograms;

public class MaxAndMinElement
{
	public static void main(String[] args) 
	{
		int arr[]= {4,78,12,4,90,66,178,9};
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<=arr.length-1;i++)//7<=7
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		
		for(int i=0;i<=arr.length-1;i++)//7<=7
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		
		
		System.out.println("The minimum element in an array is :"+min);
		System.out.println("The maximum element in an array is :"+max);
		
	}

}
