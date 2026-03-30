package com.java.standard.edition.collectionframework.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListToArray 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> ll = new LinkedList<Integer>(Arrays.asList(10,20,30,40,50));
		Object[] arr = ll.toArray();
		System.out.println(Arrays.toString(arr));
		
	}

}
