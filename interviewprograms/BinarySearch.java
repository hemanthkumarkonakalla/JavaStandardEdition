package com.java.standard.edition.interviewprograms;

public class BinarySearch 
{
	public static void main(String[] args) 
	{
		int arr[]= {10,23,5,12,60,70};
		int target=60;
		int index=-1;
		int first=0;
		int last=arr.length-1;
		while(first<=last)
		{
			int mid=(first+last)/2;
			
			if(arr[mid]==target)
			{
				index=mid;
				break;
			}
			else if(arr[mid]<target)
			{
				first=mid+1;
			}
			else
			{
				last=mid-1;
			}
		}
		
		
		if(index!=-1)
		{
			System.out.println(target+" found at index:"+index);
		}
		else
		{
			System.out.println("No Element Found");
		}
	}

}
