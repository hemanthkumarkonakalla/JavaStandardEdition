package com.java.standard.edition.instance;

public class Employee 
{
	//Instance Variables
	
	String name;
	int id;
	String dept;
	float salary;
	
	//Instance block
	{
		name="HemanthKumarKonakalla";
		id=72;
		dept="Software";
		salary=95000;
		System.out.println("This is instance block");
	}
	
	//Instance method
	void display()
	{
		System.out.println("The Name of employee is :"+name);
		System.out.println("The Id of employee is :"+id);
		System.out.println("The Dept of employee is :"+dept);
		System.out.println("The Salary of employee is:"+salary);
	}
	
	
	
	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		e1.display();
		
	}
	
	
	
	

}
