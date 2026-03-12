package com.java.standard.edition.interviewprograms;

public class MissingElementFromArray 
{
	public static void main(String[] args) 
	{
		int arr[]= {101,102,104,105};
		int sum1=0;//412
		for(int i=0;i<=arr.length-1;i++)//3<=3
		{
			sum1+=arr[i];
		}
		
		int sum2=0;
		for(int i=101;i<=105;i++)//0<=3
		{
			sum2+=i;
		}
		
		System.out.println("The missing element from an array is :"+(sum2-sum1));
		
		
	}

}
