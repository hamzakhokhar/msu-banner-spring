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
    public void testSemesterCourse() {
        Course testCourse = new Course();
        testSemester.setCourse(testCourse);
        Assert.assertEquals(testCourse, testSemester.getCourse());
    }

    @Test
    public void testSemesterSection() {
        Section testSection = new Section();
        testSemester.setSection(testSection);
        Assert.assertEquals(testSection, testSemester.getSection());
    }

    @Test
    public void testSemesterConstructorNoParams() {
        Semester testSemesterNoConstructors = new Semester();
        Assert.assertEquals(null, testSemesterNoConstructors.getSection());
        Assert.assertEquals(null, testSemesterNoConstructors.getCourse());
        Assert.assertEquals(Long.valueOf(0), testSemesterNoConstructors.getId());
        Assert.assertEquals("TBD", testSemesterNoConstructors.getSemesterName());
        Assert.assertEquals("TBD", testSemesterNoConstructors.getStartDate());
        Assert.assertEquals("TBD", testSemesterNoConstructors.getEndDate());
    }

    @Test
    public void testSemesterConstructorTwoParams(){
        Section testSection = new Section();
        Course testCourse = new Course();
        Semester testSemesterTwoConstructors = new Semester(testSection, testCourse);

        Assert.assertEquals(testSection, testSemesterTwoConstructors.getSection());
        Assert.assertEquals(testCourse, testSemesterTwoConstructors.getCourse());
        Assert.assertEquals(Long.valueOf(0), testSemesterTwoConstructors.getId());
        Assert.assertEquals("TBD", testSemesterTwoConstructors.getSemesterName());
        Assert.assertEquals("TBD", testSemesterTwoConstructors.getStartDate());
        Assert.assertEquals("TBD", testSemesterTwoConstructors.getEndDate());
    }

    @Test
    public void testSemesterConstructorFiveParams() {
        Section testSection = new Section();
        Course testCourse = new Course();
        String testSemesterName = "Fall 2017";
        String testStartDate = "I dunno' August?";
        String testEndDate = "December 16";

        Semester testSemesterFiveConstructors = new Semester(testSection, testCourse, testSemesterName, testStartDate, testEndDate);
        Assert.assertEquals(testSection, testSemesterFiveConstructors.getSection());
        Assert.assertEquals(testCourse, testSemesterFiveConstructors.getCourse());
        Assert.assertEquals(Long.valueOf(0), testSemesterFiveConstructors.getId());
        Assert.assertEquals("Fall 2017", testSemesterFiveConstructors.getSemesterName());
        Assert.assertEquals("I dunno' August?", testSemesterFiveConstructors.getStartDate());
        Assert.assertEquals("December 16", testSemesterFiveConstructors.getEndDate());
    }


    @Test
    public void testSemesterConstructorSixParams() {
        Section testSection = new Section();
        Course testCourse = new Course();
        Long testId = Long.valueOf(0451);
        String testSemesterName = "Fall 2017";
        String testStartDate = "I dunno' August?";
        String testEndDate = "December 16";

        Semester testSemesterSixConstructors = new Semester(testSection, testCourse, testId, testSemesterName, testStartDate, testEndDate);
        Assert.assertEquals(testSection, testSemesterSixConstructors.getSection());
        Assert.assertEquals(testCourse, testSemesterSixConstructors.getCourse());
        //I'm not sure why this test is failing, will look at it later
        Assert.assertEquals(Long.valueOf(0451), testSemesterSixConstructors.getId());
        Assert.assertEquals("Fall 2017", testSemesterSixConstructors.getSemesterName());
        Assert.assertEquals("I dunno' August?", testSemesterSixConstructors.getStartDate());
        Assert.assertEquals("December 16", testSemesterSixConstructors.getEndDate());
    }

}