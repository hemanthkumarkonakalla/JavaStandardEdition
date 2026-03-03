package com.java.standard.edition.interviewprograms;

import java.util.Scanner;

public class ArrayElementAtGivenIndex 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size=sc.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Array Contents are");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Enter the element:");
		int value=sc.nextInt();
		System.out.println("Enter the index:");
		int index=sc.nextInt();
		
		for(int i=arr.length-1;i>index;i--)//1>1
		{
			arr[i]=arr[i-1];
		}
		
		arr[index]=value;
		
		System.out.println("Array Elements after inserting the element at index position "+index+" is :");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		sc.close();
		
	}

}
