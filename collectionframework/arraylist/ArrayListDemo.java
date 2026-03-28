package com.java.standard.edition.collectionframework.arraylist;

import java.util.ArrayList;

public class ArrayListDemo 
{
	public static void main(String[] args) 
	{
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("HemanthKumarKonakalla", 15, "Software", 95000.0f));
		for(int i=0;i<=list.size()-1;i++)
		{
			System.out.println(list.get(i)+" ");
		}
		System.out.println(list);
		System.out.println(list.get(0).getName());
		System.out.println(list.isEmpty());
		
	}

}


class Employee
{
	String name;
	int id;
	String dept;
	float salary;
	
	public Employee(String name, int id, String dept, float salary) {
		super();
		this.name = name;
		this.id = id;
		this.dept = dept;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
	
	
	
}