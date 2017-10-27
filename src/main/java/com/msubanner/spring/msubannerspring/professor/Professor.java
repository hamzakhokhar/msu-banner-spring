package com.msubanner.spring.msubannerspring.professor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * This is the Professor class.
 * @author Team 3
 */
@Entity
public class Professor {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;

    //protected Professor() {};

    public Professor(){
        this.firstName = "DEFAULT";
        this.lastName = "DEFAULT";
        this.id = Long.valueOf(0);
    }

    /**
     * Default constructor for creating the professor object
     * @param firstName the first name of the professor
     * @param lastName the last name of the professor
     */
    public Professor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Default constructor for creating the professor with all three parameters,
     * which are, in order, first name, last name, and the professor's unique
     * ID number
     * @param firstName the first name of the professor
     * @param lastName the last name of the professor
     * @param Id the professor's unique ID number
     */
    public Professor(String firstName, String lastName, long Id) {
        setFirstName(firstName);
        setLastName(lastName);
        setId(Id);
    }

    /**
     * Will return the first name listed in the professor object
     * @return the first name of the professor
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Will set the first name in the professor object
     * @param firstName set the firstName of the professor
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Will return the last name listed in the professor object
     * @return the last name of the professor
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Will set the last name in the professor object
     * @param lastName the last name of the professor
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Will return the id number listed in the professor object
     * @return the id number of the professor
     */
    public Long getId() {
        return id;
    }

    /**
     * Will set the id in the professor object
     * @param id the new id of the professor
     */
    public void setId(Long id) {
        this.id = id;
    }
}
