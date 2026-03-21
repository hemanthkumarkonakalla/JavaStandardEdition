package com.java.standard.edition.interviewprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FrequencyOfCharactersInArray 
{
	public static void main(String[] args) 
	{
		char arr[]= {'h','s','p','p','a','h'};
		Map<Character, Integer> hm = new HashMap<Character, Integer>();
		
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
		
		
		
		for(Entry<Character, Integer> res:hm.entrySet())
		{
			System.out.println(res.getKey()+" : "+res.getValue());
		}
	}

}
