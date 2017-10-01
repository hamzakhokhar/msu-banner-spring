package com.msubanner.spring.msubannerspring;

import com.msubanner.spring.msubannerspring.course.Course;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CourseTest {
    Course course = new Course();

    @Test
    public void testCourseDept() {
        String Dept = "CS";
        course.setCourseDept(Dept);
        Assert.assertEquals("CS", course.getCourseDept());
    }

    @Test
    public void testCourseId() {
        Long Id = Long.valueOf(3250);
        course.setCourseId(Id);
        Assert.assertEquals(Long.valueOf(3250), course.getCourseId());
    }

    @Test(expected = java.lang.NumberFormatException.class)
    public void testCourseIdNull() {
        Long Id = Long.parseLong(null);
    }

    @Test
    public void testCourseName() {
        String name = "Software Dev. Methods & Tools";
        course.setCourseName(name);
        Assert.assertEquals("Software Dev. Methods & Tools", course.getCourseName());
    }

    @Test
    public void testCreditValue() {
        int creditValue = 2;
        course.setCreditValue(creditValue);
        Assert.assertEquals(2, course.getCreditValue());
    }

    @Test
    public void testLevel() {
        String level = "Senior";
        course.setLevel(level);
        Assert.assertEquals("Senior", course.getLevel());
    }

    @Test
    public void testBuilding() {
        String building = "Science building";
        course.setBuilding(building);
        Assert.assertEquals("Science building", course.getBuilding());
    }

    @Test
    public void testRoom() {
        String room = "190B";
        course.setRoom(room);
        Assert.assertEquals("190B", course.getRoom());
    }

    @Test
    public void testTime() {
        String time = "10:00am";
        //TODO change from string to a real time format
        course.setTime(time);
        Assert.assertEquals("10:00am", course.getTime());
    }

    @Test
    public void testMinSize() {
        int minSize = 1;
        course.setMinSize(minSize);
        Assert.assertEquals(1, course.getMinSize());
    }

    @Test
    public void testMaxSize() {
        int maxSize = 40;
        course.setMaxSize(maxSize);
        Assert.assertEquals(40, course.getMaxSize());
    }

    @Test
    public void testDescription() {
        String description = "Description here:";
        course.setDescription(description);
        Assert.assertEquals("Description here:", course.getDescription());
    }

    @Test
    public void testLearningObjectives() {
        String learningObjectives = "Learning objectives here:";
        course.setLearningObjectives(learningObjectives);
        Assert.assertEquals("Learning objectives here:", course.getLearningObjectives());
    }

    @Test
    public void testCourse() {
        Long courseId = Long.valueOf(2400);
        String courseDept = "MTH";
        String courseName = "Calculus II";
        int creditValue = 4;
        String level = "Junior";
        String building = "Plaza";
        String room = "300A";
        String time = "6:00pm - 7:50pm";
        //TODO time un-fuck
        int minSize = 5;
        int maxSize = 25;
        String description = "Calculus II is above Calculus I, but below Calculus III";
        String learningObjectices = "To learn some math bitches";

        course.setCourseId(courseId);
        course.setCourseDept(courseDept);
        course.setCourseName(courseName);
        course.setCreditValue(creditValue);
        course.setLevel(level);
        course.setBuilding(building);
        course.setRoom(room);
        course.setTime(time);
        course.setMinSize(minSize);
        course.setMaxSize(maxSize);
        course.setDescription(description);
        course.setLearningObjectives(learningObjectices);

        Assert.assertEquals(Long.valueOf(2400), course.getCourseId());
        Assert.assertEquals("MTH", course.getCourseDept());
        Assert.assertEquals("Calculus II", course.getCourseName());
        Assert.assertEquals(4, course.getCreditValue());
        Assert.assertEquals("Junior", course.getLevel());
        Assert.assertEquals("Plaza", course.getBuilding());
        Assert.assertEquals("300A", course.getRoom());
        Assert.assertEquals("6:00pm - 7:50pm", course.getTime());
        Assert.assertEquals(5, course.getMinSize());
        Assert.assertEquals(25, course.getMaxSize());
        Assert.assertEquals("Calculus II is above Calculus I, but below Calculus III", course.getDescription());
        Assert.assertEquals("To learn some math bitches", course.getLearningObjectives());
    }
}