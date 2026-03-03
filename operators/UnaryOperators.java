package com.java.standard.edition.operators;

public class UnaryOperators 
{
	public static void main(String[] args) 
	{
		int x=5;
		int y=-10;
		boolean z=false;
		System.out.println(+x);//5
		System.out.println(-y);//10
		System.out.println(!z);
		
		int a=2;
		int b=a++ + --a + a++ + ++a + --a - --a * a++ * ++a + a--;
		System.out.println(a);//3
		System.out.println(b);//1
		
	}

}
