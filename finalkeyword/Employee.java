package com.java.standard.edition.finalkeyword;

/*final*/ public class Employee  
{
	final int x=1000;
	
	String name;
	int id;
	
	public Employee(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	
	/*final*/ void display()
	{
		System.out.println("The Name of employee is :"+name);
		System.out.println("The Id of employee is :"+id);
	}

}
