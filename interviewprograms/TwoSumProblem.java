package com.java.standard.edition.interviewprograms;

import java.util.HashMap;

public class TwoSumProblem 
{
	public static void main(String[] args) 
	{
		int arr[]= {2,7,23,5,12,7,1};
		int target=35;
		int res[]=twoSum(arr,target);
		if(res.length==2)
		{
			System.out.println("Indices::"+res[0]+" , "+res[1]);
		}
		else
		{
			System.out.println("No Result Found");
		}
	}

	private static int[] twoSum(int[] arr, int target) 
	{
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for(int i=0;i<arr.length;i++)//4<7
		{
			int compliment=target-arr[i];//35-12
			
			if(hm.containsKey(compliment))
			{
				return new int[] {hm.get(compliment),i};
			}
			hm.put(arr[i],i);
		}
		
		return new int[] {};
	}

}
