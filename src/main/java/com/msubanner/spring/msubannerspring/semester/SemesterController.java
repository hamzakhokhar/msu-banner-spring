package com.msubanner.spring.msubannerspring.semester;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.msubanner.spring.msubannerspring.course.CourseRepository;
import com.msubanner.spring.msubannerspring.section.Section;
import com.msubanner.spring.msubannerspring.section.SectionRepository;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

/**
 * This is the SemesterController class.
 *
 * @author Team 3
 */
@Controller
public class SemesterController {

    @Autowired
    private SemesterRepository semesterRepository;

    /**
     * This method will display all of the semesters in the database
     * CRUD(read) - semesterRepository.findAll(id)
     */
    @RequestMapping(value = "/semester", method = RequestMethod.GET)
    public ModelAndView getSemesterView() {
        return new ModelAndView("semester/index", "semester", semesterRepository.findAll());
    }

    /**
     * This method will display the semesters info
     * CRUD(read) - semesterRepository.findOne(id)
     */
    @RequestMapping(value = "/semester/{id}", method = RequestMethod.GET)
    public ModelAndView getSemesterInfoView(@PathVariable("id") long id) {
        return new ModelAndView("semester/semester.show", "semester", semesterRepository.findOne(id));
    }

    /**
     * This method will edit the semesters info
     * CRUD(read) - semesterRepository.findOne(id)
     */
    @RequestMapping(value = "/semester/{id}/edit", method = RequestMethod.GET)
    public ModelAndView getSemesterEditView(@PathVariable("id") long id) {

        Map modelMap = new HashMap();
        modelMap.put("semester", semesterRepository.findOne(id));
        return new ModelAndView("semester/semester.edit", modelMap);
    }

    /**
     * This method will create the semester
     */
    @RequestMapping(value = "/semester/create", method = RequestMethod.GET)
    public ModelAndView getNewSemesterView() {
        Map modelMap = new HashMap();
        modelMap.put("semester", new Semester());
        return new ModelAndView("semester/semester.create", modelMap);
    }

    /**
     * This method will save the semesters info and post it to the database
     * CRUD (create) - save semester
     */
    @RequestMapping(value = "/semester", method = RequestMethod.POST)
    public String submitSemester(@Valid @ModelAttribute("semester") Semester semester,
                                 BindingResult result, ModelMap model) {

        if (result.hasErrors()) return "error";
        semesterRepository.save(semester);
        return "redirect:/semester";
    }

    /**
     * This method will save the selected semester info and post it to the database
     * CRUD (create) - save semester
     * Explicitly set the id of the semester from the path.
     * The id does not get bounded to the HTML form view and returned.
     */
    @RequestMapping(value = "/semester/{id}", method = RequestMethod.POST)
    public String editSemester(@Valid @ModelAttribute("semester") Semester semester,
                               BindingResult result, ModelMap model, @PathVariable("id") long id) {
        if (result.hasErrors()) return "error";
        semester.setId(id);
        semesterRepository.save(semester);
        return "redirect:/semester";
    }

    /**
     * This method will delete the selected semester from the database
     * CRUD(delete) - delete semester
     */
    @RequestMapping(value = "/semester/{id}/delete", method = RequestMethod.GET)
    public String deleteSemester(@PathVariable("id") long id) {
        semesterRepository.delete(id);
        return "redirect:/semester";
    }
}
