package com.java.standard.edition.collectionframework.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee("HemanthKumarKonakalla", 15, 95000, "Software");
		Employee e2 = new Employee("ChinniKonakalla", 72, 85000, "SoftwareDeveloper");
		Employee e3 = new Employee("RAM", 25, 75000, "CyberSecurity");
		Employee e4 = new Employee("Yeswanth", 55, 65000, "DevOps");
		Employee e5 = new Employee("Raju", 95, 55000, "Testing");
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		//System.out.print(list);
		
		//Traditional for loop
//		for(int i=0;i<list.size();i++)
//		{
//			System.out.print(list.get(i)+" ");
//		}
//		System.out.println();
		
		//Enhanced for loop
		
//		for(Employee res:list)
//		{
//			System.out.print(res+" ");
//		}
		
		//iterator
		
		Iterator<Employee> itr = list.iterator();
		while(itr.hasNext())
		{
			Employee emp = itr.next();
			System.out.println(emp);
		}
		
		
		//ListIterator
//		ListIterator<Employee> itr1 = list.listIterator();
//		System.out.println(itr1.hasNext());//true
//		System.out.println(itr1.next());
//		System.out.println(itr1.hasPrevious());
//		System.out.println(itr1.hasNext());
//		System.out.println(itr1.next());
//		System.out.println(itr1.previous());
	
	}

}

class Employee
{
	String name;
	int id;
	float salary;
	String dept;
	
	public Employee(String name, int id, float salary, String dept) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.dept = dept;
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
