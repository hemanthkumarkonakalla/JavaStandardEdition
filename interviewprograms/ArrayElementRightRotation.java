package com.java.standard.edition.interviewprograms;

public class ArrayElementRightRotation 
{
	public static void main(String[] args) 
	{
		int arr[]= {10,20,30,40,50};
		System.out.println("Array elements before right rotation");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int temp=arr[arr.length-1];
		
		for(int i=arr.length-2;i>=0;i--)
		{
			arr[i+1]=arr[i];
		}
		
		arr[0]=temp;
		System.out.println("Array elements after right rotation");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
