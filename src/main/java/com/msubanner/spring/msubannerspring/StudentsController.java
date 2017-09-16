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
import java.util.Arrays;
import java.util.List;

@Controller
public class StudentsController {

    @Autowired
    private StudentRepository studentRepository;

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public ModelAndView test() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("students/students");
        modelAndView.addObject("students", studentRepository.findAll());
        return modelAndView;
    }

    //CREATE - GET
    @RequestMapping(value = "/students/new", method = RequestMethod.GET)
    public ModelAndView createStudent(){
        return new ModelAndView("students/students.create", "student", new Student());
    }

    //CREATE - GET
    @RequestMapping(value = "/students", method = RequestMethod.POST)
    public String submitStudent(@Valid @ModelAttribute("student")Student student,
                         BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }

        studentRepository.save(student);

        return "redirect:/students";
    }

    //CREATE - GET
    @RequestMapping(value = "/students/{id}", method = RequestMethod.POST)
    public String editStudent(@Valid @ModelAttribute("student")Student student,
                                BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }



        studentRepository.save(student);

        return "redirect:/students";
    }

    //READ - GET
    @RequestMapping(value = "/students/{id}", method = RequestMethod.GET)
    public ModelAndView redirectToGetStudent(@PathVariable("id") long id){

        return new ModelAndView("students/student", "student", studentRepository.findOne(id));

    }

    //UPDATE - POST
//     ** possibily a redirect
    @RequestMapping(value = "/students/{id}/edit", method = RequestMethod.GET)
    public ModelAndView redirectToUpdateStudent(@PathVariable("id") long id){
        return new ModelAndView("students/student.edit", "student", studentRepository.findOne(id));
    }

    //DELETE - POST
    // ** possibily a redirect
//    @RequestMapping(value = "/students/{id}/delete", method = RequestMethod.POST)
//    public ModelAndView redirectToStudent(){
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("students/students");
//        return modelAndView;
//    }

}
