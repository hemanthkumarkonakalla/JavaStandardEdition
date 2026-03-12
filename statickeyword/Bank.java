package com.java.standard.edition.statickeyword;

import java.util.Scanner;

public class Bank 
{
	int principalAmount;
	int time;
	static float ri;
	float si; // static variable
	
	static// static block
	{
		ri=2.0f;
	}
	
	public void takeInput()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount:");
		principalAmount=sc.nextInt();
		System.out.println("Enter the time in months:");
		time=sc.nextInt();
	}
	
	public void calculate()
	{
		si=(principalAmount*time*ri)/100;
		System.out.println("The simple intrest of the amount "+principalAmount+" is :"+si+"rupees's");
		System.out.println("The time taken to clear the loan amount"+principalAmount+" rupees is :"+time+" month's");
	}
	
	

}
