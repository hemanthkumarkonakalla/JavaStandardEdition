package com.java.standard.edition.interviewprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FrequencyOfElementsInArray 
{
	public static void main(String[] args) 
	{
		int arr[]= {10,20,10,30,40,50,20,30};
		Map<Integer,Integer> hm = new HashMap<Integer, Integer>();
		int count=1;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(!hm.containsKey(arr[i]))
			{
				hm.put(arr[i], count);
			}
			else
			{
				hm.put(arr[i], hm.get(arr[i])+1);
			}
		}
		
		for(Entry<Integer, Integer> res:hm.entrySet())
		{
			System.out.println(res.getKey()+" : "+res.getValue());
		}
		
	}

}
