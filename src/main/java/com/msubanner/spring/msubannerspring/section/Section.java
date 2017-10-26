package com.msubanner.spring.msubannerspring.section;

import javax.persistence.*;

import com.msubanner.spring.msubannerspring.professor.*;
import com.msubanner.spring.msubannerspring.course.*;
import org.springframework.data.rest.core.annotation.RestResource;

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
    private int numberOfSeats;
    private int sectionNumber;

    @OneToOne
    @JoinColumn(name = "professor_id")
    private Professor professor;

    @OneToOne
    @JoinColumn(name = "course_courseId")
    private Course course;


    /**
     * @param sectionNumber
     * @param professor
     * @param course
     */
    public Section(int sectionNumber, Professor professor, Course course) {
        this.course = course;
        this.professor = professor;
    }

    protected Section() {}


    /**
     * returns class variable course
     *
     * @return Course course
     */
    public Course getCourse() {
        return course;
    }

    /**
     * Assigns class variable course to parameter
     *
     * @param course
     */
    public void setCourse(Course course) {
        this.course = course;
    }

    /**
     * returns class variable professor
     *
     * @return Professor professor
     */
    public Professor getProfessor() {
        return professor;
    }

    /**
     * Assigns class variable professor to parameter
     *
     * @param professor
     */
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    /**
     * returns class variable id
     *
     * @return long id
     */
    public Long getId() {
        return id;
    }

    /**
     * Assigns class variable id to parameter
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    public int getNumberOfSeats() { return numberOfSeats; }

    /**
     * Assigns class variable Number of Seats to parameter
     *
     * @param numberOfSeats
     */
    public void setNumberOfSeats(int numberOfSeats) { this.numberOfSeats = numberOfSeats; }

    public int getSectionNumber() { return sectionNumber;  }

    public void setSectionNumber(int sectionNumber) { this.sectionNumber = sectionNumber; }

    @Override
    public String toString() {
        return super.toString();
    }
}
