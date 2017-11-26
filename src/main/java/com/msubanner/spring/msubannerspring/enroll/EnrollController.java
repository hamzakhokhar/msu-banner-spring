package com.msubanner.spring.msubannerspring.enroll;

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

@Controller
public class EnrollController {


    @Autowired
    private EnrollRepository enrollRepository;

    @Autowired
    private SectionRepository sectionRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private StudentRepository studentRepository;

    /**
     * This method will display all of the enrolls in the database
     * CRUD(read) - enrollRepository.findAll(id)
     */
    @RequestMapping(value = "/enroll", method = RequestMethod.GET)
    public ModelAndView getEnrollView() {

        return new ModelAndView("enroll/index", "enroll", enrollRepository.findAll());
    }

    /**
     * This method will display the enrolls info
     * CRUD(read) - enrollRepository.findOne(id)
     */
    @RequestMapping(value = "/enroll/{id}", method = RequestMethod.GET)
    public ModelAndView getEnrollInfoView(@PathVariable("id") long id){

        return new ModelAndView("enroll/enroll.show", "enroll", enrollRepository.findOne(id));
    }

    /**
     * This method will edit the enrolls info
     * CRUD(read) - enrollRepository.findOne(id)
     */
    @RequestMapping(value = "/enroll/{id}/edit", method = RequestMethod.GET)
    public ModelAndView getEnrollEditView(@PathVariable("id") long id){

        return new ModelAndView("enroll/enroll.edit", "enroll", enrollRepository.findOne(id));
    }

    /**
     * This method will create the enroll
     */
    @RequestMapping(value = "/enroll/create", method = RequestMethod.GET)
    public ModelAndView getNewEnrollView(){

        Map modelMap = new HashMap();
        modelMap.put("courses", courseRepository.findAll());
        modelMap.put("section", sectionRepository.findAll());
        modelMap.put("student", studentRepository.findAll());
        // modelMap.put("semester", new Enroll());
        return new ModelAndView("enroll/enroll.create", modelMap);
        // return new ModelAndView("enroll/enroll.create", "enroll", new Enroll());
    }

    /**
     * This method will save the enrolls info and post it to the database
     * CRUD (create) - save enroll
     */
    @RequestMapping(value = "/enroll", method = RequestMethod.POST)
    public String submitEnroll(@Valid @ModelAttribute("enroll")Enroll enroll,
                                  BindingResult result, ModelMap model) {

        if (result.hasErrors()) return "error";
        enrollRepository.save(enroll);
        return "redirect:/enroll";
    }

    /**
     * This method will save the selected enroll info and post it to the database
     * CRUD (create) - save enroll
     * Explicitly set the id of the enroll from the path.
     * The id does not get bounded to the HTML form view and returned.
     */
    @RequestMapping(value = "/enroll/{id}", method = RequestMethod.POST)
    public String editEnroll(@Valid @ModelAttribute("enroll")Enroll enroll,
                                BindingResult result, ModelMap model, @PathVariable("id") long id) {

        if (result.hasErrors()) return "error";
        enroll.setId(id);
        enrollRepository.save(enroll);
        return "redirect:/enroll";
    }

    /**
     * This method will delete the selected enroll from the database
     * CRUD(delete) - delete enroll
     */
    @RequestMapping(value = "/enroll/{id}/delete", method = RequestMethod.GET)
    public String deleteEnroll(@PathVariable("id") long id) {

        enrollRepository.delete(id);
        return "redirect:/enroll";
    }
}
