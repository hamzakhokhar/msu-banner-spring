package com.msubanner.spring.msubannerspring.section;

import javax.persistence.*;

import com.msubanner.spring.msubannerspring.professor.*;
import com.msubanner.spring.msubannerspring.building.Building;
import com.msubanner.spring.msubannerspring.course.*;
import com.msubanner.spring.msubannerspring.room.*;
import com.msubanner.spring.msubannerspring.student.Student;
import org.springframework.data.rest.core.annotation.RestResource;
import java.util.ArrayList;
import java.util.List;

/**
 * Section Persistence Class
 *
 * @author Tarin / team 3
 */
@Entity
public class Section {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int sectionNumber = 0;
    private int roomNumber;
    // private int currentClassSize = 0;
    private String startTime;
    private String endTime;
    private String weekday = "TBD";
    private Long studentID;
    // private int[] currentEnrolledStudents = new int[30];
    // private ArrayList<Long> currentEnrolledStudents = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "professor_id")
    private Professor professor;

    @OneToOne
    @JoinColumn(name = "course_courseId")
    private Course course;

    @OneToOne
    @JoinColumn(name = "building_id")
    private Building building;
    
    //@OneToMany(fetch = FetchType.EAGER)
    //@JoinColumn(name = "student_id")
    //private Student students;

    /**
     * Default constructor for the section class
     * @param course is an existing course that the user is creating a section of
     * @param sectionNumber is the unique address of the new section
     * @param professor is the professor assigned to the course
     * @param building is the building that the course is being taught
     * @param roomNumber is the room that the course is being taught
     * @param startTime is the startTime that the course is being taught
     * @param weekday is the days of the week the course is being taught
     */
    public Section(Course course,
    		       int sectionNumber,
    		       Professor professor,
    		       Building building,
                   int roomNumber,
                   String startTime,
                   String endTime,
                   String weekday) {
        this.course = course;
        this.sectionNumber = sectionNumber;
        this.professor = professor;
        this.building = building;
        this.roomNumber = roomNumber;
        setStartTime(startTime);
        this.weekday = weekday;
    }
    
    public Section() {

    }

    /**
     * getBuilding will return the building that the course is taught in
     * @return the building that the course is taught
     */
    public Building getBuilding() {

        return building;
    }

    /**
     * setBuilding will change the course location to another builidng
     * @param building a string listing the new building name
     */
    public void setBuilding(Building building) {

        this.building = building;
    }

    /**
     * get room will return the room that the course is taught in
     * @return room a string of the room number that the course is taught
     */
    public int getRoomNumber() {

        return roomNumber;
    }

    /**
     * setRoom will change the room location of the course
     * @param roomNumber a string listing the room number
     */
    public void setRoomNumber(int roomNumber) {

        this.roomNumber = roomNumber;
    }

    /**
     * getStartTime will return the startTime that the course is taught at
     * @return the startTime that the course is taught
     */
    public String getStartTime() {

        return startTime;
    }

    /**
     * setStartTime will change the startTime that the course is taught
     * @param startTime as a string of the startTime the course is taught
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * getEndTime will return the startTime that the course is taught at
     * @return the endTime that the course is taught
     */
    public String getEndTime() {

        return endTime;
    }

    /**
     * setEndTime will change the endTime that the course is taught
     * @param endTime as a string of the endTime the course is taught
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * getWeekday will return the startTime that the course is taught at
     * @return the weekday that the course is taught
     */
    public String getWeekday() {
        return weekday;
    }

    /**
     * setWeekday will change the startTime that the course is taught
     * @param weekday as a string of the week days the course is taught
     */
    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }
    
    /**
     * returns class variable course
     * @return Course course
     */
    public Course getCourse() {
        return course;
    }
    
    /**
     * Assigns class variable course to parameter
     * @param course
     */
    public void setCourse(Course course) {

        this.course = course;
    }

    /**
     * returns class variable professor
     * @return Professor professor
     */
    public Professor getProfessor() {

        return professor;
    }
    
    /**
     * Assigns class variable professor to parameter
     * @param professor
     */
    public void setProfessor(Professor professor) {

        this.professor = professor;
    }

    /**
     * returns class variable id
     * @return long id
     */
    public Long getId() {

        return id;
    }
    
    /**
     * Assigns class variable id to parameter
     * @param id
     */
    public void setId(Long id) {

        this.id = id;
    }

    /**
     * returns section number
     * @return section number
     */
    public int getSectionNumber() {

        return sectionNumber;
    }
    
    /**
     * Assigns class variable section number to parameter
     * @param sectionNumber
     */
    public void setSectionNumber(int sectionNumber) {

        this.sectionNumber = sectionNumber;
    }


/*

    public boolean getEnrolledStudentID (Long studentID) {

        Long currentIndexValue = Long.valueOf(0);

        // For ArrayList
        for (int i = 0; i < currentEnrolledStudents.size(); i++)

            currentIndexValue = currentEnrolledStudents.get(i);

            if (studentID == currentIndexValue) {
                return false;
            }
        return true;
    }



    public void setEnrolledStudentID (Long studentID, boolean bCanEnroll) {

        this.studentID = studentID;
        bCanEnroll = getEnrolledStudentID(studentID);

        // FOr ArrayList
        if (bCanEnroll) {
            int i = currentEnrolledStudents.size()-1;
            currentEnrolledStudents.set(i, studentID);
            currentClassSize += 1;
        }
    }


    public void disEnrollStudent (int studentID) {

        Long currentIndexValue;

        // For ArrayList
        for (int i = 0; i < currentEnrolledStudents.size(); i++) { // run through array and check for student

            currentIndexValue = currentEnrolledStudents.get(i);

            if (studentID == currentIndexValue) {
                currentEnrolledStudents.remove(i); //Delete Index
                currentClassSize -= 1;
                break;
            }
        }
    }




    public int getStudentID(int studentID) {
        return studentID;
    }

    public void setStudentID() {
        this.studentID = studentID;
    }



    public boolean isOverlapping(Date startTime1, Date endTime1, Date startTime2, Date endTime2) {
    return startTime1.before(endTime2) && startTime2.before(endTime1);
}
    */
}
