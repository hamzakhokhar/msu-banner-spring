package com.msubanner.spring.msubannerspring.building;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * This is the Building class.
 * @author Team 3
 */
@Entity
public class Building {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String buildingName;
    private int numberOfRooms;
    private long buildingNumber;

    protected Building() {};

    /**
     * Default constructor for creating the building object
     * @param buildingName the name of the building
     * @param numberOfRooms the number of rooms in the building
     */
    public Building(String buildingName, int numberOfRooms) {
        this.buildingName = buildingName;
        this.numberOfRooms = numberOfRooms;
    }

    /**
     * Will return the first name listed in the building object
     * @return the name of the building
     */
    public String getBuildingName() {
        return buildingName;
    }

    /**
     * Will set the name in the building object
     * @param buildingName set the firstName of the building
     */
    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    /**
     * Will return the number of rooms listed in the building object
     * @return the last name of the building
     */
    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    /**
     * Will set the number of rooms in the building object
     * @param lastName the last name of the building
     */
    public void setLastName(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    /**
     * Will return the building number listed in the building object
     * @return the building number of the building
     */
    public long getBuildingNumber() {
        return buildingNumber;
    }

    /**
     * Will set the building number in the building object
     * @param id the new building number of the building
     */
    public void setBuildingNumber(long buildingNumber) {
        this.buildingNumber = buildingNumber;
    }
}
