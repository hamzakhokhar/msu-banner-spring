//Semester test written by Eric Kearney
package com.msubanner.spring.msubannerspring.semester;

import com.msubanner.spring.msubannerspring.course.Course;
import com.msubanner.spring.msubannerspring.section.Section;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SemesterTest {
    Semester testSemester = new Semester();

    @Test
    public void testID() {
        Long id = Long.valueOf(420);
        testSemester.setId(id);
        Assert.assertEquals(Long.valueOf(420), testSemester.getId());
    }

    @Test
    public void testSemesterName() {
        String name = "Spring 2018";
        testSemester.setSemesterName(name);
        Assert.assertEquals("Spring 2018", testSemester.getSemesterName());
    }

    @Test
    public void testStartDate() {
        String startDate = "January 16 2018";
        testSemester.setStartDate(startDate);
        Assert.assertEquals("January 16 2018", testSemester.getStartDate());
    }

    @Test
    public void testEndDate() {
        String endDate = "Sometime in May";
        testSemester.setEndDate(endDate);
        Assert.assertEquals("Sometime in May", testSemester.getEndDate());
    }


    @Test
    public void testSemesterConstructorNoParams() {
        Semester testSemesterNoConstructors = new Semester();
        Assert.assertEquals(Long.valueOf(0), testSemesterNoConstructors.getId());
        Assert.assertEquals("TBD", testSemesterNoConstructors.getSemesterName());
        Assert.assertEquals("TBD", testSemesterNoConstructors.getStartDate());
        Assert.assertEquals("TBD", testSemesterNoConstructors.getEndDate());
    }


    @Test
    public void testSemesterConstructorFiveParams() {
        String testSemesterName = "Fall 2017";
        String testStartDate = "I dunno' August?";
        String testEndDate = "December 16";

        Semester testSemesterFiveConstructors = new Semester(testSemesterName, testStartDate, testEndDate);
        Assert.assertEquals(Long.valueOf(0), testSemesterFiveConstructors.getId());
        Assert.assertEquals("Fall 2017", testSemesterFiveConstructors.getSemesterName());
        Assert.assertEquals("I dunno' August?", testSemesterFiveConstructors.getStartDate());
        Assert.assertEquals("December 16", testSemesterFiveConstructors.getEndDate());
    }


<<<<<<< HEAD
    @Test
    public void testSemesterConstructorSixParams() {
        String testSemesterName = "Fall 2017";
        String testStartDate = "I dunno' August?";
        String testEndDate = "December 16";

        Semester testSemesterSixConstructors = new Semester(testSemesterName, testStartDate, testEndDate);
        Assert.assertEquals("Fall 2017", testSemesterSixConstructors.getSemesterName());
        Assert.assertEquals("I dunno' August?", testSemesterSixConstructors.getStartDate());
        Assert.assertEquals("December 16", testSemesterSixConstructors.getEndDate());
    }

=======
>>>>>>> 843f4d81b10c3ec15d0f1375d02a136a1d15f9c4
}