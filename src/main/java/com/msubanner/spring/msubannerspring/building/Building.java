package com.msubanner.spring.msubannerspring.building;

import com.msubanner.spring.msubannerspring.room.Room;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * This is the Building class.
 *
 * @author Team 3
 */
@Entity
public class Building {

    /**
     * Define building ID.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    /**
     * Building name variable.
     */
    private String buildingName = "DEFAULT";

    /**
     * Number of rooms variable.
     */
    private int numberOfRooms = 1;

    /**
     * Many to one with room object.
     */
    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    /**
     * Default constructor.
     */
    public Building() {

    }

    /**
     * Constructor for building passing only one variable, the building name.
     *
     * @param name name of the building
     */
    public Building(String name) {
        this.buildingName = name;
    }

    /**
     * Default constructor for creating the building object.
     *
     * @param name name of the building
     * @param numRooms the number of rooms in the building
     */
    public Building(String name, int numRooms) {
        this.buildingName = name;
        this.numberOfRooms = numRooms;
    }

    /**
     * Default constructor for the building passing all three variables.
     *
     * @param name  The name of the building
     * @param numRooms The number of rooms in the building
     * @param buildingId    The building's unique ID number
     */
    public Building(String name, int numRooms, long buildingId) {
        this.buildingName = name;
        this.numberOfRooms = numRooms;
        this.id = buildingId;
    }

    /**
     * Will return the first name listed in the building object.
     *
     * @return the name of the building
     */
    public String getBuildingName() {
        return buildingName;
    }

    /**
     * Will set the name in the building object.
     *
     * @param name set the firstName of the building
     */
    public void setBuildingName(String name) {
        this.buildingName = name;
    }

    /**
     * Will return the number of rooms listed in the building object.
     *
     * @return the last name of the building
     */
    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    /**
     * Will set the number of rooms in the building object.
     *
     * @param numRooms is the number of rooms
     */
    public void setNumberOfRooms(int numRooms) {
        this.numberOfRooms = numRooms;
    }

    /**
     * Will return the building number listed in the building object.
     *
     * @return the building number of the building
     */
    public long getId() {
        return id;
    }

    /**
     * Will set the building number in the building object.
     *
     * @param buildingId is the building number
     */
    public void setId(long buildingId) {
        this.id = buildingId;
    }
}
