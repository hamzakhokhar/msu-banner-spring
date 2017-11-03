package com.msubanner.spring.msubannerspring;

import com.msubanner.spring.msubannerspring.room.Room;
import com.msubanner.spring.msubannerspring.student.Student;
import org.junit.Test;
import com.msubanner.spring.msubannerspring.section.Section;
import com.msubanner.spring.msubannerspring.professor.Professor;
import com.msubanner.spring.msubannerspring.building.Building;
import com.msubanner.spring.msubannerspring.course.Course;
import static org.junit.Assert.*;

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
                "9:00 am");

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