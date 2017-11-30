package com.msubanner.spring.msubannerspring.student;

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

/**
 * This is the StudentController class.
 * @author Team 3
 */
@Controller
public class StudentsController {

    @Autowired
    private StudentRepository studentRepository;

    /**
     * This method will display all of the students in the database
     * CRUD(read) - studentRepository.findAll(id)
     */    
    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public ModelAndView getStudentsView() {

        return new ModelAndView("students/index", "students", studentRepository.findAll());
    }

    /**
     * This method will display the student info
     * CRUD(read) - studentRepository.findOne(id)
     */
    @RequestMapping(value = "/students/{id}", method = RequestMethod.GET)
    public ModelAndView getStudentInfoView(@PathVariable("id") long id){

        return new ModelAndView("students/student.show", "student", studentRepository.findOne(id));
    }

    /**
     * This method will edit the student info
     * CRUD(read) - studentRepository.findOne(id)
     */
    @RequestMapping(value = "/students/{id}/edit", method = RequestMethod.GET)
    public ModelAndView getStudentEditView(@PathVariable("id") long id){

        return new ModelAndView("students/student.edit", "student", studentRepository.findOne(id));
    }


    /**
     * This method will create the student
     */
    @RequestMapping(value = "/students/create", method = RequestMethod.GET)
    public ModelAndView getNewStudentView(){

        return new ModelAndView("students/student.create", "student", new Student());
    }

    /**
     * This method will save the students info and post it to the database
     * CRUD (create) - save student
     */
    @RequestMapping(value = "/students", method = RequestMethod.POST)
    public String submitStudent(@Valid @ModelAttribute("student")Student student,
                                BindingResult result, ModelMap model) {

        if (result.hasErrors()) return "error";
        studentRepository.save(student);
        return "redirect:/students";
    }

    /**
     * This method will save the selected student info and post it to the database
     * CRUD (create) - save student
     * Explicitly set the id of the student from the path.
     * The id does not get bounded to the HTML form view and returned.
     */
    @RequestMapping(value = "/students/{id}", method = RequestMethod.POST)
    public String editStudent(@Valid @ModelAttribute("student")Student student,
                              BindingResult result, ModelMap model, @PathVariable("id") long id) {

        if (result.hasErrors()) return "error";
        student.setId(id);
        studentRepository.save(student);
        return "redirect:/students";
    }

    /**
     * This method will delete the selected student from the database
     * CRUD(delete) - delete student
     */ 
    @RequestMapping(value = "/students/{id}/delete", method = RequestMethod.GET)
    public String deleteStudent(@PathVariable("id") long id) {

        studentRepository.delete(id);
        return "redirect:/students";
    }
    /*Create entroll*/
}
