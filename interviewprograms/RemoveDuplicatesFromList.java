package com.java.standard.edition.interviewprograms;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesFromList 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,10,40));
		System.out.println("ArrayList before removing the duplicates:");
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for(int i=0;i<list.size();i++)
		{
			if(!list2.contains(list.get(i)))
			{
				list2.add(list.get(i));
			}
		}
		
		System.out.println("ArrayList before removing the duplicates:");
		for(int i=0;i<list2.size();i++)
		{
			System.out.print(list2.get(i)+" ");
		}
		
		
		
	}

}
