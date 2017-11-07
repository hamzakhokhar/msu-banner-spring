package com.msubanner.spring.msubannerspring.section;

import javax.persistence.*;

import com.msubanner.spring.msubannerspring.professor.*;
import com.msubanner.spring.msubannerspring.building.Building;
import com.msubanner.spring.msubannerspring.course.*;
import com.msubanner.spring.msubannerspring.room.*;
import com.msubanner.spring.msubannerspring.student.Student;
import org.springframework.data.rest.core.annotation.RestResource;
import java.util.ArrayList;

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
    private String time;

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
     * @param room is the room that the course is being taught
     * @param time is the time that the course is being taught
     */
    public Section(Course course,
    		       int sectionNumber,
    		       Professor professor,
    		       Building building,
                   int roomNumber,
                   String time) {
        this.course = course;
        this.sectionNumber = sectionNumber;
        this.professor = professor;
        this.building = building;
        this.roomNumber = roomNumber;
    }
    
    protected Section() {}
    
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
     * @param room a string listing the room number
     */
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    /**
     * getTime will return the time that the course is taught at
     * @return the time that the course is taught
     */
    public String getTime() {
        return time;
    }

    /**
     * setTime will change the time that the course is taught
     * @param time as a string of the time the course is taught
     */
    public void setTime(String time) {
        this.time = time;
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
}
