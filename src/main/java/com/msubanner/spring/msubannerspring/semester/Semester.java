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
	private Long id;
    private String semesterName;
    private String startMonth;
    private int startDay;
    private String endMonth;
    private int endDay;

    @OneToOne
    @JoinColumn(name = "section_id")
    private Section section;
    
    //protected Semester(){};

    /**
     * Default constructor for semester object
     */
    public Semester() {
    	this.section = null;
    	this.id = Long.valueOf(0);
    	this.semesterName = "TBD";
    	this.startMonth = "TBD";
    	this.startDay = 0;
    	this.endMonth = "TBD";
    	this.endDay = 0;
    }
    
    /**
     * Default constructor for creating the semester object
     * @param section the section to be added to the semester
     */
    public Semester(Section section) {
    	this.section = section;
    	this.id = Long.valueOf(0);
        this.semesterName = "TBD";
        this.startMonth = "TBD";
    	this.startDay = 0;
    	this.endMonth = "TBD";
    	this.endDay = 0;
    }
    
    /**
     * Default constructor for creating the semester object
     * @param section the section to be added to the semester
     * @param semesterName the name of the semester
     * @param startMonth the month starting the semester
     * @param startDay the day of the month starting the semester
     * @param endMonth the month ending the semester
     * @param endDay the day of the month ending the semester
     */
    public Semester(Section section, String semesterName, String startMonth, int startDay, String endMonth, int endDay) {
    	this.section = section;
    	this.id = Long.valueOf(0);
        this.semesterName = semesterName;
        this.startMonth = startMonth;
    	this.startDay = startDay;
    	this.endMonth = endMonth;
    	this.endDay = endDay;
    }

    /**
     * Default constructor for creating the semester object
     * @param section the section number of the new semester
     * @param id the id of the semester
     * @param semesterName the name of the semester
     * @param startDay the first day of the semester
     * @param endDay the last day of the professor
     */
    public Semester(Section section, Long id, String semesterName, String startMonth, int startDay, String endMonth, int endDay) {
    	this.section = section;
    	this.id = Long.valueOf(0);
        this.semesterName = semesterName;
        this.startMonth = startMonth;
    	this.startDay = startDay;
    	this.endMonth = endMonth;
    	this.endDay = endDay;
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
     * @return start month of the semester
     */
    public String getStartMonth() {
        return startMonth;
    }

    /**
     * Set command for the start date
     * @param startMonth of the semester
     */
    public void setStartMonth(String startMonth) {
        this.startMonth = startMonth;
    }
      
    /**
     * Get command for the start date
     * @return start month of the semester
     */
    public int getStartDay() {
        return startDay;
    }

    /**
     * Set command for the start date
     * @param startDay of the semester
     */
    public void setStartDay(int startDay) {
        this.startDay = startDay;
    }
    
    /**
     * Get command for the end date
     * @return end month of the semester
     */
    public String getEndMonth() {
        return endMonth;
    }

    /**
     * Set command for the end date
     * @param endMonth of the semester
     */
    public void setEndMonth(String endMonth) {
        this.endMonth = endMonth;
    }
      
    /**
     * Get command for the end date
     * @return end day of the semester
     */
    public int getEndDay() {
        return endDay;
    }

    /**
     * Set command for the end date
     * @param endDay of the semester
     */
    public void setEndDay(int endDay) {
        this.endDay = endDay;
    }
}
