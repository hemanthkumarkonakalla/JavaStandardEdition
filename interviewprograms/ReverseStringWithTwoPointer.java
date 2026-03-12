package com.java.standard.edition.interviewprograms;
 
public class ReverseStringWithTwoPointer
{
	public static void main(String[] args) 
	{
		String s= "hemanth";
		System.out.println("String before reversing:"+s);
		char[] charArray = s.toCharArray();
		
		int left=0;
		int right=charArray.length-1;
		
		while(left<right)
		{
			char temp=charArray[left];
			charArray[left]=charArray[right];
			charArray[right]=temp;
			left++;
			right--;
			
		}
		
		System.out.println("String after reversing:"+new String(charArray));
		
	}

}
