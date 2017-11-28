package com.msubanner.spring.msubannerspring.building;

import com.msubanner.spring.msubannerspring.room.Room;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * This is the Building class.
 *
 * @author Team 3
 */
@Entity
public class Building {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id = 123456789;

    private String buildingName = "DEFAULT";
    private int numberOfRooms = 1;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    protected Building() {

    }

    /**
     * Constructor for building passing only one variable, the building name
     *
     * @param buildingName The name of the building
     */
    public Building(String buildingName) {

        setBuildingName(buildingName);
    }

    /**
     * Default constructor for creating the building object
     *
     * @param buildingName  the name of the building
     * @param numberOfRooms the number of rooms in the building
     */
    public Building(String buildingName, int numberOfRooms) {

        this.buildingName = buildingName;
        this.numberOfRooms = numberOfRooms;
    }

    /**
     * Default constructor for the building passing all three variables
     *
     * @param buildingName  The name of the building
     * @param numberOfRooms The number of rooms in the building
     * @param buildingId    The building's unique ID number
     */
    public Building(String buildingName, int numberOfRooms, long buildingId) {

        setBuildingName(buildingName);
        setNumberOfRooms(numberOfRooms);
        setId(buildingId);
    }

    /**
     * Will return the first name listed in the building object
     *
     * @return the name of the building
     */
    public String getBuildingName() {

        return buildingName;
    }

    /**
     * Will set the name in the building object
     *
     * @param buildingName set the firstName of the building
     */
    public void setBuildingName(String buildingName) {

        this.buildingName = buildingName;
    }

    /**
     * Will return the number of rooms listed in the building object
     *
     * @return the last name of the building
     */
    public int getNumberOfRooms() {

        return numberOfRooms;
    }

    /**
     * Will set the number of rooms in the building object
     *
     * @param numberOfRooms is the number of rooms
     */
    public void setNumberOfRooms(int numberOfRooms) {

        this.numberOfRooms = numberOfRooms;
    }

    /**
     * Will return the building number listed in the building object
     *
     * @return the building number of the building
     */
    public long getId() {

        return id;
    }

    /**
     * Will set the building number in the building object
     *
     * @paramid is the building number
     */
    public void setId(long id) {

        this.id = id;
    }

    public Room getRoom() {

        return room;
    }

    public void setRoom(int roomNumber, int numberOfSeats) {

    }
}
