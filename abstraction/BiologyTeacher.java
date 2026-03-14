package com.java.standard.edition.abstraction;

public class BiologyTeacher extends Teacher {

	@Override
	public void teach() {
		System.out.println("BiologyTeacher teaches the biology subject");
		
	}

	@Override
	public void doExperiments() {
		System.out.println("BiologyTeacher conducts the experiment");

	}

}
