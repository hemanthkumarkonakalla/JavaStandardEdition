package com.java.standard.edition.collectionframework.linkedhashmap;

import java.util.LinkedHashMap;

public class LinkedHashMapKeyValueVerification {
	public static void main(String[] args) 
	{
		//creation of linkedhashmap
		LinkedHashMap<String, Integer> lh = new LinkedHashMap<String, Integer>();
		
		//adding the key,values into linkedhashmap
		
		lh.put("English", 90);
		lh.put("Telugu", 96);
		lh.put("Maths", 100);
		lh.put("Physics", 85);
		lh.put("Chemistry", 80);
		lh.put("Social", 77);
		lh.put("Biology", 72);
		lh.put("Biology", 82);
		lh.put(null, 72);
		lh.put(null, null);
		
		System.out.println(lh.containsKey("English"));
		System.out.println(lh.containsValue(80));
		
	}
}
