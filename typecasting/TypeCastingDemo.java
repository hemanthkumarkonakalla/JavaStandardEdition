package com.java.standard.edition.typecasting;

public class TypeCastingDemo 
{
	public static void main(String[] args) 
	{
		//implicit typecasting
		
		byte a=100;
		short b=a;
		
		System.out.println("The value stored in variable a is :"+a);
		System.out.println("The value stored in variable b is :"+b);
		
		//explicit type casting
		short x=136;
		byte y=(byte)x;
		
		System.out.println("The value stored in variable x is :"+x);//128
		System.out.println("The value stored in variable y is :"+y);//-120
		
		//data loss during explicit typecasting
		float p1=76.2f;
		int q1=(int)p1;
		System.out.println("The value stored in variable p1 is :"+p1);//76.2
		System.out.println("The value stored in variable q1 is :"+q1);//76
		
		
		// char datatype into another datatype
		
		char x1='a';
		int y1=x1;
		System.out.println("The value stored in variable x1 is :"+x1);//a
		System.out.println("The value stored in variable y1 is :"+y1);//97
		
		
	}

}
