package com.java.standard.edition.methods;

public class TypeFourMethod 
{
	int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	
	public static void main(String[] args) 
	{
		TypeFourMethod tfm = new TypeFourMethod();
		int res=tfm.add(10, 50);
		System.out.println(res);
		
	}
	

}
