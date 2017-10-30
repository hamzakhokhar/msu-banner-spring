package com.msubanner.spring.msubannerspring.section;

import javax.persistence.*;

import com.msubanner.spring.msubannerspring.professor.*;
import com.msubanner.spring.msubannerspring.course.*;
import com.msubanner.spring.msubannerspring.room.*;
import com.msubanner.spring.msubannerspring.student.Student;
import org.springframework.data.rest.core.annotation.RestResource;
import java.util.ArrayList;

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
    private int numberOfSeats = 10;
    private int filledSeats = 0;
    private int sectionNumber = 0;
    private int startTimeHour = 0;      //minimum possible hour   mod 24
    private int startTimeMinute = 0;    //minimum possible minute mod 60
    private int endTimeHour = 23;       //maximum possible hour   mod 24
    private int endTimeMinute = 59;     //maximum possible minute mod 60

    @OneToOne
    @JoinColumn(name = "professor_id")
    private Professor professor;

    @OneToOne
    @JoinColumn(name = "course_courseId")
    private Course course;

    @OneToOne
    @JoinColumn(name = "room_id")
    private Room room;
    /*
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "student_id")
    private Student students;
    */


    //////////////////////////////////////////////////CONSTRUCTORS
    /**
     * @param sectionNumber
     * @param professor
     * @param course
     */
    public Section(int sectionNumber, Professor professor,
                   Course course    , Room room          ,
                   int startTimeHour, int startTimeMinute,
                   int endTimeHour  , int endTimeMinute  ) {
        setRoom(room);
        setStartTimeHour(startTimeHour);
        setStartTimeMinute(startTimeMinute);
        setEndTimeHour(endTimeHour);
        setEndTimeMinute(endTimeMinute);
        this.course = course;
        this.professor = professor;
        this.sectionNumber = sectionNumber;
    }
    protected Section() {}
    //////////////////////////////////////////////////END CONSTRUCTORS



    @Override
    public String toString() {
        return super.toString();
    }



    //////////////////////////////////////////////////GETTERS AND SETTERS
    public Room getRoom() {
        return room;
    }
    public void setRoom(Room room) {
        this.room = room;
        this.numberOfSeats = this.room.getSeatsInRoom();
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
     * returns class variable professor
     * @return Professor professor
     */
    public Professor getProfessor() {
        return professor;
    }
    /**
     * Assigns class variable professor to parameter
     * @param professor
     */
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }





    /**
     * returns class variable id
     * @return long id
     */
    public Long getId() {
        return id;
    }
    /**
     * Assigns class variable id to parameter
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }




    public int getStartTimeHour() {
        return startTimeHour;
    }
    public void setStartTimeHour(int startTimeHour) {
        int newStartTimeHour = startTimeHour%24;
        if(newStartTimeHour < this.endTimeHour ||
                (newStartTimeHour == this.endTimeHour && this.startTimeMinute < this.endTimeMinute)){
            this.startTimeHour = newStartTimeHour;
        }
    }




    public int getStartTimeMinute() {
        return startTimeMinute;
    }
    public void setStartTimeMinute(int startTimeMinute) {
        int newStartTimeMinute = startTimeMinute%60;
        if(this.startTimeHour < this.endTimeHour ||
                (this.startTimeHour == this.endTimeHour && newStartTimeMinute < this.endTimeMinute)){
            this.startTimeMinute = newStartTimeMinute;
        }
    }




    public int getEndTimeHour() {
        return endTimeHour;
    }
    public void setEndTimeHour(int endTimeHour) {
        int newEndTimeHour = endTimeHour%24;
        if(this.startTimeHour < newEndTimeHour ||
                (this.startTimeHour == newEndTimeHour && this.startTimeMinute < this.endTimeMinute)){
            this.endTimeHour = newEndTimeHour;
        }
    }




    public int getEndTimeMinute() {
        return endTimeMinute;
    }
    public void setEndTimeMinute(int endTimeMinute) {
        int newEndTimeMinute = endTimeMinute%60;
        if(this.startTimeHour < this.endTimeHour ||
                (this.startTimeHour == this.endTimeHour && this.startTimeMinute < newEndTimeMinute)){
            this.endTimeMinute = newEndTimeMinute;
        }
    }




    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public int getFilledSeats() {
        return filledSeats;
    }

    public int getSectionNumber() {
        return sectionNumber;
    }
    public void setSectionNumber(int sectionNumber) {
        this.sectionNumber = sectionNumber;
    }
    //////////////////////////////////////////////////END GETTERS AND SETTERS




}
