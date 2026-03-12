package com.java.standard.edition.interviewprograms;

public class MoveAllZerosToEnding
{
	public static void main(String[] args) 
	{
		int arr[]= {0,4,0,3,56,0,90,87,43,40};
		System.out.println("Array elements before moving the zero's to ending position of an array:");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int newArr[] = new int[arr.length];
		reArrangeElements(arr,newArr);
		printNewArrElements(newArr);
		
	}

	private static void printNewArrElements(int[] newArr) {
		System.out.println("Array elements after moving the zero's to ending position of an array:");
		for(int i=0;i<=newArr.length-1;i++)
		{
			System.out.print(newArr[i]+" ");
		}

	}

	private static void reArrangeElements(int[] arr, int[] newArr) 
	{
		int j=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>0)
			{
				newArr[j]=arr[i];
				j++;
			}
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==0)
			{
				newArr[j]=arr[i];
				j++;
			}
		}

		
	}

}
