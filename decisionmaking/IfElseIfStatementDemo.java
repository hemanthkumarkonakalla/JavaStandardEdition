package com.java.standard.edition.decisionmaking;

import java.util.Scanner;

public class IfElseIfStatementDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the marks:");
		int marks=sc.nextInt();
		if(marks>95 && marks<=100)
		{
			System.out.println("Outstanding");
		}
		else if(marks>=85 && marks<95)
		{
			System.out.println("A++");
		}
		else if(marks>=75 && marks <85)
		{
			System.out.println("A");
		}
		else if(marks>=65 && marks<75)
		{
			System.out.println("B++");
		}
		else if(marks>=55 && marks<65)
		{
			System.out.println("B");
		}
		else if(marks>=45 && marks<55)
		{
			System.out.println("C++");
		}
		else if(marks>=35 && marks<45)
		{
			System.out.println("C");
		}
		else if(marks>100 || marks <0)
		{
			System.out.println("Please enter the marks between 0-100 to find out the grade");
		}
		
		else
		{
			System.out.println("Fail");
		}
		
		sc.close();
	}

}
