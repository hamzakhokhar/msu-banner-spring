package com.msubanner.spring.msubannerspring.schedule;

import com.msubanner.spring.msubannerspring.course.CourseRepository;
import com.msubanner.spring.msubannerspring.section.SectionRepository;
import com.msubanner.spring.msubannerspring.semester.Semester;
import com.msubanner.spring.msubannerspring.student.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

/**
 *
 */
@Controller
public class ScheduleController {


    @Autowired
    private ScheduleRepository scheduleRepository;

    @Autowired
    private SectionRepository sectionRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private StudentRepository studentRepository;

    /**
     * This method will display all of the schedules in the database
     * CRUD(read) - scheduleRepository.findAll(id)
     */
    @RequestMapping(value = "/schedule", method = RequestMethod.GET)
    public ModelAndView getScheduleView() {

        return new ModelAndView("schedule/index", "schedule", scheduleRepository.findAll());
    }

    /**
     * This method will display the schedules info
     * CRUD(read) - scheduleRepository.findOne(id)
     */
    @RequestMapping(value = "/schedule/{id}", method = RequestMethod.GET)
    public ModelAndView getScheduleInfoView(@PathVariable("id") long id){

        return new ModelAndView("schedule/schedule.show", "schedule", scheduleRepository.findOne(id));
    }

    /**
     * This method will edit the schedules info
     * CRUD(read) - scheduleRepository.findOne(id)
     */
    @RequestMapping(value = "/schedule/{id}/edit", method = RequestMethod.GET)
    public ModelAndView getScheduleEditView(@PathVariable("id") long id){

        Map modelMap = new HashMap();
        modelMap.put("schedule", scheduleRepository.findOne(id));
        modelMap.put("section", sectionRepository.findAll());
        modelMap.put("student", studentRepository.findAll());
        return new ModelAndView("schedule/schedule.edit", modelMap);
    }

    /**
     * This method will create the schedule
     */
    @RequestMapping(value = "/schedule/create", method = RequestMethod.GET)
    public ModelAndView getNewScheduleView(){

        Map modelMap = new HashMap();
        modelMap.put("schedule", new Schedule());
        modelMap.put("section", sectionRepository.findAll());
        modelMap.put("student", studentRepository.findAll());
        // modelMap.put("semester", new Schedule());
        return new ModelAndView("schedule/schedule.create", modelMap);
        // return new ModelAndView("schedule/schedule.create", "schedule", new Schedule());
    }

    /**
     * This method will save the schedules info and post it to the database
     * CRUD (create) - save schedule
     */
    @RequestMapping(value = "/schedule", method = RequestMethod.POST)
    public String submitSchedule(@Valid @ModelAttribute("schedule")Schedule schedule,
                               BindingResult result, ModelMap model) {

        if (result.hasErrors()) return "error";
        scheduleRepository.save(schedule);
        return "redirect:/schedule";
    }

    /**
     * This method will save the selected schedule info and post it to the database
     * CRUD (create) - save schedule
     * Explicitly set the id of the schedule from the path.
     * The id does not get bounded to the HTML form view and returned.
     */
    @RequestMapping(value = "/schedule/{id}", method = RequestMethod.POST)
    public String editSchedule(@Valid @ModelAttribute("schedule")Schedule schedule,
                             BindingResult result, ModelMap model, @PathVariable("id") long id) {

        if (result.hasErrors()) return "error";
        schedule.setId(id);
        scheduleRepository.save(schedule);
        return "redirect:/schedule";
    }

    /**
     * This method will delete the selected schedule from the database
     * CRUD(delete) - delete schedule
     */
    @RequestMapping(value = "/schedule/{id}/delete", method = RequestMethod.GET)
    public String deleteSchedule(@PathVariable("id") long id) {

        scheduleRepository.delete(id);
        return "redirect:/schedule";
    }
}
