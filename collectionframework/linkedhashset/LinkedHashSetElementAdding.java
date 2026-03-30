package com.java.standard.edition.collectionframework.linkedhashset;

import java.util.LinkedHashSet;
import java.util.Objects;

public class LinkedHashSetElementAdding 
{
	public static void main(String[] args) 
	{
		LinkedHashSet<Employee> lhs = new LinkedHashSet<Employee>();
		Employee emp1 = new Employee("HemanthKumarKonakalla", 15, 95000, "Software");
		Employee emp2 = new Employee("AnandKumarKonakalla", 75, 85000, "Analyst");
		Employee emp3 = new Employee("HemanthKumarKonakalla", 15, 95000, "Software");
		lhs.add(emp1);
		lhs.add(emp2);
		lhs.add(emp3);
		lhs.add(null);
		lhs.add(null);
		System.out.println(lhs);

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

	@Override
	public int hashCode() {
		return Objects.hash(dept, id, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(dept, other.dept) && id == other.id && Objects.equals(name, other.name)
				&& Float.floatToIntBits(salary) == Float.floatToIntBits(other.salary);
	}

	
}
