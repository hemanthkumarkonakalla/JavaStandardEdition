package com.java.standard.edition.methodoverloading;
//static method overloading
public class DemoOne 
{
	public static void main(int args) 
	{
		System.out.println("This is integer argument");
		
	}

	public static void main(String[] args) {
		System.out.println("Main method with string args");
		main(56);
		main();
	}
	
	public static void main() 
	{
		System.out.println("Main method with no args");
		
	}
}

