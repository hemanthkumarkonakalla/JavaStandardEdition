package com.java.standard.edition.decisionmaking;

import java.util.Scanner;

public class NestedIfStatementDemo
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the username:");
		String uname=sc.next();
		System.out.println("Enter the password:");
		String pwd=sc.next();
		if(uname.equals("HemanthKumar"))
		{
			if(pwd.equals("chinni"))
			{
				System.out.println("welcome "+uname);
			}
			else
			{
				System.out.println("Invalid credentials !!!");
			}
		}
		else
		{
			System.out.println("Invalid username !!!");
		}
		
		sc.close();
		
	}

}
