package com.java.standard.edition.serializationdeserialization;

import java.io.Serializable;

public class Employee implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 10L;
	
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

	public int getId() {
		return id;
	}

	public String getDept() {
		return dept;
	}

	public float getSalary() {
		return salary;
	}
	
	

}
