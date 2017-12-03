//The tests for the Schedule class, written by Eric Kearney on 2, December 2017
package com.msubanner.spring.msubannerspring.schedule;

import org.junit.Test;
import org.junit.Assert;

import com.msubanner.spring.msubannerspring.course.Course;
import com.msubanner.spring.msubannerspring.section.Section;
import com.msubanner.spring.msubannerspring.student.Student;

public class ScheduleTest {
    Schedule testSchedule = new Schedule();

    @Test
    /**
     * Tests the Schedule class's ability to get and set the Id field
     */
    public void testGetAndSetID() {
        long testId = 53l;
        testSchedule.setId(testId);
        Assert.assertEquals(Long.valueOf(53l), testSchedule.getId());
    }

    @Test
    /**
     * Tests the Schedule class's ability to get and set the Section field
     */
    public void testGetAndSetSection(){
        Section testSection = new Section();
        testSchedule.setSection(testSection);
        Assert.assertEquals(testSection, testSchedule.getSection());
    }

    @Test
    /**
     * Tests the Schedule class's ability to get and set the Student field
     */
    public void testSetAndGetStudent(){
        Student testStudent = new Student();
        testSchedule.setStudent(testStudent);
        Assert.assertEquals(testStudent, testSchedule.getStudent());
    }

    @Test
    /**
     * Tests the default constructor of the Schedule object when passed no arguments
     */
    public void testConstructorNoParams(){
        Schedule testScheduleNoParams = new Schedule();
        Assert.assertEquals(Long.valueOf(-9999l), testScheduleNoParams.getId());
    }

    @Test
    /**
     * Tests the contructor of the Schedule object when passed on argument
     * That one argument will be the section's unique Id number
     */
    public void testConstructorOneParam(){
        long testId = 99l;
        Schedule testScheduleOneParam = new Schedule(testId);
        Assert.assertEquals(Long.valueOf(99l), testScheduleOneParam.getId());
    }

    @Test
    /**
     * Tests the default constructor of the Schedule object when passed two arguments
     * First argument: The Section on the Schedule
     * Second argument: The student enrolled in the section
     * Id will default to -9999 when not set by the user
     */
    public void testConstructorTwoParams(){
        Section testSection = new Section();
        Student testStudent = new Student();

        Schedule testScheduleTwoParams = new Schedule(testSection, testStudent);
        Assert.assertEquals(testSection, testScheduleTwoParams.getSection());
        Assert.assertEquals(testStudent, testScheduleTwoParams.getStudent());
        Assert.assertEquals(Long.valueOf(-9999l), testScheduleTwoParams.getId());
    }

    @Test
    /**
     * Tests the default constructor of the Schedule object when passed three arguments
     * First argument: The Section on the Schedule
     * Second argument: The student enrolled in the section
     * Third argument: Thee unique Schedule Id number set by the user
     */
    public void testConstructorThreeParams(){
        Section testSection = new Section();
        Student testStudent = new Student();
        Long testId = 54l;

        Schedule testScheduleThreeParams = new Schedule(testSection, testStudent, testId);
        Assert.assertEquals(testSection, testScheduleThreeParams.getSection());
        Assert.assertEquals(testStudent, testScheduleThreeParams.getStudent());
        Assert.assertEquals(Long.valueOf(54l), testScheduleThreeParams.getId());
    }
}