package com.msubanner.spring.msubannerspring.room;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Room {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;


    private int roomNumber;
    private int seatsInRoom;


    protected Room () {}


    public int getRoomNumber() { return roomNumber; }
    public void setRoomNumber(int roomNumber) { this.roomNumber = roomNumber; }


    public int getSeatsInRoom() { return seatsInRoom; }
    public void setSeatsInRoom(int seatsInRoom) { this.seatsInRoom = seatsInRoom; }


    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

}
