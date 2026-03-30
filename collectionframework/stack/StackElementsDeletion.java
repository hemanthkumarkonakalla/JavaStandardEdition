package com.java.standard.edition.collectionframework.stack;

import java.util.Stack;

public class StackElementsDeletion 
{
	public static void main(String[] args) 
	{
		//Creation of Stack
		Stack<Integer> s = new Stack<Integer>();
		//Adding the elements into Stack
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		s.pop();
		System.out.println(s);
		
	}

}
