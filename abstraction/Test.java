package com.java.standard.edition.abstraction;

public class Test 
{
	public static void main(String[] args) 
	{
		PhysicsTeacher pt = new PhysicsTeacher();
		ChemistryTeacher ct = new ChemistryTeacher();
		BiologyTeacher bt = new BiologyTeacher();
		
		School s = new School();
		s.classRoom(pt);
		pt.dynamics();
		System.out.println("==================================================================");
		s.classRoom(ct);
		System.out.println("==================================================================");
		s.classRoom(bt);
		
	}

}
