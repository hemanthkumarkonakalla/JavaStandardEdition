package com.java.standard.edition.interviewprograms;
 
public class LargestElementFromArray 
{
	public static void main(String[] args) 
	{
		int arr[]= {45,21,89,34,78};
		int max=arr[0];
		for(int i=0;i<=arr.length-1;i++)//4<=4
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		
		
		System.out.println("The largest element in an array is :"+max);
		
	}

}
