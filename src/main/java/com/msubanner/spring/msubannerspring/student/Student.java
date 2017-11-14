package com.msubanner.spring.msubannerspring.student;
import javax.persistence.*;
import java.util.List;

/**
 * This is the Student class.
 * @author Team 3
 */
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;

    protected Student(){};

    /**
     * Default constructor for creating the student object
     * @param firstName the first name of the professor
     * @param lastName the last name of the professor
     */
    public Student(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Will return the first name listed in the student object
     * @return the first name of the student
     */
    public String getFirstName() {

        return firstName;
    }

    /**
     * Will set the first name in the student object
     * @param firstName set the firstName of the student
     */
    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    /**
     * Will return the last name listed in the student object
     * @return the last name of the student
     */
    public String getLastName() {

        return lastName;
    }

    /**
     * Will set the last name in the student object
     * @param lastName the last name of the student
     */
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    /**
     * Will return the id number listed in the student object
     * @return the id number of the student
     */
    public Long getId() {

        return id;
    }

    /**
     * Will set the id in the student object
     * @param id the new id of the student
     */
    public void setId(Long id) {

        this.id = id;
    }
}
