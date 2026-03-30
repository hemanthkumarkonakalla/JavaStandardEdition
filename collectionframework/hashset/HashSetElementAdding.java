package com.java.standard.edition.collectionframework.hashset;

import java.util.HashSet;
import java.util.Objects;

public class HashSetElementAdding
{
	public static void main(String[] args) 
	{
		
		HashSet<Employee> hs = new HashSet<Employee>();
		
		Employee emp1 = new Employee("HemanthKumarKonalalla", 15, 95000, "Software");
		Employee emp2 = new Employee("AnandKumarKonalalla", 25, 85000, "Analyst");
		Employee emp3 = new Employee("HemanthKumarKonalalla", 15, 95000, "Software");
		
		hs.add(emp1);
		hs.add(emp2);
		hs.add(emp3);
		hs.add(null);
		hs.add(null);
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp3.hashCode());

		System.out.println(hs);
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
