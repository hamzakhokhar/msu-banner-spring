package com.msubanner.spring.msubannerspring.semester;
import javax.persistence.*;
/**
 * Semester Persistence Class
 *
 * @author Jesus & Matt / team 3
 */

public class Semester {

    // testing commit real quick
	//@id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    private String semester;
    private Long startTime;
    private Long endTime;

    protected Semester(){};


    public Semester(Long startTime, Long endTime) {

        this.startTime = startTime;
        this.endTime = endTime;
    }


    public String getSemester() {
        return semester;
    }


    public void setSemester( String semester) {

        this.semester = semester;
    }


    public Long getStartTime() {

        return startTime;
    }


    public void setStartTime(Long startTime)
    {
        this.startTime = startTime;
    }


    public Long getEndTime() {
        return endTime;
    }


    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }
}


