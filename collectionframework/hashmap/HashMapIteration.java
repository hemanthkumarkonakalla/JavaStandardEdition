package com.java.standard.edition.collectionframework.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapIteration 
{
	public static void main(String[] args) 
	{
		//Creation of HashMap
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		//adding the key,values into hashmap
		hm.put("English", 90);
		hm.put("Telugu", 96);
		hm.put("Social", 65);
		hm.put("Biology", 78);
		hm.put("Physics", 100);
		hm.put("Chemistry", 55);
		hm.put("Maths", 99);
		hm.put("Maths", 100); // key is repeated then the value will be overrided
		hm.put(null, null);
		hm.put(null, 2);
		
		
		for(Map.Entry<String, Integer> res:hm.entrySet())
		{
			System.out.println(res.getKey()+" : "+res.getValue());
		}
		
	}

}
