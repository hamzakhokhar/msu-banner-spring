package com.msubanner.spring.msubannerspring.building;

import org.springframework.data.repository.CrudRepository;

/**
 * This class will implement the CRUD operations for use in the the building.
 * controllers on the webpage
 *
 * @author team 3
 */
public interface BuildingRepository extends CrudRepository<Building, Long> {

}
