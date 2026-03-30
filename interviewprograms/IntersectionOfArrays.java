package com.java.standard.edition.interviewprograms;


public class IntersectionOfArrays 
{
	public static void main(String[] args) 
	{
		int arr1[]= {1,2,3,4,5,6};
		int arr2[]= {3,4,5,8,10,9};
		System.out.println("Intersection of arr1 and arr2 is :");
		for(int i=0;i<=arr1.length-1;i++)
		{
			for(int j=0;j<=arr2.length-1;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.print(arr1[i]+" ");
				}
			}
		}
		
	
		
	}

}
