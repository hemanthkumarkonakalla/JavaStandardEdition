package com.java.standard.edition.collectionframework.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList 
{
	public static void main(String[] args) 
	{
		Integer arr[]= {10,20,45,65,78,76};
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		System.out.println(list);
		
	}

}
