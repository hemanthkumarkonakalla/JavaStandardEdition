package com.java.standard.edition.collectionframework.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class ArrayToLinkedList 
{
	public static void main(String[] args) 
	{
		Integer arr[]=new Integer[] {10,20,30,40,50};
		LinkedList<Integer> ll = new LinkedList<Integer>(Arrays.asList(arr));
		System.out.println(ll);
		
	}

}
