package com.msubanner.spring.msubannerspring.room;

import com.msubanner.spring.msubannerspring.room.Room;
import org.springframework.data.repository.CrudRepository;

/**
 * This class will implement the CRUD operations for use in the the room
 * controllers on the webpage
 */
public interface RoomRepository extends CrudRepository<Room, Long> {

}
