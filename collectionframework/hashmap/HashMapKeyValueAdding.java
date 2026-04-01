package com.java.standard.edition.collectionframework.hashmap;

import java.util.HashMap;

public class HashMapKeyValueAdding 
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
		
		
		System.out.println(hm);
		
	}

}
