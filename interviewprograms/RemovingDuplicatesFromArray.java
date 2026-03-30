package com.java.standard.edition.interviewprograms;

import java.util.HashSet;

public class RemovingDuplicatesFromArray
{
	public static void main(String[] args) 
	{
		int arr[]= {2,7,23,12,7,2,4,1};
		System.out.println("Array Before removing duplicate elements:");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		HashSet<Integer> hs = new HashSet<>();
		for(int i=0;i<=arr.length-1;i++)
		{
			if(!hs.contains(arr[i]))
			{
				hs.add(arr[i]);
			}
		}
		System.out.println();
		System.out.println("Array After removing duplicate elements:");
		for(Integer res:hs)
		{
			System.out.print(res+" ");
		}
		System.out.println();
		
		
	}

}
