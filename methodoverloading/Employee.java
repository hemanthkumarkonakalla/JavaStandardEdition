package com.java.standard.edition.methodoverloading;
//Constructor Overloading
public class Employee 
{
	String name;
	int id;
	String dept;
	float salary;
	
	public Employee()
	{
		
	}
	
	public Employee(String name)
	{
		this.name=name;
	}
	
	public Employee(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	
	public Employee(String name,int id,String dept)
	{
		this.name=name;
		this.id=id;
		this.dept=dept;
	}
	
	public Employee(String name,int id,String dept,float salary)
	{
		this.name=name;
		this.id=id;
		this.dept=dept;
		this.salary=salary;
	}
	
	public static void main(String[] args) 
	{
		Employee e1 = new Employee("HemanthKumarKonakalla",15,"Software",95000);
		
		System.out.println("Name:"+e1.name);
		System.out.println("Id:"+e1.id);
		System.out.println("Dept:"+e1.dept);
		System.out.println("Salary:"+e1.salary);
		
	}

}
