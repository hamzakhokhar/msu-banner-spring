package com.msubanner.spring.msubannerspring.course;

import javax.persistence.*;

import com.msubanner.spring.msubannerspring.student.Student;

//import java.util.ArrayList;
//import java.util.List;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long courseId;
    private String courseDept;
    private String courseName;
    private int creditValue;
    //private professor courseInstructor;
    //commented until we have professor built
    //private List<Course> preReqs = new ArrayList<Course>();
    //private List<Course> coReqs = new ArrayList<Course>();
    private String level; //freshman, soophomore, junior, or senior
    private String building;
    private String room;
    private String time;
    //TODO change this from string to a real time format
    private int minSize;
    private int maxSize;
//    private int currentSize; //how many students are currently enrolled in the class (curreently has no use)
    //private List<Long> enrolledStudents = new ArrayList<Long>(); //list of the Student Ids of students enrolled
    private String description;
    private String learningObjectives;


    public Course(){

    }

    /**
     * This constructs a new course with all the specified variables
     * @param courseId The Id number of the course, (e.g.) 3250 in CS 3250
     * @param courseDept The department of the course, (e.g.) CS in CS 3250
     * @param courseName The name of the course
     * @param creditValue How many credits the course is worth
     * @param level (e.g.) Freshman, sophomore, etc.
     * @param building The building the course is located in
     * @param room The room the course is located in
     * @param time The time the course takes place
     * @param minSize At least this many students need to enroll in the course
     * @param maxSize No more than this many students may enroll in the course
     * @param description Tell perspective students what the course is about
     * @param learningObjectives What students should learn by the end of the course
     */
    public Course(
            Long courseId,
            String courseDept,
            String courseName,
            int creditValue,
            String level,
            String building,
            String room,
            String time,
            int minSize,
            int maxSize,
            String description,
            String learningObjectives)
    {
        //TODO add professor to parameters once professor is built

        this.courseId = courseId;
        this.courseDept = courseDept;
        this.courseName = courseName;
        this.creditValue = creditValue;
        this.level = level;
        this.building = building;
        this.room = room;
        this.time = time;
        this.minSize = minSize;
        this.maxSize = maxSize;
//        this.currentSize = 0; //for use later
        this.description = description;
        this.learningObjectives = learningObjectives;
        //this.courseProfessor = professor
    }

    /*
    Use these for dealing with students later
    public void enrollStudent(Student student) {
    }
    public void withdrawStudent(Student student) {
    }
    public void findStudent(Student student) {
    }
    */

    public String getCourseDept() {
        return courseDept;
    }

    public void setCourseDept(String courseDept) {
        this.courseDept = courseDept;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        try {
            this.courseId = courseId;
        }
        catch (NumberFormatException e) {
            System.out.println("User tried to make an invalid entry to courseID");
        }
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCreditValue() {
        return creditValue;
    }

    public void setCreditValue(int creditValue) {
        this.creditValue = creditValue;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getMinSize() {
        return minSize;
    }

    public void setMinSize(int minSize) {
        this.minSize = minSize;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLearningObjectives() {
        return learningObjectives;
    }

    public void setLearningObjectives(String learningObjectives) {
        this.learningObjectives = learningObjectives;
    }
}
