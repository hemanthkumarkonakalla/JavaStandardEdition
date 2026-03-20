package com.java.standard.edition.interviewprograms;

public class CopyArrayElementsInToArray 
{
	public static void main(String[] args) 
	{
		int arr[]= {10,20,30,40,50};
		int newArr[]= new int[arr.length];
		copyArrayElements(arr,newArr);
		printNewArr(newArr);
	}

	private static void copyArrayElements(int[] arr, int[] newArr) 
	{
		int j=0;
		for(int i=0;i<=arr.length-1;i++)//2<=4
		{
			newArr[j]=arr[i];
			j++;
		}
		
	}
	
	private static void printNewArr(int newArr[])
	{
		System.out.println("New Array Elements are:");
		for(int res:newArr)
		{
			System.out.print(res+" ");
		}
		System.out.println();
	}

}
