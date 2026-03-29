package com.java.standard.edition.interviewprograms;

public class ArrayElementLeftRotation
{
	public static void main(String[] args) 
	{
		int arr[]= {10,20,30,40,50};
		System.out.println("Array elements before left rotation");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int temp=arr[0];
		for(int i=1;i<=arr.length-1;i++)
		{
			arr[i-1]=arr[i];
		}
		
		arr[arr.length-1]=temp;
		
		System.out.println("Array elements after left rotation");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
