package com.msubanner.spring.msubannerspring.building;

import com.msubanner.spring.msubannerspring.building.Building;
import org.springframework.data.repository.CrudRepository;

/**
 * This class will implement the CRUD operations for use in the the building
 * controllers on the webpage
 */
public interface BuildingRepository extends CrudRepository<Building, Long> {

}
