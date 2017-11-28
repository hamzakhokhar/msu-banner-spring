package com.msubanner.spring.msubannerspring.enroll;

import com.msubanner.spring.msubannerspring.course.Course;
import com.msubanner.spring.msubannerspring.section.Section;
import com.msubanner.spring.msubannerspring.student.Student;

import javax.persistence.*;

/**
     * This is the Enroll class.
     * @author Team 3
     */
    @Entity
    public class Enroll {

        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        private Long id;
        private Long studentId;
        private String firstName;
        private String lastName;


        @OneToOne
        @JoinColumn(name = "section_id")
        private Section section;

        @OneToOne
        @JoinColumn(name = "course_courseId")
        private Course course;

        @OneToOne
        @JoinColumn(name = "student_studentID")
        private Student student;


    /**
         * Default constructor for creating the enroll object
         */
        public Enroll(Section section, Course course, Student student) {

            this.section = section;
            this.course = course;
            this.student = student;
            this.studentId = student.getId();
            this.firstName = "DEFAULT";
            this.lastName = "DEFAULT";
            this.id = Long.valueOf(0);
        }


        /**
         * Default constructor for creating the enroll object
         * @param firstName the first name of the enroll
         * @param lastName the last name of the enroll
         */
        public Enroll(String firstName, String lastName) {

            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Enroll() {}

        /**
         * Default constructor for creating the enroll with all three parameters,
         * which are, in order, first name, last name, and the enroll's unique
         * ID number
         * @param firstName the first name of the enroll
         * @param lastName the last name of the enroll
         * @param Id the enroll's unique ID number
         */
        public Enroll(String firstName, String lastName, long Id) {

            setFirstName(firstName);
            setLastName(lastName);
            setId(Id);
        }

        /**
         * Will return the first name listed in the enroll object
         * @return the first name of the enroll
         */
        public String getFirstName() {

            return firstName;
        }

        /**
         * Will set the first name in the enroll object
         * @param firstName set the firstName of the enroll
         */
        public void setFirstName(String firstName) {

            this.firstName = firstName;
        }

        /**
         * Will return the last name listed in the enroll object
         * @return the last name of the enroll
         */
        public String getLastName() {

            return lastName;
        }

        /**
         * Will set the last name in the enroll object
         * @param lastName the last name of the enroll
         */
        public void setLastName(String lastName) {

            this.lastName = lastName;
        }

        /**
         * Will return the id number listed in the enroll object
         * @return the id number of the enroll
         */
        public Long getId() {

            return id;
        }

        /**
         * Will set the id in the enroll object
         * @param id the new id of the enroll
         */
        public void setId(Long id) {

            this.id = id;
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
         * returns class variable section
         * @return section section
         */
        public Section getSection() {

            return section;
        }

        /**
         * Assigns class variable section to parameter
         * @param section
         */
        public void setSection(Section section) {

            this.section = section;
        }

        /**
         * returns class variable student
         * @return student student
         */
        public Student getStudent() {

            return student;
        }

        /**
         * Assigns class variable student to parameter
         * @param student
         */
        public void setStudent(Student student) {

            this.student = student;
        }

        /**
         * returns Long variable studentId
         * @return student studentId
         */
        public Long getStudentId() {

            return studentId;
        }


        /**
         * Assigns Long variable studentId to parameter
         * @param studentId
         */
        public void setStudentId(Long studentId) {

            this.studentId = studentId;
        }
    }
