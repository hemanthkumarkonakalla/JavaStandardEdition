package com.java.standard.edition.foreachmethod;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.*;

public class Demo 
{
	public static void main(String[] args) 
	{
		//List<Integer> list = new ArrayList<>(Arrays.asList(78,43,21,67,89,91,45));
		//Set<Integer> set = new HashSet<>(Arrays.asList(78,43,21,67,89,91,45,78));
		//Queue<Integer> queue = new PriorityQueue<>(Arrays.asList(78,43,21,67,89,91,45,78));
		Map<Integer,String> map = new HashMap<Integer, String>();
		map.put(1, "AnandKumarKonakalla");
		map.put(2, "HemanthKumarKonakalla");
		map.put(3, "PrasadKonakalla");
		map.put(4, "SekharKonakalla");
		map.put(5, "PriyankaKonakalla");

		//for loop
		
//		for(int i=0;i<list.size();i++)
//		{
//			System.out.println(list.get(i));
//		}
		
		//for each loop
		
//		for(Integer i:list)
//		{
//			System.out.println(i);
//		}
		
		
		//List
//		Consumer<Integer> con =(Integer i)->System.out.println(i);
//		list.forEach(con);
		
		//Set
//		Consumer<Integer> con = (Integer i)->System.out.println(i);
//		set.forEach(con);
		
		
		//Queue
//		Consumer<Integer> con =(Integer i)->System.out.println(i);
//		queue.forEach(con);
		
		
		//Map
		BiConsumer<Integer, String> biCon=(key,value)->System.out.println(key+" , "+value);
		map.forEach(biCon);
		
		
		
	}

}
