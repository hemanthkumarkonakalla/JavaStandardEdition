package com.java.standard.edition.collectionframework.vector;

import java.util.Vector;

public class VectorElementsVerification {
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
		
		System.out.println(v.contains(1000));
		Vector<Integer> v1 = new Vector<>();
		v1.add(567);
		v1.add(15);
		v1.add(23);
		v1.addAll(0,v);
		System.out.println(v1.containsAll(v));
		System.out.println(v1);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		
		
	}

}
