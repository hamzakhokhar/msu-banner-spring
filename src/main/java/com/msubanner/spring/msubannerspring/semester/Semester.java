package com.msubanner.spring.msubannerspring.semester;
import javax.persistence.*;

import com.msubanner.spring.msubannerspring.section.Section;

/**
 * Semester Persistence Class
 * @author Jesus & Matt / team 3
 */
@Entity
public class Semester {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private String section;
	private Long id;
    private String semester;
    private Long startDate;
    private Long endDate;

    //@OneToMany
    //@JoinColumn(name = "section_id")
    //private Section section;
    
    //protected Semester(){};

    /**
     * Default constructor for semester object
     */
    public Semester() {
    	this.section = null;
    	this.id = Long.valueOf(0);
    	this.semester = "TBD";
    	this.startDate = Long.valueOf(0);
    	this.endDate = Long.valueOf(0);   	
    }
    
    /**
     * Default constructor for creating the semester object
     * @param section the section to be added to the semester
     */
    public Semester(Section section) {
    	//this.section = section;
    	this.id = Long.valueOf(0);
        this.semester = "TBD";
    	this.startDate = Long.valueOf(0);
        this.endDate = Long.valueOf(0);
    }
    
    /**
     * Default constructor for creating the semester object
     * @param section the section to be added to the semester
     * @param semester the name of the semester
     * @param startDate the first day of the semester
     * @param endDate the last day of the professor
     */
    public Semester(Section section, String semester, Long startDate, Long endDate) {
    	this.section = section;
    	this.id = Long.valueOf(0);
        this.semester = semester;
    	this.startDate = startDate;
        this.endDate = endDate;
    }

    /**
     * Default constructor for creating the semester object
     * @param section the section number of the new semester
     * @param id the id of the semester
     * @param semester the name of the semester
     * @param startDate the first day of the semester
     * @param endDate the last day of the professor
     */
    public Semester(Section section, Long id, String semester, Long startDate, Long endDate) {
    	this.section = section;
    	this.id = Long.valueOf(0);
        this.semester = semester;
    	this.startDate = startDate;
        this.endDate = endDate;
    }
    
    /**
     * Get command for the semester id
     * @return id of the current semester
     */
    public Long getId() {
    	return id;
    }
    
    /**
     * Set command for the semester id
     * @param id the long id for the current semester id
     */
    public void setId(Long id) {
    	this.id = id;
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
    public void setSemester(String semester) {
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
