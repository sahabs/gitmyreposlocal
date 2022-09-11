package com.saha.maven;

public class Course {
	private int id;
	private String name;
	private int credits;
	private Teacher teacher;
	private int teacherId;
	// Hard-coded min and max student values, but ideally should be
	// stored and obatined from database
	private int minStudents = 10;
	private int maxStudents = 60;

	public Course() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public int getMinStudents() {
		return minStudents;
	}

	public void setMinStudents(int minStudents) {
		this.minStudents = minStudents;
	}

	public int getMaxStudents() {
		return maxStudents;
	}

	public void setMaxStudents(int maxStudents) {
		this.maxStudents = maxStudents;
	}

	public char charAt(int index) {
		return name.charAt(index);
	}

	public boolean isEmpty() {
		return name.isEmpty();
	}

	/**********/
	// Delegate Method
	public String trim() {
		return name.trim();
	}

	public boolean isValidCourse() {
		return name != null && credits != 0 && name.trim().length() > 0;
	}

	public void addStudent(Student student) throws Exception {
		throw new Exception("Course if full. Enrollment closed");
	}
}
