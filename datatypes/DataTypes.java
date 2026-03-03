package com.java.standard.edition.datatypes;

public class DataTypes 
{
	public static void main(String[] args) 
	{
		boolean a=false;
		char b ='k';
		byte c=100;
		short d=30000;
		int e =7654321;
		long f=9515537631L;
		float g=76.2f;
		double h=78.987654;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
		System.out.println("==========================================================================");
		
		System.out.println("The memory occupied by char data type is :"+Character.BYTES+"byte's");
		System.out.println("The memory occupied by byte data type is :"+Byte.BYTES+"byte's");
		System.out.println("The memory occupied by short data type is :"+Short.BYTES+"byte's");
		System.out.println("The memory occupied by int data type is :"+Integer.BYTES+"byte's");
		System.out.println("The memory occupied by long data type is :"+Long.BYTES+"byte's");
		System.out.println("The memory occupied by float data type is :"+Float.BYTES+"byte's");
		System.out.println("The memory occupied by double data type is :"+Double.BYTES+"byte's");
		
		System.out.println("==========================================================================");
		
		System.out.println("char datatype can store the values from "+Character.MIN_VALUE+" to "+Character.MAX_VALUE);
		System.out.println("byte datatype can store the values from "+Byte.MIN_VALUE+" to "+Byte.MAX_VALUE);
		System.out.println("short datatype can store the values from "+Short.MIN_VALUE+" to "+Short.MAX_VALUE);
		System.out.println("int datatype can store the values from "+Integer.MIN_VALUE+" to "+Integer.MAX_VALUE);
		System.out.println("long datatype can store the values from "+Long.MIN_VALUE+" to "+Long.MAX_VALUE);
		System.out.println("float datatype can store the values from "+Float.MIN_VALUE+" to "+Float.MAX_VALUE);
		System.out.println("double datatype can store the values from "+Double.MIN_VALUE+" to "+Double.MAX_VALUE);

	}

}
