package com.java.standard.edition.arrays;

public class Employee 
{
	int id;
	String name;
	String dept;
	float salary;
	
	public Employee() {
		super();
	}

	public Employee(int id, String name, String dept, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
	

}
