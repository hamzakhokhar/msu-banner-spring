package com.msubanner.spring.msubannerspring.course;

import com.msubanner.spring.msubannerspring.course.Course;
import org.springframework.data.repository.CrudRepository;

/**
 * This class will implement the CRUD operations for use in the the course.
 * controllers on the webpage
 *
 * @author team 3
 */
public interface CourseRepository extends CrudRepository<Course, Long> {

}
