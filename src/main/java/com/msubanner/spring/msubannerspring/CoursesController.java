package com.msubanner.spring.msubannerspring;

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

@Controller
public class CoursesController {

    @Autowired
    private StudentRepository studentRepository;

    // GET courses View
    @RequestMapping(value = "/courses", method = RequestMethod.GET)
    public ModelAndView getcoursesView() {
        // CRUD(read) - studentRepository.findAll(id)
        return new ModelAndView("courses/courses", "courses", studentRepository.findAll());
    }

    // GET Student Info view
    @RequestMapping(value = "/courses/{id}", method = RequestMethod.GET)
    public ModelAndView getStudentInfoView(@PathVariable("id") long id){
        // CRUD(read) - studentRepository.findOne(id)
        return new ModelAndView("courses/student", "student", studentRepository.findOne(id));

    }

    // GET Student Edit view
    @RequestMapping(value = "/courses/{id}/edit", method = RequestMethod.GET)
    public ModelAndView getStudentEditView(@PathVariable("id") long id){
        // CRUD(read) - studentRepository.findOne(id)
        return new ModelAndView("courses/student.edit", "student", studentRepository.findOne(id));
    }


    // GET New student view
    @RequestMapping(value = "/courses/new", method = RequestMethod.GET)
    public ModelAndView getNewStudentView(){
        return new ModelAndView("courses/courses.create", "student", new Student());
    }

    // POST new student view
    @RequestMapping(value = "/courses", method = RequestMethod.POST)
    public String submitStudent(@Valid @ModelAttribute("student")Student student,
                         BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        //CRUD (create) - save student
        studentRepository.save(student);
        return "redirect:/courses";
    }

    // POST edit student view
    @RequestMapping(value = "/courses/{id}", method = RequestMethod.POST)
    public String editStudent(@Valid @ModelAttribute("student")Student student,
                                BindingResult result, ModelMap model, @PathVariable("id") long id) {
        if (result.hasErrors()) {
            return "error";
        }
        // Explicitly set the id of the student from the path.
        // The id dose not get bounded to the html form view and returned.
        student.setId(id);
        // CRUD(create) - save student
        studentRepository.save(student);

        return "redirect:/courses";
    }

    // GET delete student resource
    @RequestMapping(value = "/courses/{id}/delete", method = RequestMethod.GET)
    public String deleteStudent(@PathVariable("id") long id) {
        // CRUD(delete) - delete student
        studentRepository.delete(id);
        return "redirect:/courses";
    }

}
