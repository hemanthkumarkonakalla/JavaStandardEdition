package com.java.standard.edition.collectionframework.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSetElementsAdding 
{
	public static void main(String[] args) {
		//creation of LinkedHashSet
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		
		//adding the elements into LinkedHashSet
		lhs.add(45);
		lhs.add(145);
		lhs.add(4);
		lhs.add(54);
		lhs.add(21);
		lhs.add(90);
		lhs.add(123);
		lhs.add(199);
		lhs.add(175);
		
		
		LinkedHashSet<Integer> lhs1 = new LinkedHashSet<Integer>();
		lhs1.add(1000);
		lhs1.add(2000);
		lhs1.addAll(lhs);
		System.out.println(lhs1);
		
		
	}

}
