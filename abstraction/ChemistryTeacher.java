package com.java.standard.edition.abstraction;

public class ChemistryTeacher extends Teacher {

	@Override
	public void teach() {
		System.out.println("ChemistryTeacher teaches the chemistry subject");

	}

	@Override
	public void doExperiments() {
		System.out.println("ChemistryTeacher conducts the experiment");

	}

}
