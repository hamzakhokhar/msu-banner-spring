//Building class, written by Matt Kline and Eric Kearney
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

    /**
     * The default constructor for the building class
     */
    public Building() {
        this.buildingName = "Un-named building";
        this.buildingNumber = 0;
        this.numberOfRooms = 0;
    }

    /**
     * Allows a building to be created with a name and defaults the building number and number of rooms
     * @param buildingName the name of the building
     */
    public Building(String buildingName) {
        setBuildingName(buildingName);
        this.buildingNumber = 0;
        this.numberOfRooms = 0;
    }

    /**
     * Allows a building to be created with a name and a building number and defaults the number of rooms
     * @param buildingName the name of the building
     * @param buildingNumber the unique ID of the building
     */
    public Building(String buildingName, long buildingNumber) {
        setBuildingName(buildingName);
        setBuildingNumber(buildingNumber);
        this.numberOfRooms = 0;
    }

    /**
     * Default constructor for creating the building object
     * @param buildingName the name of the building
     * @param buildingNumber the building's unique ID number
     * @param numberOfRooms the number of rooms in the building
     */
    public Building(String buildingName, long buildingNumber, int numberOfRooms) {
        setBuildingName(buildingName);
        setBuildingNumber(buildingNumber);
        setNumberOfRooms(numberOfRooms);
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
        if (buildingName == null) {
            this.buildingName = "Un-named building";
        } else {
            this.buildingName = buildingName;
        }
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
     * @param  numberOfRooms the number of rooms in the building
     */
    public void setNumberOfRooms (int numberOfRooms) {
        if (numberOfRooms >= 0) {
            this.numberOfRooms = numberOfRooms;
        } else {
            this.numberOfRooms = 0;
        }
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
     * @param buildingNumber is the building's unique number
     */
    public void setBuildingNumber(long buildingNumber) {
        if (buildingNumber >= 0) {
            this.buildingNumber = buildingNumber;
        } else {
            this.buildingNumber = 0;
        }
    }
}
