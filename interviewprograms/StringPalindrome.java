package com.java.standard.edition.interviewprograms;
 
public class StringPalindrome 
{
	public static void main(String[] args) 
	{
		String s="madam";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev+=s.charAt(i);
		}
		
		System.out.println("The reverse of entered string is :"+rev);
		
		
		if(s.equals(rev))
		{
			System.out.println("Entered String "+s+" is palindrome");
		}
		else
		{
			System.out.println("Entered String "+s+" is not palindrome");
		}
		
	}

}
