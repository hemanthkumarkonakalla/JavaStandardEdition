package com.java.standard.edition.stringmethods;

public class StringInBuiltMethods 
{
	public static void main(String[] args) 
	{
		toUpper("hemanthkumarkonakalla");//HEMANTHKUMARKONAKALLA
		toLower("HEMANTHKUMAR");//hemanthkumar
		lengthOfString("HemanthKumarKonakalla");//21
		chatAtIndex(1,"HemanthKumarKonakalla");//e
		indexOfCharacter('e',"HemanthKumarKonakalla");//1
		lastIndexCharacter('a',"HemanthKumarKonakalla");//20
		
		boolean startsMethod = startsMethod("HemanthKumarKonakalla","H");
		System.out.println(startsMethod);//true
		
		boolean endsMethods = endsMethods("HemanthKumar","z");
		System.out.println(endsMethods);//false
		
		boolean containsMethod = containsMethod("HemanthKumar","man");
		System.out.println(containsMethod);//true
		
		String s1="            Hemanth                ";
		System.out.println("Length before trim:"+s1.length());//35
		trimMethod("            Hemanth                ");
		
		emptyMethod("");//true
		blankMethod("");//true
		replaceMethod("HemanthKumarKonakalla",'a','x');//HemxnthKumxrKonxkxllx
		subStringMethod("HemanthKumarKonakalla",1,4);//ema
		String res=concatMethod("Hemanth","Kumar");
		System.out.println(res);//HemanthKumar
		
		
	}
	
	private static void toUpper(String name)
	{
		String s=name.toUpperCase();
		System.out.println(s);
	}
	
	private static void toLower(String name)
	{
		String s=name.toLowerCase();
		System.out.println(s);
	}
	
	private static void lengthOfString(String name)
	{
		int s=name.length();
		System.out.println(s);
	}
	
	private static void chatAtIndex(int index,String name)
	{
		char res=name.charAt(index);
		System.out.println(res);
	}

	private static void indexOfCharacter(char c,String name)
	{
		int res=name.indexOf(c);
		System.out.println(res);
	}
	
	private static void lastIndexCharacter(char c,String name)
	{
		int res=name.lastIndexOf(c);
		System.out.println(res);
	}
	
	private static boolean startsMethod(String s,String c)
	{
		boolean res=s.startsWith(c);
		return res;
	}
	
	private static boolean endsMethods(String s,String s1)
	{
		boolean res=s.endsWith(s1);
		return res;
	}
	
	private static boolean containsMethod(String s,String c)
	{
		boolean contains = s.contains(c);
		return contains;
	}
	
	private static void trimMethod(String s1)
	{
		String s = s1.trim();
		System.out.println("Length after  trim:"+s.length());//7
		System.out.println(s);
	}
	
	private static void emptyMethod(String s)
	{
		boolean res=s.isEmpty();
		System.out.println(res);
	}
	
	private static void blankMethod(String s)
	{
		boolean res = s.isBlank();
		System.out.println(res);
	}
	
	private static void replaceMethod(String s1,char c1,char c2)
	{
		String res=s1.replace(c1, c2);
		System.out.println(res);
	}
	
	private static void subStringMethod(String s,int index1,int index2)
	{
		String res=s.substring(index1,index2);
		System.out.println(res);
	}
	
	private static String concatMethod(String s1,String s2)
	{
		String res=s1.concat(s2);
		return res;
	}
}
