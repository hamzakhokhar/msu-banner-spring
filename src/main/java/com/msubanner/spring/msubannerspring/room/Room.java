package com.msubanner.spring.msubannerspring.room;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    private int roomNumber = 1011;
    private int seatsInRoom;


    public Room(int roomNumber, int seatsInRoom, long roomId) {

        this.roomNumber = roomNumber;
        this.seatsInRoom = seatsInRoom;
        this.id = roomId;
        setRoomNumber(roomNumber);
        setSeatsInRoom(seatsInRoom);
        setId(roomId);
    }

    protected Room() {

    }

    Room(int roomNumber, int seatsInRoom) {
        setRoomNumber(roomNumber);
        setSeatsInRoom(seatsInRoom);
    }

    public int getRoomNumber() {

        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {

        this.roomNumber = roomNumber;
    }


    public int getSeatsInRoom() {

        return seatsInRoom;
    }

    public void setSeatsInRoom(int seatsInRoom) {

        this.seatsInRoom = seatsInRoom;
    }

    //Why do rooms need an ID?
    //This is wierd to me too. Room's # are their ID already.
    //I guess everytime we enter a room the ID # will increase automaticlly so it won't repeat.
    public long getId() {

        return id;
    }

    public void setId(long id) {

        this.id = id;
    }

}
