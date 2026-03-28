package com.java.standard.edition.collectionframework.arraylist;

import java.util.ArrayList;

public class ArrayListElementsRetrieval 
{
	public static void main(String[] args) 
	{
		//creation of ArrayList
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//adding the elements into Arraylist
		list.add(10);
		list.add(2);
		list.add(34);
		list.add(12);
		list.add(99);
		list.add(87);
		list.add(67);
		list.add(65);
		list.add(100);
		list.add(150);
		list.add(10);
		list.add(null);
		list.add(0,10000);
		
		System.out.println(list);
		System.out.println(list.get(0));//10000
		
	}

}
