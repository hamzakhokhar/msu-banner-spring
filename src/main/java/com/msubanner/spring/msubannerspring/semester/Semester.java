package com.msubanner.spring.msubannerspring.semester;
import javax.persistence.*;

/**
 * Semester Persistence Class
 * @author Jesus & Matt / team 3
 */
public class Semester {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String semester;
    private Long startDate;
    private Long endDate;

    //protected Semester(){};

    /**
     * Default constructor for semester object
     */
    public Semester() {
    	this.semester = "TBD";
    	this.startDate = Long.valueOf(0);
    	this.endDate = Long.valueOf(0);   	
    }
    
    /**
     * Default constructor for creating the semester object
     * @param startDate the first day of the semester
     * @param endDate the last day of the professor
     */
    public Semester(Long startDate, Long endDate) {
        this.semester = "TBD";
    	this.startDate = startDate;
        this.endDate = endDate;
    }
    
    /**
     * Default constructor for creating the semester object
     * @param semester the name of the semester
     * @param startDate the first day of the semester
     * @param endDate the last day of the professor
     */
    public Semester(String semester, Long startDate, Long endDate) {
        this.semester = semester;
    	this.startDate = startDate;
        this.endDate = endDate;
    }

    /**
     * Get command for the semester
     * @return the current semester
     */
    public String getSemester() {
        return semester;
    }

    /**
     * Set command for the semester
     * @param semester current semester object
     */
    public void setSemester( String semester) {
        this.semester = semester;
    }

    /**
     * Get command for the start date
     * @return start date of the semester
     */
    public Long getStartDate() {
        return startDate;
    }

    /**
     * Set command for the start date
     * @param startDate of the semester
     */
    public void setStartDate(Long startDate) {
        this.startDate = startDate;
    }

    /**
     * Get command for the end date
     * @return end date of the semester
     */
    public Long getEndDate() {
        return endDate;
    }

    /**
     * Set command for the end date
     * @param endDate of the semester
     */
    public void setEndDate(Long endDate) {
        this.endDate = endDate;
    }
}
