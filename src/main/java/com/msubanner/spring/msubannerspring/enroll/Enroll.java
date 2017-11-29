package com.msubanner.spring.msubannerspring.enroll;

import com.msubanner.spring.msubannerspring.course.Course;
import com.msubanner.spring.msubannerspring.section.Section;
import com.msubanner.spring.msubannerspring.student.Student;

import javax.persistence.*;

/**
 * This is the Enroll class.
 *
 * @author Team 3
 */
@Entity
public class Enroll {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(name = "section_id")
    private Section section;

    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;


    /**
     * Default constructor for creating the enroll object
     */
    public Enroll(Section section, Student student) {

        this.section = section;
        this.student = student;
        this.id = Long.valueOf(0);
    }


    public Enroll() {
    }

    /**
     * Default constructor for creating the enroll with all three parameters,
     * which are, in order, first name, last name, and the enroll's unique
     * ID number
     *
     * @param Id        the enroll's unique ID number
     */
    public Enroll(long Id) {
        setId(Id);
    }


    /**
     * Will return the id number listed in the enroll object
     *
     * @return the id number of the enroll
     */
    public Long getId() {
        return id;
    }

    /**
     * Will set the id in the enroll object
     *
     * @param id the new id of the enroll
     */
    public void setId(Long id) {
        this.id = id;
    }


    /**
     * returns class variable section
     *
     * @return section section
     */
    public Section getSection() {
        return section;
    }

    /**
     * Assigns class variable section to parameter
     *
     * @param section
     */
    public void setSection(Section section) {
        this.section = section;
    }

    /**
     * returns class variable student
     *
     * @return student student
     */
    public Student getStudent() {
        return student;
    }

    /**
     * Assigns class variable student to parameter
     *
     * @param student
     */
    public void setStudent(Student student) {
        this.student = student;
    }

}
