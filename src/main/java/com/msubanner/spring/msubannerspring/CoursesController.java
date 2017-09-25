//package com.msubanner.spring.msubannerspring;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.validation.Valid;
//
//@Controller
//public class CoursesController {
//
//    @Autowired
//    private CourseRepository courseRepository;
//
//    // GET courses View
//    @RequestMapping(value = "/courses", method = RequestMethod.GET)
//    public ModelAndView getCourseView() {
//        // CRUD(read) - courseRepository.findAll(id)
//        return new ModelAndView("courses/courses", "course", courseRepository.findAll());
//    }
//
//    // GET course Info view
//    @RequestMapping(value = "/courses/{id}", method = RequestMethod.GET)
//    public ModelAndView getCourseInfoView(@PathVariable("id") long id){
//        // CRUD(read) - courseRepository.findOne(id)
//        return new ModelAndView("courses/course", "course", courseRepository.findOne(id));
//
//    }
//
//    // GET Course Edit view
//    @RequestMapping(value = "/courses/{id}/edit", method = RequestMethod.GET)
//    public ModelAndView getCourseEditView(@PathVariable("id") long id){
//        // CRUD(read) - courseRepository.findOne(id)
//        return new ModelAndView("courses/course.edit", "course", courseRepository.findOne(id));
//    }
//
//
//    // GET New course view
//    @RequestMapping(value = "/courses/new", method = RequestMethod.GET)
//    public ModelAndView getNewCourseView(){
//        return new ModelAndView("courses/course.create", "course", new Course());
//    }
//
//    // POST new course view
//    @RequestMapping(value = "/courses", method = RequestMethod.POST)
//    public String submitCourse(@Valid @ModelAttribute("course")Course course,
//                         BindingResult result, ModelMap model) {
//        if (result.hasErrors()) {
//            return "error";
//        }
//        //CRUD (create) - save course
//        courseRepository.save(course);
//        return "redirect:/courses";
//    }
//
//    // POST edit course view
//    @RequestMapping(value = "/courses/{id}", method = RequestMethod.POST)
//    public String editCourse(@Valid @ModelAttribute("course")Course course,
//                                BindingResult result, ModelMap model, @PathVariable("id") long id) {
//        if (result.hasErrors()) {
//            return "error";
//        }
//        // Explicitly set the id of the course from the path.
//        // The id dose not get bounded to the html form view and returned.
//        course.setCourseId(id);
//        // CRUD(create) - save course
//        courseRepository.save(course);
//
//        return "redirect:/courses";
//    }
//
//    // GET delete course resource
//    @RequestMapping(value = "/courses/{id}/delete", method = RequestMethod.GET)
//    public String deleteCourse(@PathVariable("id") long id) {
//        // CRUD(delete) - delete course
//        courseRepository.delete(id);
//        return "redirect:/courses";
//    }
//
//}
