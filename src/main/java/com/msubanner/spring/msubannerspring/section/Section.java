package com.msubanner.spring.msubannerspring.section;
import javax.persistence.*;
import com.msubanner.spring.msubannerspring.professor.*;
import com.msubanner.spring.msubannerspring.course.*;

/**
 * Section Persistence Class
 * @author Tarin / team 3
 */
@Entity
public class Section {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int sectionNumber;

    // THIS IS NOT HOW RELATIONSHIP BETWEEN ENTITIES WORK,
    // THIS CODE IS NOT EVEN COMPILABLE
//    private Professor professor;
//    private Course course;


    /**
     * @param sectionNumber
     * @param professor
     * @param course
     */
    public Section(int sectionNumber, Professor professor, Course course){
        this.sectionNumber = sectionNumber;
//        this.course = course;
//        this.professor = professor;
    }

    protected Section(){

    }

    /**
     * returns class variable sectionNumber
     * @return int sectionNumber
     */
    public int getSectionNumber() {
        return sectionNumber;
    }

    /**
     * Assignes class variable sectionNumber to parameter
     * @param int sectionNumber
     */
    public void setSectionNumber(int sectionNumber) {
        this.sectionNumber = sectionNumber;
    }

    /**
     * returns class variable course
     * @return Course course
     */
//    public Course getCourse() {
//        return course;
//    }

    /**
     * Assignes class variable course to parameter
     * @param Course course
     */
//    public void setCourse(Course course) {
//        this.course = course;
//    }

    /**
     * returns class variable professor
     * @return Professor professor
     */
//    public Professor getProfessor() {
//        return professor;
//    }

    /**
     * Assignes class variable professor to parameter
     * @param Professor professor
     */
//    public void setProfessor(Professor professor) {
//        this.professor = professor;
//    }

    /**
     * returns class variable id
     * @return long id
     */
    public Long getId() {
        return id;
    }

    /**
     * Assignes class variable id to parameter
     * @param long id
     */
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        //WIP waiting for Professor and Courses classes
        return super.toString();
    }
}
