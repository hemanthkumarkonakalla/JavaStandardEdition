package com.java.standard.edition.interviewprograms;

public class MaximumSubArraySum 
{
	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,5,6};
		int k=3;
		int sum=0;
		for(int i=0;i<k;i++)//2<3
		{
			sum+=arr[i];
		}
		
		int maxSum=sum;
		for(int i=k;i<arr.length;i++)//5<6
		{
			sum+=arr[i];
			sum-=arr[i-k];
			
			if(sum>maxSum)
			{
				maxSum=sum;
			}
		}
		
		System.out.println("The maximum sub array sum is :"+maxSum);
		
	}

}
