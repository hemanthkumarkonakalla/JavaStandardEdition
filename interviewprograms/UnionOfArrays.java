package com.java.standard.edition.interviewprograms;

import java.util.HashSet;

public class UnionOfArrays 
{
	public static void main(String[] args) 
	{
		int arr1[]= {1,2,2,3,4,4,5,6,6};
		int arr2[]= {1,2,45,67,45,2,1};
		
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=0;i<=arr1.length-1;i++)
		{
			hs.add(arr1[i]);
		}
		
		for(int i=0;i<=arr2.length-1;i++)
		{
			hs.add(arr2[i]);
		}
		
		System.out.println("Union of Arrays:");
		for(Integer res:hs)
		{
			System.out.print(res+" ");
		}
		System.out.println();
		
	}

}
