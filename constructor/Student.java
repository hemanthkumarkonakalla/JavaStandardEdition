package com.java.standard.edition.constructor;

public class Student 
{
	String name;
	int id;
	String collegeName;
	float marks;
	
	//shadowing problem
//	public Student(String name,int id,String collegeName,float marks)
//	{
//		name=name;
//		id=id;
//		collegeName=collegeName;
//		marks=marks;
//	}
	
	//shadowing problem can be resolved by using this keyword
	public Student(String name,int id,String collegeName,float marks)
	{
		this.name=name;
		this.id=id;
		this.collegeName=collegeName;
		this.marks=marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public static void main(String[] args) 
	{
		Student s1 = new Student("Hemanth",15,"Aditya",76.8f);
		System.out.println("Name:"+s1.getName());
		System.out.println("Id:"+s1.getId());
		System.out.println("CollegeName:"+s1.getCollegeName());
		System.out.println("Marks:"+s1.getMarks());
		
	}
}
