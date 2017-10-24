package com.msubanner.spring.msubannerspring.room;

import com.msubanner.spring.msubannerspring.building.Building;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource
/**
 * This class will implement the CRUD operations for use in the the building
 * controllers on the webpage
 */
public interface RoomRepository extends CrudRepository<Room, Long> {

}
