//
package com.msubanner.spring.msubannerspring;

import static org.junit.Assert.*;

import com.msubanner.spring.msubannerspring.professor.Professor;
import org.junit.Assert;
import org.junit.Test;

public class ProfessorTest {
	Professor testProfessor = new Professor();

	/**
	 * Tests the constructor of the professor class with two parameters passed
	 * in order, those parameters will be be first name and last name
	 */
    @Test
	public void testProfessorConstructor2params(){
		String firstname = "Steven";
		String lastName = "Beaty";
		Professor testProfessor = new Professor(firstname, lastName);
		Assert.assertEquals("Steven", testProfessor.getFirstName());
		Assert.assertEquals("Beaty", testProfessor.getLastName());
	}

	/**
	 * Tests the constructor of the profeessor class with three parameteres passed
	 * in order, those parameters will be first name, last name, and the
	 * professor's unique ID number
	 */
	@Test
	public void testProfessorConstructor3Params(){
		String firstname = "Dennis";
		String lastName = "Ritchie";
		long id = 0451;
		Professor testProfessor = new Professor(firstname, lastName, id);
		Assert.assertEquals("Dennis", testProfessor.getFirstName());
		Assert.assertEquals("Ritchie", testProfessor.getLastName());
		Assert.assertEquals(Long.valueOf(0451), testProfessor.getId());
	}

	/**
	 * Tests the setter and getter for the first name field of the
	 * professor class
	 */
	@Test
	public void testProfeessorFirstName(){
		String firstName = "Linus";
		testProfessor.setFirstName(firstName);
		Assert.assertEquals("Linus", testProfessor.getFirstName());
	}

	/**
	 * Tests the setter and getter for the last name of the
	 * porfessor class
	 */
	@Test
	public void testProfeessorLastName(){
		String lastName = "Torvalds";
		testProfessor.setLastName(lastName);
		Assert.assertEquals("Torvalds", testProfessor.getLastName());
	}

	/**
	 * Tests the settere and getter for the unique ID
	 * number of the professor class
	 */
	@Test
	public void testProfessorId(){
		long id = 42;
		testProfessor.setId(id);
		Assert.assertEquals(Long.valueOf(42), testProfessor.getId());
	}

}
