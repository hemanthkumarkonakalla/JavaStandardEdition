package com.java.standard.edition.pojo;

public class Employee 
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
		emp.setName("HemanthKumarKonakalla");
		emp.setDept("Software");
		emp.setId(199);
		emp.setSalary(95000);
		System.out.println(emp.getName());
		System.out.println(emp.getId());
		System.out.println(emp.getDept());
		System.out.println(emp.getSalary());
		
	}
		

}
