package com.java.standard.edition.interviewprograms;

public class ConsecutiveOnes 
{
	public static void main(String[] args) 
	{
		int arr[]= {1,1,0,1,1,1};
		int count=0;
		int maxCount=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==1)
			{
				count++;
			}
			else if(arr[i]==0)
			{
				count=0;
			}
		}
		
		if(count>maxCount)
		{
			maxCount=count;
		}
		
		System.out.println("The Consecutive One's count in array is:"+maxCount);
		
	}

}
