package com.java.standard.edition.interviewprograms;

public class SelectionSort 
{
	public static void main(String[] args) 
	{
		int arr[]= {54,32,13,9,1,4,8,5};
		for(int i=0;i<=arr.length-1;i++)//1<=7
		{
			int min=i;
			for(int j=i+1;j<=arr.length-1;j++)//7<=7
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		
		System.out.println("Array elements after sorting:");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}

}
