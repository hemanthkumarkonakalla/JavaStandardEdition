package com.java.standard.edition.encapsulation;
 
public class Test 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		e1.setName("HemanthKumarKonakalla");
		e1.setId(15);
		e1.setDept("Software");
		e1.setSalary(95000);
		
		System.out.println("Name:"+e1.getName());
		System.out.println("Id:"+e1.getId());
		System.out.println("Dept:"+e1.getDept());
		System.out.println("Salary:"+e1.getSalary());
	}

}
