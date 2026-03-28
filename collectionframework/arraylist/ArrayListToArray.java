package com.java.standard.edition.collectionframework.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		Object[] array = list.toArray();
		System.out.println(Arrays.toString(array));
	}

}
