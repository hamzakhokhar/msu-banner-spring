package com.msubanner.spring.msubannerspring.room;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoomTest {

    @Test
    public void testDefaultRoomConstructor(){
        int roomNumber = 71;
        int seatsInRoom = 30;

        Room testRoom = new Room(roomNumber, seatsInRoom);

        Assert.assertEquals(71, testRoom.getRoomNumber());
        Assert.assertEquals(30, testRoom.getSeatsInRoom());
    }

    Room testRoom = new Room();

    @Test
    public void testRoomNumber(){
        int roomNumber = 42;
        testRoom.setRoomNumber(roomNumber);
        Assert.assertEquals(42, testRoom.getRoomNumber());
    }

    @Test
    public void testSeatsInRoom(){
        int seatsInRoom = 1234;
        testRoom.setSeatsInRoom(seatsInRoom);
        Assert.assertEquals(1234, testRoom.getSeatsInRoom());
    }

    @Test
    public void testRoomId(){
        long Id = 10101;
        testRoom.setId(Id);
        Assert.assertEquals(10101, testRoom.getId());
    }

}