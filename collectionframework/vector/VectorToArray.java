package com.java.standard.edition.collectionframework.vector;

import java.util.Arrays;
import java.util.Vector;

public class VectorToArray 
{
	public static void main(String[] args) 
	{
		Vector<Integer> v = new Vector<Integer>(Arrays.asList(10,20,30,40,50));
		Object[] arr = v.toArray();
		System.out.println(Arrays.toString(arr));
		
	}

}
