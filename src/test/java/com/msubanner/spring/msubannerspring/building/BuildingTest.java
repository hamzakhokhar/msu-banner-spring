//The tests for the bullding class, written by Eric Kearney on Oct. 24 2017
package com.msubanner.spring.msubannerspring.building;

import org.junit.Test;
import org.junit.Assert;

public class BuildingTest {
    Building testBuilding = new Building();

    /**
     * Tests the building class's ability to set and get the building name
     */
    @Test
    public void testBuildingName(){
        String buildingName = "West Classroom";
        testBuilding.setBuildingName(buildingName);
        Assert.assertEquals("West Classroom", testBuilding.getBuildingName());
    }

    /**
     * Tests the building class's ability to set and get the building number of rooms
     */
    @Test
    public void testBuildingNumberOfRooms(){
        int numberOfRooms = 15;
        testBuilding.setNumberOfRooms(numberOfRooms);
        Assert.assertEquals(15, testBuilding.getNumberOfRooms());
    }

    /**
     * Tests the building class's ability to set and get the building ID
     */
    @Test
    public void testBuildingId(){
        long buildingId = 9000000;
        testBuilding.setId(buildingId);
        Assert.assertEquals(9000000, testBuilding.getId());
    }

    /**
     * Tests the building class constructor when passed only one variable, which will be the
     * building name
     */
    @Test
    public void testCreateBuildingNameOnly(){
        String buildingName = "Science";
        Building testBuildingConstructor = new Building(buildingName);
        Assert.assertEquals("Science", testBuildingConstructor.getBuildingName());
    }

    /**
     * Tests the building class constructor when passed two variables, which will be, in order,
     * the building name and the number of rooms in the building
     */
    @Test
    public void testCreateBuildingNameAndRooms(){
        String buildingName = "Aerospace & Engineering";
        int numberOfRooms = 60;
        Building testBuildingConstructor = new Building(buildingName, numberOfRooms);
        Assert.assertEquals("Aerospace & Engineering", testBuildingConstructor.getBuildingName());
        Assert.assertEquals(60, testBuildingConstructor.getNumberOfRooms());
    }

    /**
     * Tests the building class constructor when passed three variables, which will be, in order,
     * the building name, the number of rooms in the building, and the unique ID of the building
     */
    @Test
    public void testCreateBuildingAllVars(){
        String buildingName = "Central Classroom";
        int numberOfRooms = 28;
        long buildingId = 04510451;
        Building testBuildingConstructor = new Building(buildingName, numberOfRooms, buildingId);
        Assert.assertEquals("Central Classroom", testBuildingConstructor.getBuildingName());
        Assert.assertEquals(28, testBuildingConstructor.getNumberOfRooms());
        Assert.assertEquals(04510451, testBuildingConstructor.getId());
    }
}