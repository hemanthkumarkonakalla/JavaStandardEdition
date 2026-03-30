package com.java.standard.edition.collectionframework.treeset;

import java.util.TreeSet;

public class TreeSetElementsVerification {
	public static void main(String[] args) 
	{
		//creation of TreeSet
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		//adding the elements into TreeSet
		ts.add(45);
		ts.add(12);
		ts.add(90);
		ts.add(21);
		ts.add(99);
		ts.add(1);
		ts.add(0);
		ts.add(0);
		
		System.out.println(ts.contains(99));
		TreeSet<Integer> ts1 = new TreeSet<Integer>();
		ts1.add(1000);
		ts1.add(2000);
		ts1.addAll(ts);
		System.out.println(ts1.containsAll(ts));
		System.out.println(ts1);
		
	}
}
