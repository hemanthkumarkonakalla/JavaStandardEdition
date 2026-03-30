package com.java.standard.edition.collectionframework.linkedlist;

import java.util.LinkedList;

public class LinkedListElementsRetrieval 
{
	public static void main(String[] args) 
	{
		//Creation of LinkedList
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		//Adding the elements into LinkedList
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(32);
		ll.add(12);
		ll.add(0,122);
		ll.add(10);
		ll.add(null);
		
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(1000);
		l.add(2000);
		l.addAll(0,ll);
		
		System.out.println(l.get(0));
		
	}

}
