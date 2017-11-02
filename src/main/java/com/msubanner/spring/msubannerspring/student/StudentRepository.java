package com.msubanner.spring.msubannerspring.student;

import com.msubanner.spring.msubannerspring.student.Student;
import org.springframework.data.repository.CrudRepository;

/**
 * This class will implement the CRUD operations for use in the the student
 * controllers on the webpage
 */
public interface StudentRepository extends CrudRepository<Student, Long> {

}
