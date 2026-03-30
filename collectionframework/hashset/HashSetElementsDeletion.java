package com.java.standard.edition.collectionframework.hashset;

import java.util.HashSet;

public class HashSetElementsDeletion 
{
	public static void main(String[] args) 
	{
		//creation of HashSet
		HashSet<Integer> hs = new HashSet<Integer>();
		//adding the elements into HashSet
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(null);
		hs.add(50);
		hs.add(60);
		hs.add(10);
		hs.add(80);
		hs.add(null);
		
		hs.remove(10);
		
		HashSet<Integer> hs1 = new HashSet<Integer>();
		hs1.add(200);
		hs1.add(345);
		hs1.addAll(hs);
		hs1.removeAll(hs);
		hs1.clear();
		
		System.out.println(hs1);
		
	}

}
