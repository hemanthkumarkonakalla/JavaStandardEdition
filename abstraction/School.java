package com.java.standard.edition.abstraction;

public class School 
{
	public void classRoom(Teacher ref)
	{
		ref.teach();
		ref.doExperiments();
		ref.display();
		System.out.println("The value stored in variable x is :"+ref.x);
		
	}

}
