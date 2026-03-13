package com.java.standard.edition.interviewprograms;

import java.util.Scanner;

public class VowelsConsonants
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string:");
		String s=sc.nextLine();
		String s1=s.toLowerCase();
		int vowels=0;
		int consonants=0;
		for(int i=0;i<=s.length()-1;i++)//6<=6
		{
			char ch=s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				vowels++;
			}
			else
			{
				consonants++;
			}
		}
		
		System.out.println("Vowels Count in the entered String "+s1+" is :"+vowels);
		System.out.println("Consonants Count in the entered String "+s1+" is :"+consonants);
		sc.close();

		
	}

}
