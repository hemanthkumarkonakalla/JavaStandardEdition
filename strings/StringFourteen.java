package com.java.standard.edition.strings;

import java.util.StringTokenizer;

public class StringFourteen 
{
	public static void main(String[] args) 
	{
		StringTokenizer st = new StringTokenizer("HemanthKumarKonakalla","a");
		while(st.hasMoreTokens())
		{
			String s3=st.nextToken();
			System.out.println(s3);//Hem nthkum rKon k ll
		}
		
	}

}
