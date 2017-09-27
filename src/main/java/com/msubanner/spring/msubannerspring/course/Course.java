package com.msubanner.spring.msubannerspring.course;

import javax.persistence.*;

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
//    private List<Course> preReqs = new ArrayList<Course>();
//    private List<Course> coReqs = new ArrayList<Course>();
    //freshman, soophomore, junior, or senior
    private String level;
    private String building;
    private String room;
    private String time;
    private int minSize;
    private int maxSize;
    private String description;
    private String learningObjectives;


    protected Course(){};

    public Course(
            long courseId,
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
            String learningObjectives
    ) {
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
        this.description = description;
        this.learningObjectives = learningObjectives;
        //this.professor = professor
    }

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
        this.courseId = courseId;
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
