package com.java.standard.edition.collectionframework.treeset;

import java.util.TreeSet;


public class TreeSetElementAdding 
{
	public static void main(String[] args) 
	{
//		TreeSet<Employee> ts = new TreeSet<Employee>();
//		Employee emp1 = new Employee("HemanthKumarKonakalla", 15, 95000, "Software");
//		Employee emp2 = new Employee("AnandKumarKonakalla", 75, 85000, "Analyst");
//		Employee emp3 = new Employee("HemanthKumarKonakalla", 15, 95000, "Software");
//		ts.add(emp1);
//		ts.add(emp2);
//		ts.add(emp3);
		
		
		
		//TreeSet cannot sort the custom objects,we need to use Comparable and Comparator to sort custom objects
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(45);
		ts.add(12);
		ts.add(90);
		ts.add(12);
		ts.add(122);
		ts.add(99);
		ts.add(1998);
		ts.add(null);
		ts.add(null);
		
		System.out.println(ts);

	}

}

class Employee
{
	String name;
	int id;
	float salary;
	String dept;
	
	public Employee(String name,int id,float salary,String dept)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
		this.dept=dept;
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

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", dept=" + dept + "]";
	}

	

	
}
