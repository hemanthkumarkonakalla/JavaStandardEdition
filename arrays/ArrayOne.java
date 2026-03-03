package com.java.standard.edition.arrays;

import java.util.Scanner;

public class ArrayOne 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size=sc.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<=arr.length-1;i++)//4<=4
		{
			System.out.println("Enter the marks for student:"+i);
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Array Contents are");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		sc.close();
		
	}

}
