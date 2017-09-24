package com.msubanner.spring.msubannerspring;

import java.util.*;

public class Course {
    private int courseID;
    private String courseDept;
    private String courseName;
    private int creditValue;
    //private professor courseInstructor;
    //commented until we have professor built
    private List<Course> preReqs = new ArrayList<Course>();
    private List<Course> coReqs = new ArrayList<Course>();
    private String level;
    //freshman, soophomore, junior, or senior
    private String description;
    private String learningObjectives;
    private String building;
    private String room;
    private String time;
    //time can't actually be a String, TODO, change this later
    private int minSize;
    private int maxSize;

    protected Course(){};

    public Course(int courseID, String courseDept, String courseName, int creditValue, String level,
                    String building, String room, String time, int minSize, int maxSize,
                    String description, String learningObjectives) {
        //TODO add professor to parameters once professor is built
        this.courseID = courseID;
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

    public void addPreReq(Course preReq) {
        preReqs.add(preReq);
    }

    public void addCoReq(Course coReq) {
        coReqs.add(coReq);
    }

    public int getCourseID() {
        return courseID;
    }

    public String getCourseDept() {
        return courseDept;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCreditValue() {
        return creditValue;
    }

    public List<Course> getPreReqs() {
        return preReqs;
    }

    public List<Course> getCoReqs() {
        return coReqs;
    }

    public String getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }

    public String getLearningObjectives() {
        return learningObjectives;
    }

    public String getBuilding() {
        return building;
    }

    public String getRoom() {
        return room;
    }

    public String getTime() {
        return time;
    }

    public int getMinSize() {
        return minSize;
    }

    public int getMaxSize() {
        return maxSize;
    }
}
