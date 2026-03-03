package com.java.standard.edition.arrays;

import java.util.Scanner;

public class TwoDArrayUserDefined 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of companies:");
		int n1=sc.nextInt();
		System.out.println("Enter the no of employees:");
		int n2=sc.nextInt();
		
		Employee details[][] = new Employee[n1][n2];
		
		for(int i=0;i<=details.length-1;i++)//2<=2
		{
			for(int j=0;j<=details[i].length-1;j++)//1<=1
			{
				System.out.println("Enter the employee id:");
				int eid=sc.nextInt();
				System.out.println("Enter the employee name:");
				String ename=sc.next();
				System.out.println("Enter the employee department:");
				String dept=sc.next();
				System.out.println("Enter the employee salary:");
				float salary=sc.nextFloat();
				
				Employee employee= new Employee(eid, ename, dept, salary);
				details[i][j]=employee;
			}
		}
		
		System.out.println("Array Contents are");
		for(int i=0;i<=details.length-1;i++)
		{
			for(int j=0;j<=details[i].length-1;j++)
			{
				System.out.println(details[i][j]+" ");
			}
			
			System.out.println();
		}
		
		sc.close();
		
	}

}
