package com.java.standard.edition.innerclasses;

public class Outer 
{
	private int x=300;
	
	static int z=330;
	
	public Outer()
	{
		System.out.println("This is outer class constructor");
	}
	
	public void display()
	{
		System.out.println("This is display method of outer class");
	}
	
	//Nested static inner class
	static class Inner1
	{
		int y=200;
		
		public Inner1()
		{
			System.out.println("This is inner1 class constructor");
		}
		
		public void display1()
		{
			System.out.println("The value stored in variable y is :"+y);
			System.out.println("The value stored in variable z is :"+z);

			System.out.println("This is display1 method from inner1 class");
		}

		
	}
	
	abstract class Inner2
	{
		int x=300;
		
		public Inner2()
		{
			System.out.println("This is inner2 class constructor");
		}
		
		abstract void display1();
		
	}
	
	class Inner4 extends Inner2 implements Test
	{

		@Override
		void display1() {
			System.out.println("This is display method of Inner4 class");
		}

		@Override
		public void testing() {
			System.out.println("This is testing method");
		}
		
		
	}
	
	final class Inner3
	{
		int x=200;
		
		public Inner3()
		{
			System.out.println("This is inner3 class constructor");
		}
		
		public void display1()
		{
			int x=100;
			System.out.println("The valu stored in local variable x is :"+x);
			System.out.println("The value stored in instance variable x is :"+this.x);
			System.out.println("The value stored in inner class instance variable x is :"+Outer.this.x);
		}
		
	}
	
	//Nested non static inner class
	 class Inner5
	{
		int x=200;
		
		public Inner5()
		{
			System.out.println("This is inner5 class constructor");
		}
		
		public void display1()
		{
			int x=100;
			System.out.println("The valu stored in local variable x is :"+x);
			System.out.println("The value stored in instance variable x is :"+this.x);
			System.out.println("The value stored in inner class instance variable x is :"+Outer.this.x);
			System.out.println("This is display1 method of inner5 class");
		}
		
	}
	
	
	public static void main(String[] args) 
	{
		Outer o = new Outer();
//		Inner1 i1 = o.new Inner1();
//		i1.display1();
		
//		Inner2 i2 = o.new Inner2();
//		i2.display1();
		
//		Inner1 i1 = new Inner1();
//		i1.display1();
		
		Inner4 i4 = o.new Inner4();
		i4.display1();
		i4.testing();
		
		
//		Inner3 i3 = o.new Inner3();
//		i3.display1();
		
		
		
	}

}


