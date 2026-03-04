package com.java.standard.edition.methods;

public class TypeThreeMethod 
{
	int add()
	{
		int a=10;
		int b=30;
		int c=a+b;
		return c;
	}
	public static void main(String[] args) 
	{
		TypeThreeMethod ttm = new TypeThreeMethod();
		int res=ttm.add();
		System.out.println(res);
		
	}

}
