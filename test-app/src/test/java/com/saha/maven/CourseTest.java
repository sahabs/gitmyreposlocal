package com.saha.maven;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class CourseTest {

	public CourseTest() {

	}

	@Test
	public void testIsValidCourse() {
		Course course = new Course();
		// First validate without any values set
		Assert.assertFalse(course.isValidCourse());
		// set name
		course.setName("course1");
		Assert.assertFalse(course.isValidCourse());
		// set zero credits
		course.setCredits(0);
		Assert.assertFalse(course.isValidCourse());
		// now set valid credits
		course.setCredits(4);
		Assert.assertTrue(course.isValidCourse());

		// set empty course name
		course.setName("");
		Assert.assertFalse(course.isValidCourse());
	}

	@Ignore
	public void testAddStudent() {
		// create course
		Course course = new Course();
		course.setId(1);
		course.setName("course1");
		course.setMaxStudents(2);
		// create student
		Student student = new Student();
		student.setFirstName("Student1");
		student.setId(1);
		// now add student
		try {
			course.addStudent(student);
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

}
