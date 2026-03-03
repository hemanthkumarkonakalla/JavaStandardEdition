package com.java.standard.edition.interviewprograms;

public class MoveAllNegativesToStart
{
	public static void main(String[] args) 
	{
		int arr[] = {87,65,-9,45,-2,78,-6};
		System.out.println("Array elements before moving the negative elements to the starting position");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int newArr[] = new int[arr.length];
		reArrageElements(arr,newArr);
		printNewArr(newArr);
	}

	private static void printNewArr(int[] newArr) 
	{
		System.out.println("Array elements after moving the negative elements to the starting position");

		for(int i=0;i<=newArr.length-1;i++)
		{
			System.out.print(newArr[i]+" ");
		}
	}

	private static void reArrageElements(int[] arr, int[] newArr) 
	{
		int j=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]<0)
			{
				newArr[j]=arr[i];
				j++;
			}
		}
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>0)
			{
				newArr[j]=arr[i];
				j++;
			}
		}
		
		
		
	}

}
