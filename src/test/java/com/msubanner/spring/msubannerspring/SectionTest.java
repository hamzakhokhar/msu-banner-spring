//Section test originally written by Tarin Horne, re-written by Eric Kearney
package com.msubanner.spring.msubannerspring;

import com.msubanner.spring.msubannerspring.room.Room;
import com.msubanner.spring.msubannerspring.student.Student;
import org.junit.Assert;
import org.junit.Test;
import com.msubanner.spring.msubannerspring.section.Section;
import com.msubanner.spring.msubannerspring.professor.Professor;
import com.msubanner.spring.msubannerspring.building.Building;
import com.msubanner.spring.msubannerspring.course.Course;
import static org.junit.Assert.*;


public class SectionTest{
    Section testSection = new Section();

    /**
     * Tests the section's ability to get and set the building field
     */
    @Test
    public void testSectionGetAndSetBuilding(){
        Building testBuilding = new Building();
        testSection.setBuilding(testBuilding);
        Assert.assertEquals(testBuilding, testSection.getBuilding());
    }

    /**
     * Tests the section's ability to get and set the room number field
     */
    @Test
    public void testSectionGetAndSetRoomNumber(){
        int testRoomNumber = 42;
        testSection.setRoomNumber(testRoomNumber);
        Assert.assertEquals(42, testSection.getRoomNumber());
    }

    /**
     * Tests the section's ability to get and set the startTime field
     */
    @Test
    public void testSectionGetAndSetStartTime(){
        String testTime = "5:00pm";
        testSection.setStartTime(testTime);
        Assert.assertEquals("5:00pm", testSection.getStartTime());
    }

    /**
     * Tests the section's ability to get and set the endTime field
     */
    @Test
    public void testSectionGetAndSetEndTime(){
        String testTime = "5:00pm";
        testSection.setEndTime(testTime);
        Assert.assertEquals("5:00pm", testSection.getEndTime());
    }

    /**
     * Tests the section's ability to get and set the weekday field
     */
    @Test
    public void testSectionGetAndSetWeekday(){
        String testWeekday = "Monday";
        testSection.setWeekday(testWeekday);
        Assert.assertEquals("Monday", testSection.getWeekday());
    }

    /**
     * Tests the section's ability to get and set the course field
     */
    @Test
    public void testSectionGetAndSetCourse(){
        Course testCourse = new Course();
        testSection.setCourse(testCourse);
        Assert.assertEquals(testCourse, testSection.getCourse());
    }

    /**
     * Tests the section's ability to get and set the professor field
     */
    @Test
    public void testSectionGetAndSetProfessor(){
        Professor testProfessor = new Professor();
        testSection.setProfessor(testProfessor);
        Assert.assertEquals(testProfessor, testSection.getProfessor());
    }

    /**
     * Tests the section's ability to get and set the id field
     */
    @Test
    public void testSectionGetAndSetId(){
        Long testId = Long.valueOf(0452);
        testSection.setId(testId);
        Assert.assertEquals(Long.valueOf(0452), testSection.getId());
    }



    /**
     * Tests the ability to construct a new section, when all the parameters are filled.
     * Those parameters, in order, are: the course being taught, the section's number,
     * the professor teaching the course, the building the section is being taught in,
     * the number of the room the section is being taught in, the time the section
     * is being taught, and the days of the week the section is being taught
     */
    @Test
    public void testSectionConstructorAllParams(){
        Course testCourse = new Course();
        int testSectionNumber = 6;
        Professor testProfessor = new Professor();
        Building testBuilding = new Building();
        int testRoomNumber = 13;
        String testStartTime = "10:00am";
        String testEndTime = "10:00am";
        String testWeekday = "T/Thu";

        Section testSectionConstructor = new Section(testCourse,
                                                    testProfessor,
                                                    testBuilding,
                                                    testRoomNumber,
                                                    testStartTime,
                                                    testEndTime,
                                                    testWeekday);

        Assert.assertEquals(testCourse, testSectionConstructor.getCourse());
        Assert.assertEquals(testProfessor, testSectionConstructor.getProfessor());
        Assert.assertEquals(testBuilding, testSectionConstructor.getBuilding());
        Assert.assertEquals(13, testSectionConstructor.getRoomNumber());
        Assert.assertEquals("10:00am", testSectionConstructor.getStartTime());
        Assert.assertEquals("10:00am", testSectionConstructor.getStartTime());
        Assert.assertEquals("T/Thu", testSectionConstructor.getWeekday());
    }
}

/*
public class SectionTest {
    Professor testProfessor = new Professor("FirstName","LastName");
    Building testBuilding = new Building("Sample", 20);
    Course testCourse = new Course( Long.valueOf(20),
                "CS",
                "Class",
                "CS3250",
                4,
                "Freshman",
                "stuff",
                "things");
    Student testStudent1 = new Student("FirstName1","LastName1");
    Student testStudent2 = new Student("FirstName2","LastName2");
    Student testStudent3 = new Student("FirstName3","LastName3");
    Section testSection = new Section(testCourse,
    		    1,
                testProfessor,
                testBuilding,
                1010,
                "9:00 am",
                "Tuesday Thursday");

    @Test
    public void Section() throws Exception {
        Section constructorTest = testSection;
        assertTrue(constructorTest != null);
    }

    @Test
    public void getRoom() throws Exception {
        Section testGetRoom = testSection;
        assertTrue(testGetRoom.getRoomNumber() == 1010);

    }

    @Test
    public void getCourse() throws Exception {
        Section testGetCourse = testSection;
        assertTrue(testGetCourse.getCourse() == testCourse);
    }

    @Test
    public void setCourse() throws Exception {
        Section testSetCourse = testSection;
        testSetCourse.setCourse(testCourse);
        assertTrue(testSetCourse.getCourse() == testCourse);
    }

    @Test
    public void getProfessor() throws Exception {
        Section testGetProfessor = testSection;
        assertTrue(testGetProfessor.getProfessor() == testProfessor);
    }

    @Test
    public void setProfessor() throws Exception {
        Section testSetProfessor = testSection;
        testSetProfessor.setProfessor(testProfessor);
        assertTrue(testSetProfessor.getProfessor() == testProfessor);
    }

    @Test
    public void getId() throws Exception {
        Section testGetID = testSection;
        assertTrue(testGetID.getId() == testSection.getId());
    }

    @Test
    public void setId() throws Exception {
        Section testSetID = testSection;
        testSetID.setId(12345L);
        assertTrue(testSetID.getId() == 12345L);
    }

    @Test
    public void getSectionNumber() throws Exception {
        Section testGetSectionNumber = testSection;
        assertTrue(testGetSectionNumber.getSectionNumber() == 1);
    }

    @Test
    public void setSectionNumber() throws Exception {
        Section testSetSectionNumber = testSection;
        testSetSectionNumber.setSectionNumber(2);
        assertTrue(testSetSectionNumber.getSectionNumber() == 2);
    }


}
*/