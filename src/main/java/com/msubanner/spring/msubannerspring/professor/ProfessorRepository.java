package com.msubanner.spring.msubannerspring.professor;

import com.msubanner.spring.msubannerspring.professor.Professor;
import org.springframework.data.repository.CrudRepository;

/**
 * This class will implement the CRUD operations for use in the the professor
 * controllers on the webpage
 */
public interface ProfessorRepository extends CrudRepository<Professor, Long> {

}
