package com.java.standard.edition.interviewprograms;

public class BiggestOddNumberInArray 
{
	public static void main(String[] args) 
	{
		int arr[]= {9,44,32,16,77,89,7};
		int max=arr[0];
		for(int i=0;i<=arr.length-1;i++)//0<=6
		{
			if(arr[i]%2!=0)
			{
				if(arr[i]>max)
				{
					max=arr[i];
				}
			}
		}
		
		System.out.println("The biggest odd number from an array is :"+max);
		
		
	}

}
