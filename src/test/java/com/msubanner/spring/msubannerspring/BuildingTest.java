//tests the methods in the building class. This class was written by Eric Kearney on 10/15/2017
package com.msubanner.spring.msubannerspring;

import com.msubanner.spring.msubannerspring.building.Building;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BuildingTest {
    Building building = new Building();

    /**
     * Tests the ability to set and get the building's name
     */
    @Test
    public void testSetBuildingName() {
        String buildingName = "Science";
        building.setBuildingName(buildingName);
        Assert.assertEquals("Science", building.getBuildingName());
    }

    /**
     * Tests the ability to set and get the building's name if the method is passed a null
     */
    @Test
    public void testSetBuildingNameNull() {
        String nullBuildingName = null;
        building.setBuildingName(nullBuildingName);
        Assert.assertEquals("Un-named building", building.getBuildingName());
    }

    /**
     * Tests the ability to set and get the building's number of rooms
     */
    @Test
    public void testSetBuildingNumberOfRooms() {
        int numberOfRooms = 15;
        building.setNumberOfRooms(numberOfRooms);
        Assert.assertEquals(15, building.getNumberOfRooms());
    }

    /**
     * Tests what happens if the setNumberOfRooms method is passed a negative number
     */
    @Test
    public void testSetBuildingNumberOfRoomsNegative() {
        int negativeNumberOfRooms = -1;
        building.setNumberOfRooms(negativeNumberOfRooms);
        Assert.assertEquals(0, building.getNumberOfRooms());
    }

    /**
     * Tests the ability to set and get the building number
     */
    @Test
    public void testSetBuildingNumber() {
        long buildingNumber = 45615315;
        building.setBuildingNumber(buildingNumber);
        Assert.assertEquals(45615315, building.getBuildingNumber());
    }

    /**
     * Tests what happens if the setBuildingNumber method is passed a negative number
     */
    @Test
    public void testSetBuildingNumberNegative() {
        long negativeBuildingNumber = -451;
        building.setBuildingNumber(negativeBuildingNumber);
        Assert.assertEquals(0, building.getBuildingNumber());
    }

    /**
     * Tests the default constructor of the building class
     */
    @Test
    public void testCreateBuildingNoArgs() {
        Building newBuilding = new Building();

        Assert.assertEquals("Un-named building", newBuilding.getBuildingName());
        Assert.assertEquals(0, newBuilding.getNumberOfRooms());
        Assert.assertEquals(0, newBuilding.getBuildingNumber());
    }

    /**
     * Tests the constructor when passed only the building name
     */
    @Test
    public void testCreateBuildingOneArg() {
        Building newBuilding = new Building("West Classroom");

        Assert.assertEquals("West Classroom", newBuilding.getBuildingName());
        Assert.assertEquals(0, newBuilding.getNumberOfRooms());
        Assert.assertEquals(0, newBuilding.getBuildingNumber());
    }

    /**
     * Tests the constructor when passed only the building name and building number
     */
    @Test
    public void testCreateBuildingTwoArgs() {
        Building newBuilding = new Building("King Center", 999999);

        Assert.assertEquals("King Center", newBuilding.getBuildingName());
        Assert.assertEquals(0, newBuilding.getNumberOfRooms());
        Assert.assertEquals(999999, newBuilding.getBuildingNumber());
    }

    /**
     * Tests the constructor of the building class when passed all arguments
     */
    @Test
    public void testCreateBuilding() {
        Building newBuilding = new Building("North Classroom", 59869456, 112);

        Assert.assertEquals("North Classroom", newBuilding.getBuildingName());
        Assert.assertEquals(112, newBuilding.getNumberOfRooms());
        Assert.assertEquals(59869456, newBuilding.getBuildingNumber());
    }
}