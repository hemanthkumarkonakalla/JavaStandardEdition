package com.java.standard.edition.collectionframework.treemap;

import java.util.TreeMap;

public class TreeMapKeyValueVerification {
	public static void main(String[] args) 
	{
		//creation of TreeMap
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		
		//adding the key,values into TreeMap
		tm.put("English", 90);
		tm.put("Telugu", 96);
		tm.put("Physics", 80);
		tm.put("Chemistry", 92);
		tm.put("Biology", 93);
		tm.put("Maths", 91);
		tm.put("Social", 90);
		
		System.out.println(tm.containsKey("English"));
		System.out.println(tm.containsValue(93));
		
		
	}
}
