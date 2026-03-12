package com.java.standard.edition.operators;

import java.util.Scanner;

public class TernaryOperator
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		String res=(num%2==0) ? "Even" : "Odd";
		System.out.println(res);
		sc.close();
		
	}

}
