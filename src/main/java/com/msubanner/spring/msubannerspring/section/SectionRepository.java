package com.msubanner.spring.msubannerspring.section;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.msubanner.spring.msubannerspring.section.Section;

@RepositoryRestResource
public interface SectionRepository extends CrudRepository<Section,Long>{

}
