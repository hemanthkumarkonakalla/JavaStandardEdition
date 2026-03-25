package com.java.standard.edition.interviewprograms;

import java.util.Arrays;

public class TwoSumProblemOne 
{
	public static void main(String[] args) 
	{
		int arr[]= {2,7,23,45,6,7,10};
		int target=25;
		int res[]=twoSum(arr,target);
		if(res.length==2)
		{
			System.out.println("Values:: " +res[0]+" + "+res[1]+"="+target);
		}
		else
		{
			System.out.println("No result Found");
		}
		
		
	}

	private static int[] twoSum(int[] arr, int target) 
	{
		Arrays.sort(arr);
		int left=0;
		int right=arr.length-1;
		while(left<right)//2<2
		{
			int sum=arr[left]+arr[right];//29
			if(sum==target)
			{
				return new int[] {arr[left],arr[right]};
			}
			else if(sum<target)
			{
				left++;
			}
			else
			{
				right--;
			}
		}
		return new int[] {};
	}

}
