package com.java.standard.edition.collectionframework.vector;

import java.util.Arrays;
import java.util.Vector;

public class ArrayToVector 
{
	public static void main(String[] args) 
	{
		Integer arr[] = new Integer[]{10,20,30,40,50};
		Vector<Integer> v = new Vector<Integer>(Arrays.asList(arr));
		System.out.println(v);
		
	}

}
