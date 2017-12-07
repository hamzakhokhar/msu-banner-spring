package com.msubanner.spring.msubannerspring.semester;
import javax.persistence.*;

import com.msubanner.spring.msubannerspring.course.Course;
import com.msubanner.spring.msubannerspring.section.Section;

/**
 * Semester Persistence Class
 * @author Jesus & Matt / team 3
 */
@Entity
public class Semester {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    private String semesterName;
    private String startDate;
    private String endDate;

    
    //protected Semester(){};

    /**
     * Default constructor for semester object
     */
    public Semester() {
    	this.id = Long.valueOf(0);
    	this.semesterName = "TBD";
    	this.startDate = "TBD";
    	this.endDate = "TBD";
    }

    
    /**
     * Default constructor for creating the semester object
     * @param semesterName the name of the semester
     * @param startDate the date starting the semester
     * @param endDate the date ending the semester
     */
    public Semester(String semesterName, String startDate, String endDate) {
    	this.id = Long.valueOf(0);
        this.semesterName = semesterName;
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
    public String getSemesterName() {

        return semesterName;
    }

    /**
     * Set command for the semester
     * @param semesterName current semester object
     */
    public void setSemesterName(String semesterName) {

        this.semesterName = semesterName;
    }
    
    /**
     * Get command for the start date
     * @return start date of the semester
     */
    public String getStartDate() {

        return startDate;
    }

    /**
     * Set command for the start date
     * @param startDate of the semester
     */
    public void setStartDate(String startDate) {

        this.startDate = startDate;
    }
    
    /**
     * Get command for the end date
     * @return end day of the semester
     */
    public String getEndDate() {

        return endDate;
    }

    /**
     * Set command for the end date
     * @param endDate of the semester
     */
    public void setEndDate(String endDate) {

        this.endDate = endDate;
    }
}

