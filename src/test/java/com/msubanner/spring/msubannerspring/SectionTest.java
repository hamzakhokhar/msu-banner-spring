package com.msubanner.spring.msubannerspring;

import com.msubanner.spring.msubannerspring.room.Room;
import com.msubanner.spring.msubannerspring.student.Student;
import org.junit.Test;
import com.msubanner.spring.msubannerspring.section.Section;
import com.msubanner.spring.msubannerspring.professor.Professor;
import com.msubanner.spring.msubannerspring.course.Course;
import static org.junit.Assert.*;

public class SectionTest {
    Professor testProfessor = new Professor("FirstName","LastName");
    Course testCourse = new Course( Long.valueOf(20),
                "CS",
                "Class",
                4,
                "Freshman",
                "building",
                "room",
                "12:00",
                5,
                30,
                "stuff",
                "things");
    Room testRoom = new Room(1011,3,101L);
    Student testStudent1 = new Student("FirstName1","LastName1");
    Student testStudent2 = new Student("FirstName2","LastName2");
    Student testStudent3 = new Student("FirstName3","LastName3");
    Section testSection = new Section(1,
                testProfessor,
                testCourse,
                testRoom,
                0,
                0,
                23,
                59);

    @Test
    public void Section() throws Exception {
        Section constructorTest = testSection;
        assertTrue(constructorTest != null);
    }

    @Test
    public void getRoom() throws Exception {
        Section testGetRoom = testSection;
        assertTrue(testGetRoom.getRoom() == testRoom);

    }

    @Test
    public void setRoom() throws Exception {
        Section testSetRoom = testSection;
        testSetRoom.setRoom(testRoom);
        assertTrue(testSetRoom.getRoom() == testRoom);
        assertTrue(testSetRoom.getNumberOfSeats() == testRoom.getSeatsInRoom());
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
    public void getStartTimeHour() throws Exception {
        Section startTimeHour = testSection;
        assertTrue(startTimeHour.getStartTimeHour() == 0);
    }

    @Test
    public void setStartTimeHour() throws Exception {
        Section startTimeHour = testSection;
        assertTrue(startTimeHour.getStartTimeHour() == 0);

        startTimeHour.setStartTimeHour(99);
        assertTrue(startTimeHour.getStartTimeHour() == 99%24);
    }

    @Test
    public void getStartTimeMinute() throws Exception {
        Section startTimeMinute = testSection;
        assertTrue(startTimeMinute.getStartTimeMinute() == 0);
    }

    @Test
    public void setStartTimeMinute() throws Exception {
        Section startTimeMinute = testSection;
        assertTrue(startTimeMinute.getStartTimeMinute() == 0);

        startTimeMinute.setStartTimeMinute(99);
        assertTrue(startTimeMinute.getStartTimeMinute() == 99%60);
    }

    @Test
    public void getEndTimeHour() throws Exception {
        Section endTimeHour = testSection;
        assertTrue(endTimeHour.getEndTimeHour() == 23);
    }

    @Test
    public void setEndTimeHour() throws Exception {
        Section endTimeHour = testSection;
        assertTrue(endTimeHour.getEndTimeHour() == 23);

        endTimeHour.setEndTimeHour(99);
        assertTrue(endTimeHour.getEndTimeHour() == 99%24);
    }

    @Test
    public void getEndTimeMinute() throws Exception {
        Section endTimeMinute = testSection;
        assertTrue(endTimeMinute.getEndTimeMinute() == 59);
    }

    @Test
    public void setEndTimeMinute() throws Exception {
        Section endTimeMinute = testSection;
        assertTrue(endTimeMinute.getEndTimeMinute() == 59);

        endTimeMinute.setEndTimeMinute(99);
        assertTrue(endTimeMinute.getEndTimeMinute() == 99%60);
    }

    @Test
    public void getNumberOfSeats() throws Exception {
        Section testGetRoom = testSection;
        assertTrue(testGetRoom.getRoom() == testRoom);
        assertTrue(testGetRoom.getNumberOfSeats() == 3);
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