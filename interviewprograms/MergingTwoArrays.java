package com.java.standard.edition.interviewprograms;

public class MergingTwoArrays 
{
	public static void main(String[] args) 
	{
		int arr1[]= {5,4,3,0,1};
		int arr2[]= {12,8,6,5,2};
		
		int mergedArray[]= new int[arr1.length+arr2.length];
		int j=0;//10
		for(int i=0;i<=arr1.length-1;i++)//4<=4
		{
			mergedArray[j]=arr1[i];
			j++;
		}
		
		for(int i=0;i<=arr2.length-1;i++)//4<=4
		{
			mergedArray[j]=arr2[i];
			j++;
		}
		
		System.out.println("Merged Array:");
		for(int i=0;i<=mergedArray.length-1;i++)
		{
			System.out.print(mergedArray[i]+" ");
		}
		System.out.println();
		
	}

}
