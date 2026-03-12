package com.java.standard.edition.accessmodifiers1;

public class ClassA 
{

	 // ---> Public Access Modifier   
	
	 public int x=100;
	
	
	public ClassA()
	{
		System.out.println("This is Constructor from class A");
	}
	
	
	public void display()
	{
		System.out.println("This is display method from class A");
	}
	
	 
	 // ---> Protected Access Modifier
//	protected int x=100;
//	
//	protected ClassA() 
//	{
//		System.out.println("This is Constructor from class A");
//	}
//
//	
//	protected void display()
//	{
//		System.out.println("This is display method from class A");
//	}
	
	 
	 // ---> Default Access Modifier
	
//	 int x=100;
//	
//	 ClassA() 
//	{
//		System.out.println("This is Constructor from class A");
//	}
//
//	
//	 void display()
//	{
//		System.out.println("This is display method from class A");
//	}

	 // ---> Private Access Modifier
	 
//    private  int x=100;
//		
//	private ClassA() 
//	{
//		System.out.println("This is Constructor from class A");
//	}
//
//	
//	private void display()
//	{
//		System.out.println("This is display method from class A");
//	}
	
	public static void main(String[] args) 
	{
		ClassA a = new ClassA();
		System.out.println("The value stored in variable x is :"+a.x);
		a.display();
		
	}

}
