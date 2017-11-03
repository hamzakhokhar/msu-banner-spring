package com.msubanner.spring.msubannerspring.course;

import com.msubanner.spring.msubannerspring.course.Course;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CourseTest {
    Course course = new Course();

    @Test
    /**
     * Tests the ability of the course object to set and get the department value
     */
    public void testCourseDept() {
        String Dept = "CS";
        course.setCourseDept(Dept);
        Assert.assertEquals("CS", course.getCourseDept());
    }

    /**
     * Tests the ability of the course objeect to set and get the Id value
     */
    @Test
    public void testCourseId() {
        Long Id = Long.valueOf(3250);
        course.setCourseId(Id);
        Assert.assertEquals(Long.valueOf(3250), course.getCourseId());
    }

    /**
     * Tests what happens if a null is passed into setCourseId
     */
    @Test(expected = java.lang.NumberFormatException.class)
    public void testCourseIDNull() {
        Long Id = Long.parseLong(null);
    }

    /**
     * Tests the ability to set and get the course name value
     */
    @Test
    public void testCourseName() {
        String name = "Software Dev. Methods & Tools";
        course.setCourseName(name);
        Assert.assertEquals("Software Dev. Methods & Tools", course.getCourseName());
    }

    /**
     * Tests the ability to set and get the course credit value
     */
    @Test
    public void testCreditValue() {
        int creditValue = 2;
        course.setCreditValue(creditValue);
        Assert.assertEquals(2, course.getCreditValue());
    }

    /**
     * Tests the ability to set and get the course level value
     */
    @Test
    public void testLevel() {
        String level = "Senior";
        course.setLevel(level);
        Assert.assertEquals("Senior", course.getLevel());
    }

    /**
     * Tests the ability to set and get the course description value
     */
    @Test
    public void testDescription() {
        String description = "Description here:";
        course.setDescription(description);
        Assert.assertEquals("Description here:", course.getDescription());
    }

    /**
     * Tests the ability to set and get the course learningObjectives value
     */
    @Test
    public void testLearningObjectives() {
        String learningObjectives = "Learning objectives here:";
        course.setLearningObjectives(learningObjectives);
        Assert.assertEquals("Learning objectives here:", course.getLearningObjectives());
    }

    /**
     * Tests the ability to create a new course from scratch, ensuring all the paramters are working correctly
     */
    @Test
    public void testCourse() {
        Long courseId = Long.valueOf(2400);
        String courseDept = "MTH";
        String courseName = "Calculus II";
        String courseNumber = "MTH-2410";
        int creditValue = 4;
        String level = "Junior";
        String description = "Calculus II is above Calculus I, but below Calculus III";
        String learningObjectices = "To learn some math";

        Course testCourse = new Course(courseId, courseDept, courseName, courseNumber, creditValue, level, description, learningObjectices);

        Assert.assertEquals(Long.valueOf(2400), testCourse.getCourseId());
        Assert.assertEquals("MTH", testCourse.getCourseDept());
        Assert.assertEquals("Calculus II", testCourse.getCourseName());
        Assert.assertEquals("MTH-2410", testCourse.getCourseNumber());
        Assert.assertEquals(4, testCourse.getCreditValue());
        Assert.assertEquals("Junior", testCourse.getLevel());
        Assert.assertEquals("Calculus II is above Calculus I, but below Calculus III", testCourse.getDescription());
        Assert.assertEquals("To learn some math", testCourse.getLearningObjectives());
    }
}