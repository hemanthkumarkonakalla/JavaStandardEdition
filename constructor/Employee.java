package com.java.standard.edition.constructor;

public class Employee 
{
	String name;
	int id;
	String dept;
	float salary;
	
	public Employee()
	{
		
	}
	
	public Employee(String name,int id,String dept,float salary)
	{
		this.name=name;
		this.id=id;
		this.dept=dept;
		this.salary=salary;
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
		Employee e1 = new Employee("Hemanth", 15, "software", 95000);
		
		System.out.println("Name:"+e1.getName());
		System.out.println("Id:"+e1.getId());
		System.out.println("Department :"+e1.getDept());
		System.out.println("Salary:"+e1.getSalary());
		
	}

}
