package com.java.standard.edition.interviewprograms;

public class MergingTwoSortedArrays 
{
	public static void main(String[] args) {
		int arr1[]= {1,3,5,7,9};
		int arr2[]= {2,4,6,8,10};
		
		int arr3[]= new int[arr1.length+arr2.length];
		
		int i=0,j=0,k=0;
		while(i<arr1.length && j<arr2.length)//4<5 && 4<5
		{
			if(arr1[i]<=arr2[j])//9<=10
			{
				arr3[k++]=arr1[i++];
			}
			else
			{
				arr3[k++]=arr2[j++];
			}
		}
		
		while(i<arr1.length)//5<5
		{
			arr3[k++]=arr1[i++];
		}
		
		while(j<arr2.length)//4<5
		{
			arr3[k++]=arr2[j++];
		}
		
		
		System.out.println("Array after merging:");
		for(int res:arr3)
		{
			System.out.print(res+" ");
		}
	}

}
