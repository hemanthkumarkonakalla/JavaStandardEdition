package com.java.standard.edition.collectionframework.vector;

import java.util.Vector;

public class VectorElementsDeletion {
	public static void main(String[] args) 
	{
		//creation of Vector
		Vector<Integer> v = new Vector<>();
		
		//adding the elements into Vector
		v.add(45);
		v.add(43);
		v.add(89);
		v.add(4);
		v.add(5);
		v.add(15);
		v.add(55);
		v.add(15);
		v.add(null);
		v.add(100);
		v.add(92);
		v.add(null);
		v.add(0,1000);
		
		v.remove(0);
		
		Vector<Integer> v1 = new Vector<>();
		v1.add(567);
		v1.add(15);
		v1.add(23);
		v1.addAll(0,v);
		
		v1.removeAll(v);
		
		v1.clear();
		System.out.println(v1);
		
		
	}
}
