package com.msubanner.spring.msubannerspring.course;

import com.msubanner.spring.msubannerspring.course.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long> {

}
