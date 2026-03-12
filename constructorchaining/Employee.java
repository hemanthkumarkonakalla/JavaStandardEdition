package com.java.standard.edition.constructorchaining;

public class Employee 
{
	String name;
	int id;
	String dept;
	float salary;
	
	public Employee()
	{
		super();
	}
	//Example for constructor chaining
	public Employee(String name)
	{
		this.name=name;
		id=15;
		dept="Software";
		salary=95000;
	}
	
	public Employee(String name,int id)
	{
		this(name);
		this.name=name;
		this.id=id;
		dept="Software";
		salary=95000;
	}
	
	public Employee(String name,int id,String dept)
	{
		this(name,id);
		this.name=name;
		this.id=id;
		this.dept=dept;
		salary=95000;
	}
	
	public Employee(String name,int id,String dept,float salary)
	{
		this(name,id,dept);
		this.name=name;
		this.id=id;
		this.dept=dept;
		this.salary=salary;
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
	
	public static void main(String[] args) 
	{
		Employee e1 = new Employee("HemanthKumarKonakalla",72,"CyberSecurity");
		System.out.println("Name:"+e1.getName());
		System.out.println("Id:"+e1.getId());
		System.out.println("Dept:"+e1.getDept());
		System.out.println("Salary:"+e1.getSalary());
		
	}

}
