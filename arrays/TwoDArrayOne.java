package com.java.standard.edition.arrays;

import java.util.Scanner;

public class TwoDArrayOne 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of schools:");
		int n1=sc.nextInt();
		System.out.println("Enter the no of students:");
		int n2=sc.nextInt();
		
		int marks[][] = new int[n1][n2];
		
		for(int i=0;i<=marks.length-1;i++)//2<=2
		{
			for(int j=0;j<=marks[i].length-1;j++)//1<=1
			{
				System.out.println("Enter the marks for school "+i+" and for student "+j);
				marks[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Array Contents are");
		for(int i=0;i<=marks.length-1;i++)
		{
			for(int j=0;j<=marks[i].length-1;j++)
			{
				System.out.print(marks[i][j]+" ");
			}
			System.out.println();
		}
		
		sc.close();
		
	}

}
