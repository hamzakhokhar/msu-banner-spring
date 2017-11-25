package com.msubanner.spring.msubannerspring.enroll;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

    /**
     * This is the Enroll class.
     * @author Team 3
     */
    @Entity
    public class Enroll {

        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        private Long id;
        private String firstName;
        private String lastName;

        //protected Enroll() {};

        /**
         * Default constructor for creating the enroll object
         */
        public Enroll(){
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
    }
