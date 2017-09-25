package com.msubanner.spring.msubannerspring;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProfessorTest {

	@Test	
	public void ProfessorTest() {
		Professor professor = new Professor("First", "Last");
		assertTrue(professor != null);
	}

	@Test
	public void getFirstNameTest() {
		Professor professor = new Professor("First", "Last");
		assertTrue(professor.getFirstName() == "First");
	}

	@Test
	public void setFirstNameTest() {
		Professor professor = new Professor("First", "Last");
		professor.setFirstName("NewFirst");
		assertTrue(professor.getFirstName() == "NewFirst");
	}

	@Test
    public void getLastNameTest() {
    	Professor professor = new Professor("First", "Last");
		assertTrue(professor.getLastName() == "Last");
    }

	@Test
    public void setLastNameTest() {
    	Professor professor = new Professor("First", "Last");
    	professor.setLastName("NewLast");
		assertTrue(professor.getLastName() == "NewLast");
    }

	@Test
    public void getIdTest() {
    	Professor professor = new Professor("First", "Last");
    	professor.setId((long) 123456);
		assertTrue(professor.getId() == (long) 123456);
    }

	@Test
    public void setIdTest() {
    	Professor professor = new Professor("First", "Last");
    	professor.setId((long) 123456);
		assertTrue(professor.getId() == (long) 123456);
    }

}
