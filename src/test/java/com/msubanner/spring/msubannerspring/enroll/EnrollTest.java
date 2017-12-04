//Tests for the Enroll class, written by Eric Kearney on 3 Dec, 2017
package com.msubanner.spring.msubannerspring.enroll;

import org.junit.Test;
import org.junit.Assert;

import com.msubanner.spring.msubannerspring.section.Section;
import com.msubanner.spring.msubannerspring.student.Student;

public class EnrollTest {
    Enroll testEnroll = new Enroll();

    @Test
    /**
     * Tests the Enroll class's ability to get and set the id field
     */
    public void testSetAndGetId(){
        Long testId = 86534L;
        testEnroll.setId(testId);

        Assert.assertEquals(Long.valueOf(86534L), testEnroll.getId());
    }

    @Test
    /**
     * Tests the Enroll class's ability to get and set the Section field
     */
    public void testSetAndGetSection(){
        Section testSection = new Section();
        testEnroll.setSection(testSection);

        Assert.assertEquals(testSection, testEnroll.getSection());
    }

    @Test
    /**
     * Tests the Enroll class's ability to get and set the Student field
     */
    public void testSetAndGetStudent(){
        Student testStudent = new Student();
        testEnroll.setStudent(testStudent);

        Assert.assertEquals(testStudent, testEnroll.getStudent());
    }

    @Test
    /**
     * Tests the default constructor of the Enroll class when no arguments are passed
     * the id field should default -9998 to make it clear it was not set by a human
     */
    public void testConstructorNoParams(){
        Enroll testEnrollConstructor = new Enroll();

        Assert.assertEquals(Long.valueOf(-9998l), testEnrollConstructor.getId());
    }

    @Test
    /**
     * Tests the constructor of the Enroll class when one argument is passed
     * that one argument will be the id field
     */
    public void testConstructorOneParam(){
        Long testId = 54296l;
        Enroll testEnrollConstructor = new Enroll(testId);

        Assert.assertEquals(Long.valueOf(54296l), testEnrollConstructor.getId());
    }

    @Test
    /**
     * Tests the constructor of the Enroll class when two arguments are passed
     * those argumements, in order are:
     * the Section the student is being enrolled in
     * the Student being enrolled
     * here, the Id field defaults to '0', no idea if that's important or not
     */
    public void testConstructorTwoParams(){
        Section testSection = new Section();
        Student testStudent = new Student();
        Enroll testEnrollConstructor = new Enroll(testSection, testStudent);

        Assert.assertEquals(testSection, testEnrollConstructor.getSection());
        Assert.assertEquals(testStudent, testEnrollConstructor.getStudent());
        Assert.assertEquals(Long.valueOf(0), testEnrollConstructor.getId());
    }
}