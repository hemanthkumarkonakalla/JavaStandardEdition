package com.java.standard.edition.encapsulation;
 
public class Employee 
{
	private int id;
	private String name;
	private String dept;
	private float salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id<0)
		{
			System.out.println("Please enter the id greater than 0");
		}
		else
		{
			this.id = id;
		}
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length()>7)
		{
			this.name = name;
		}
		else
		{
			System.out.println("Please enter the name with minimum characters of 7");
		}
		
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		if(dept.length()>5)
		{
			this.dept = dept;
		}
		else
		{
			System.out.println("Please enter the dept with minimum characters of 5");
		}
		
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		if(salary>0)
		{
			this.salary = salary;
		}
		else
		{
			System.out.println("Please enter the salary greater than 0");
		}
		
		
	}
	
	
	

}
