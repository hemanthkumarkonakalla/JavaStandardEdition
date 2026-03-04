package com.java.standard.edition.strings;

public class StringFiveteen 
{
	public static void main(String[] args) 
	{
		StringBuilder sb1 = new StringBuilder("Hemanth");
		//System.out.println(sb1.append("KumarKonakalla"));//HemanthKumarKonakalla
		//System.out.println(sb1);//HemanthKumarKonakalla
		//System.out.println(sb1.insert(2, "XXX"));//HeXXXmanth
		//System.out.println(sb1.reverse());//htnameH
		//System.out.println(sb1.replace(1, 4, "XXX"));//HXXXnth
		//System.out.println(sb1.delete(1, 4));//Hnth
		System.out.println(sb1.capacity());//23
		
		
	}

}
