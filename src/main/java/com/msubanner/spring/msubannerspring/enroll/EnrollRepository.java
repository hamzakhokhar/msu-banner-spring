package com.msubanner.spring.msubannerspring.enroll;

import com.msubanner.spring.msubannerspring.enroll.Enroll;
import org.springframework.data.repository.CrudRepository;

/**
 * This class will implement the CRUD operations for use in the the enroll
 * controllers on the webpage
 */
public interface EnrollRepository extends CrudRepository<Enroll, Long> {

}
