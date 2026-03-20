package com.java.standard.edition.methodreferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DemoOne 
{
	String name;
	public DemoOne(String name)
	{
		this.name=name;
		//System.out.println("Name is :"+name);
	}
	
	public static void main(String[] args) 
	{
		List<String> names= new ArrayList<String>(Arrays.asList("Sekhar","Prasad","Hemanth","Anand","Priyanka"));
		
		//Reference to static method
//		names.forEach(DemoOne::greet);
		
		//Reference to instance method
//		DemoOne d1 = new DemoOne();
//		names.forEach(d1::display1);
		
		//Reference to instance method of arbitary object of particular type
//		Collections.sort(names,String::compareTo);
//		names.forEach(System.out::println);

		//Reference to constructor
		names.forEach(DemoOne::new);
		names.forEach(System.out::println);
		
		
		
	}
	
	public static void greet(String name)
	{
		System.out.println("Hello My Name is:"+name);
	}
	
	public void display1(String name)
	{
		System.out.println("Hello My name is :"+name);
	}
}

