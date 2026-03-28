package com.java.standard.edition.objectclass;

public class Test 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee("HemanthKumarKonakalla", 15, "SoftwareDevelopment", 95000.00f);
		Employee e2 = new Employee("AnandKumarKonakalla", 25, "Analyst", 85000.00f);
		Employee e3 = new Employee("HemanthKumarKonakalla", 15, "SoftwareDevelopment", 95000.00f);
		
		System.out.println(e1.equals(e2));//false
		
		/*
		 * After Overriding the equals() method from object class
		 * it is comparing the contents of 2 objects
		 */
		System.out.println(e1.equals(e3));//true
		
		System.out.println(e1.hashCode());//-1348836597
		System.out.println(e2.hashCode());//-1884735186
		System.out.println(e3.hashCode());//-1348836597
		
		System.out.println(e1);


	}

}
