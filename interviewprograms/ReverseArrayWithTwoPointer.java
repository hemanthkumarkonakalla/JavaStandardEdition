package com.java.standard.edition.interviewprograms;
 
public class ReverseArrayWithTwoPointer 
{
	public static void main(String[] args) 
	{
		int arr[]= {54,78,12,66,99,9};
		System.out.println("Array elements before reversing:");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		int left =0;
		int right=arr.length-1;
		
		while(left<right)
		{
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
		
		System.out.println();
		System.out.println("Array elements after reversing:");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
