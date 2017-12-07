//Course class, written by Eric Kearney and Thiengo Le
package com.msubanner.spring.msubannerspring.course;

import javax.persistence.*;

import com.msubanner.spring.msubannerspring.building.Building;

/**
 * This is the course class
 *
 * @author team 3
 */
@Entity
public class Course {

	/**
	 * variable id.
	 */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long courseId;

    /**
     * variable department.
     */
    private String courseDept = "TBD";

    /**
     * variable name.
     */
    private String courseName;

    /**
     * variable number.
     */
    private String courseNumber;

    /**
     * variable credit value.
     */
    private int creditValue;

    /**
     * variable level.
     */
    private String level;

    /**
     * variable description.
     */
    private String description;

    /**
     * variable learning obj.
     */
    private String learningObjectives;

    /**
     * one to one with building object.
     */
    @OneToOne
    @JoinColumn(name = "building_buildingName")
    private Building buildingObject;

    /**
     * This is the default constructor for the courses class that will.
     * take no inputed values and create a course.
     */
    public Course() {
        this.courseId = Long.valueOf(0);
        this.courseDept = "TBD";
        this.courseName = "TBD";
        this.courseNumber = "TBD";
        this.creditValue = 0;
        this.level = "Freshman";
        this.description = "TBD";
        this.learningObjectives = "TBD";
    }

    /**
     * This constructs a new course with all the specified variables.
     *
     * @param id           The Id number of the course, (e.g.) 3250 in CS 3250
     * @param dept         The department of the course, (e.g.) CS in CS 3250
     * @param name         The name of the course
     * @param number       The number of the course
     * @param value        How many credits the course is worth
     * @param courseLevel  (e.g.) Freshman, sophomore, etc.
     * @param desc         Tell prospects (students) what the course is about
     * @param learningObj  What students should learn by the end of the course
     */
    public Course(
            Long id,
            String dept,
            String name,
            String number,
            int value,
            String courseLevel,
            String desc,
            String learningObj) {

        this.courseId = id;
        this.courseDept = dept;
        this.courseName = name;
        this.courseNumber = number;
        this.creditValue = value;
        this.level = courseLevel;
        this.description = desc;
        this.learningObjectives = learningObj;
    }

    /**
     * getCourseDept will return the department that the course is for.
     *
     * @return courseDept a string of the department name
     */
    public String getCourseDept() {
        return courseDept;
    }

    /**
     * setCourseDept will set the department that the course is for.
     *
     * @param dept a string of the department name
     */
    public void setCourseDept(String dept) {
        this.courseDept = dept;
    }

    /**
     * getCourseId will return the unique id assigned to the course.
     *
     * @return couseId unique long value for the course
     */
    public Long getCourseId() {
        return courseId;
    }

    /**
     * setCourseId will set the unique id assigned to the course.
     *
     * @param id unique long value for the course
     */
    public void setCourseId(Long id) {
        this.courseId = id;
    }

    /**
     * getCourseName will return the name assigned to the course.
     *
     * @return the name of the selected course
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * setCourseName will change the name assigned to the course.
     *
     * @param name a string with the new name of the course
     */
    public void setCourseName(String name) {
        this.courseName = name;
    }

    /**
     * getCourseNumber will return the number assigned to the course.
     *
     * @return the number of the selected course
     */
    public String getCourseNumber() {
        return courseNumber;
    }

    /**
     * setCourseNumber will change the number assigned to the course.
     *
     * @param number a string with the new number of the course
     */
    public void setCourseNumber(String number) {
        this.courseNumber = number;
    }

    /**
     * getCreditValue will return the credit weight of the course.
     *
     * @return an integer with the credit hour weight of the course
     */
    public int getCreditValue() {
        return creditValue;
    }

    /**
     * setCreditValue will change the credit hour weighting of the course.
     *
     * @param value is an integer with the new credit hour weight of the course
     */
    public void setCreditValue(int value) {
        this.creditValue = value;
    }

    /**
     * getLevel will return the name of the year that the course is made for.
     * example freshman, sophmore, junior, senior
     *
     * @return a string with the name of the student year the course is for
     */
    public String getLevel() {
        return level;
    }

    /**
     * setLevel will change the course to a different year.
     * example freshman, sophmore, junior, senior
     *
     * @param courseLevel is a string of the new year level
     */
    public void setLevel(String courseLevel) {
        this.level = courseLevel;
    }

    /**
     * getDescription will return a brief description of the course purpose.
     *
     * @return a string listing the course purpose
     */
    public String getDescription() {
        return description;
    }

    /**
     * setDescription will change the description of a course.
     *
     * @param desc is a string with the new course description
     */
    public void setDescription(String desc) {
        this.description = desc;
    }

    /**
     * getLearningObjectives will return the objectives that the course will meet.
     * throughout the semester
     *
     * @return a string listing the objectives of the course
     */
    public String getLearningObjectives() {
        return learningObjectives;
    }

    /**
     * setLearningObjectives will change the objectives of the course.
     *
     * @param learningObj is a string listing the new learning objectives
     */
    public void setLearningObjectives(String learningObj) {
        this.learningObjectives = learningObj;
    }
}
