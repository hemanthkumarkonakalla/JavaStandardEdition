package com.java.standard.edition.bean;

import java.io.Serializable;

public class Employee implements Serializable
{
	private String name;
	private int id;
	private String dept;
	private float salary;
	
	public Employee() {
		super();
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
	
	public static void main(String[] args) 
	{
		Employee emp = new Employee();
		emp.setName("Hemanth");
		emp.setId(80);
		emp.setDept("Software");
		emp.setSalary(95000);
		System.out.println(emp.getName());
		System.out.println(emp.getId());
		System.out.println(emp.getDept());
		System.out.println(emp.getSalary());
		
	}
	
	
	

}
