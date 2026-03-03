package com.java.standard.edition.arrays;

import java.util.Scanner;

public class ArrayOneUserDefined 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size=sc.nextInt();
		Employee details[] = new Employee[size];
		for(int i=0;i<=details.length-1;i++)//4<=4
		{
			System.out.println("Enter the employee id:");
			int eid=sc.nextInt();
			System.out.println("Enter the employee name:");
			String ename=sc.next();
			System.out.println("Enter the employee department:");
			String dept=sc.next();
			System.out.println("Enter the employee salary:");
			float salary=sc.nextFloat();
			
			Employee employee = new Employee(eid, ename, dept, salary);
			details[i]=employee;
		}
		
		System.out.println("Array Contents are");
		for(int i=0;i<=details.length-1;i++)
		{
			System.out.println(details[i]+" ");
		}
		
		System.out.println();
		sc.close();
		
	}

}
