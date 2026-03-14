package com.java.standard.edition.abstraction;

public class PhysicsTeacher extends Teacher 
{

	@Override
	public void teach() 
	{
		System.out.println("PhysicsTeacher teaches the physics subject");
		
	}

	@Override
	public void doExperiments() {
		System.out.println("PhysicsTeacher conducts the experiment");
	}
	
	public void dynamics()
	{
		System.out.println("Dynamics is very imp concept in physics");
	}

}
