package com.java.standard.edition.innerclasses;

public class Employee 
{
	int x=300;
	public Employee()
	{
		System.out.println("This is Employee class constructor");
	}
	
	void display()
	{
		//Local class
		class LocalDemo
		{
			int x=200;
			
			public LocalDemo()
			{
				System.out.println("This is Local class constructor");
			}
			
			void display1()
			{
				System.out.println("the value stored in instance variable x is :"+this.x);
				System.out.println("The value stored in Employee class instance x is :"+Employee.this.x);
				System.out.println("This is display1 method from Local class");
			}
		}
		
		LocalDemo ld = new LocalDemo();
		ld.display1();
	}
	
	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		e1.display();
		
	}

}
