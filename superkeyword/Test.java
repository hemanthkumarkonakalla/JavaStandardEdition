package com.java.standard.edition.superkeyword;
  
public class Test extends Student
{
	int x=2000;
	public Test(int marks,String name,String collegeName)
	{
		super(marks,name,collegeName);
	}
	
	public void display1()
	{
		System.out.println("The value stored in variable x is :"+super.x);
		System.out.println("The value stored in variable x is :"+this.x);

		super.display();
		System.out.println("This is display1 method from Test class");
	}
	
	public static void main(String[] args) 
	{
		Test t = new Test(78,"HemanthKumarKonakalla","Aditya");
		t.display1();			
		
	}

}
