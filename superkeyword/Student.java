package com.java.standard.edition.superkeyword;
  
public class Student
{
	int marks;
	String name;
	String collegeName;
	
	int x=1000;
	
	public Student(int marks,String name,String collegeName)
	{
		this.marks=marks;
		this.name=name;
		this.collegeName=collegeName;
	}
	
	public void display()
	{
		System.out.println("The name of student:"+name);
		System.out.println("The marks of student:"+marks);
		System.out.println("The collgeName is :"+collegeName);
	}

}
