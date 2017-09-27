package com.msubanner.spring.msubannerspring.professor;

import com.msubanner.spring.msubannerspring.professor.Professor;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource
public interface ProfessorRepository extends CrudRepository<Professor, Long> {

}
