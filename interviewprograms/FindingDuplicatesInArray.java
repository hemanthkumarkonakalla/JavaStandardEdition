package com.java.standard.edition.interviewprograms;

import java.util.HashSet;
import java.util.Set;

public class FindingDuplicatesInArray 
{
	public static void main(String[] args) 
	{
		String arr[]= {"Anand","Hemanth","Priyanka","Prasad","Sekhar","hemanth","priyanka"};
		Set<String> hs = new HashSet<String>();
		for(int i=0;i<=arr.length-1;i++)//5<=6
		{
			String lowerCase = arr[i].toLowerCase();
			if(!hs.contains(lowerCase))
			{
				hs.add(lowerCase);
			}
			else
			{
				System.out.println(arr[i]+" ");
			}
		}
		
	}

}
