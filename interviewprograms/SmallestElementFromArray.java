package com.java.standard.edition.interviewprograms;
 
public class SmallestElementFromArray 
{
	public static void main(String[] args) 
	{
		int arr[]={45,21,89,34,78};
		int min=arr[0];
		for(int i=0;i<=arr.length-1;i++)//4<=4
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		
		System.out.println("The smallest element in an array is :"+min);
	}

}
