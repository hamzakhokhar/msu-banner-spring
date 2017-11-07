package com.msubanner.spring.msubannerspring.semester;

import com.msubanner.spring.msubannerspring.semester.Semester;
import org.springframework.data.repository.CrudRepository;

/**
 * This class will implement the CRUD operations for use in the semester
 * controllers on the webpage
 */
public interface SemesterRepository extends CrudRepository<Semester, Long> {

}
