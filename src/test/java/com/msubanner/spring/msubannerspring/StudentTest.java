package com.msubanner.spring.msubannerspring;

import static org.junit.Assert.*;

import com.msubanner.spring.msubannerspring.student.Student;
import org.junit.Test;

public class StudentTest {

	@Test
	public void StudentTest() {
		Student student = new Student("First", "Last");
		assertTrue(student != null);
	}

	@Test
	public void getFirstNameTest() {
		Student student = new Student("First", "Last");
		assertTrue(student.getFirstName() == "First");
	}

	@Test
	public void setFirstNameTest() {
		Student student = new Student("First", "Last");
		student.setFirstName("NewFirst");
		assertTrue(student.getFirstName() == "NewFirst");
    }

	@Test
    public void getLastNameTest() {
    	Student student = new Student("First", "Last");
		assertTrue(student.getLastName() == "Last");
    }

	@Test
    public void setLastNameTest() {
    	Student student = new Student("First", "Last");
    	student.setLastName("NewLast");
		assertTrue(student.getLastName() == "NewLast");
    }

	@Test
    public void getIdTest() {
    	Student student = new Student("First", "Last");
    	student.setId((long) 123456);
		assertTrue(student.getId() == (long) 123456);
    }

	@Test
    public void setIdTest() {
    	Student student = new Student("First", "Last");
    	student.setId((long) 123456);
		assertTrue(student.getId() == (long) 123456);
    }
}
