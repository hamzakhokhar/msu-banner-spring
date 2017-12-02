package com.msubanner.spring.msubannerspring.schedule;

import com.msubanner.spring.msubannerspring.schedule.Schedule;
import org.springframework.data.repository.CrudRepository;

/**
 * This class will implement the CRUD operations for use in the the schedule
 * controllers on the webpage
 */
public interface ScheduleRepository extends CrudRepository<Schedule, Long> {

}