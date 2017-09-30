package com.msubanner.spring.msubannerspring;

//import org.junit.After;
//import org.junit.Before;
import org.junit.Test;
import com.msubanner.spring.msubannerspring.section.Section;
import com.msubanner.spring.msubannerspring.professor.Professor;
import com.msubanner.spring.msubannerspring.course.Course;
import static org.junit.Assert.*;

public class SectionTest {


//    @Test
//    public void getSectionNumber() throws Exception {
//        Professor testProfessor = new Professor("North","West");
//        Course testCourse = new Course( 20,"CS", "Class",4,"Freshman",
//                                        "building","room","12:00",5,30,
//                                        "stuff","things");
//        Section testSection = new Section(1,testProfessor,testCourse);
//
//        assertTrue(testSection.getSectionNumber()==1);
//
//    }
//
//    @Test
//    public void setSectionNumber() throws Exception {
//        Professor testProfessor = new Professor("North","West");
//        Course testCourse = new Course( 20,"CS", "Class",4,"Freshman",
//                                        "building","room","12:00",5,30,
//                                        "stuff","things");
//        Section testSection = new Section(1,testProfessor,testCourse);
//
//        testSection.setSectionNumber(3);
//        assertTrue(testSection.getSectionNumber()==3);
//
//    }

//    @Test
//    public void getCourse() throws Exception {
//        Professor testProfessor = new Professor("North","West");
//        Course testCourse = new Course( 20,"CS", "Class",4,"Freshman",
//                "building","room","12:00",5,30,
//                "stuff","things");
//        Section testSection = new Section(1,testProfessor,testCourse);
//
//        assertTrue(testSection.getCourse() == testCourse);
//
//    }

//    @Test
//    public void setCourse() throws Exception {
//        Professor testProfessor = new Professor("North","West");
//        Course testCourse = new Course( 20,"CS", "Class",4,"Freshman",
//                "building","room","12:00",5,30,
//                "stuff","things");
//        Section testSection = new Section(1,testProfessor,testCourse);
//
//        assertTrue(testSection.getCourse() == testCourse);
//
//    }

//    @Test
//    public void getProfessor() throws Exception {
//        Professor testProfessor = new Professor("North","West");
//        Course testCourse = new Course( 20,"CS", "Class",4,"Freshman",
//                "building","room","12:00",5,30,
//                "stuff","things");
//        Section testSection = new Section(1,testProfessor,testCourse);
//
//        assertTrue(testSection.getProfessor() == testProfessor);
//
//    }

//    @Test
//    public void setProfessor() throws Exception {
//        Professor testProfessor = new Professor("North","West");
//        Course testCourse = new Course( 20,"CS", "Class",4,"Freshman",
//                "building","room","12:00",5,30,
//                "stuff","things");
//        Section testSection = new Section(1,testProfessor,testCourse);
//
//        assertTrue(testSection.getProfessor() == testProfessor);
//
//    }

    @Test
    public void getId() throws Exception {
        Professor testProfessor = new Professor("North","West");
        Course testCourse = new Course( 20,"CS", "Class",4,"Freshman",
                "building","room","12:00",5,30,
                "stuff","things");
        Section testSection = new Section(1,testProfessor,testCourse);

        assertTrue(testSection.getId() == testSection.getId());

    }

    @Test
    public void setId() throws Exception {
        Professor testProfessor = new Professor("North","West");
        Course testCourse = new Course( 20,"CS", "Class",4,"Freshman",
                "building","room","12:00",5,30,
                "stuff","things");
        Section testSection = new Section(1,testProfessor,testCourse);

        testSection.setId(0L);
        assertTrue(testSection.getId()==0L);

    }

    //WIP
    //@Test
    //public void toString() throws Exception {
    //}

}