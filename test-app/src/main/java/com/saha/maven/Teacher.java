package com.saha.maven;

public class Teacher extends Person {
	private String designation;

	public Teacher() {

	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public boolean isValidTeacher() {
		return this.getFirstName() != null;
	}	

}
