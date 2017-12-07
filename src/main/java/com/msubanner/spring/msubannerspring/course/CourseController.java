package com.msubanner.spring.msubannerspring.course;

import com.msubanner.spring.msubannerspring.building.BuildingRepository;
import com.msubanner.spring.msubannerspring.course.Course;
import com.msubanner.spring.msubannerspring.course.CourseRepository;
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
public class CourseController {

	/**
	 * import course repo
	 */
    @Autowired
    private CourseRepository courseRepository;

    /**
     * import building repo
     */
    @Autowired
    private BuildingRepository buildingRepository;

    /**
     * This method will display all of the courses in the database.
     * CRUD(read) - courseRepository.findAll(id)
     *
     * @return link redirect
     */
    @RequestMapping(value = "/courses", method = RequestMethod.GET)
    public ModelAndView getCourseView() {
        return new ModelAndView("courses/index", "courses", courseRepository.findAll());
    }

    /**
     * This method will display the course info.
     * CRUD(read) - courseRepository.findOne(id)
     *
     * @return link redirect
     */
    @RequestMapping(value = "/courses/{id}", method = RequestMethod.GET)
    public ModelAndView getCourseInfoView(@PathVariable("id") long id){
        return new ModelAndView("courses/course.show", "course", courseRepository.findOne(id));
    }

    /**
     * This method will edit the course info.
     * CRUD(read) - courseepository.findOne(id)
     *
     * @return link redirect
     */
    @RequestMapping(value = "/courses/{id}/edit", method = RequestMethod.GET)
    public ModelAndView getCourseEditView(@PathVariable("id") long id){
        return new ModelAndView("courses/course.edit", "course", courseRepository.findOne(id));
    }

    /**
     * This method will create the course
     *
     * @return link redirect
     */
    @RequestMapping(value = "/courses/create", method = RequestMethod.GET)
    public ModelAndView getNewCourseView(){
        return new ModelAndView("courses/course.create", "course", new Course());
    }

    /**
     * This method will save the course info and post it to the database.
     * CRUD (create) - save course
     *
     * @return link redirect
     */
    @RequestMapping(value = "/courses", method = RequestMethod.POST)
    public String submitCourse(@Valid @ModelAttribute("course")Course course,
                         BindingResult result, ModelMap model) {

        if (result.hasErrors()) {
            return "error";
        }
        courseRepository.save(course);
        return "redirect:/courses";
    }

    /**
     * This method will save the selected course info and post it to the database.
     * CRUD (create) - save course
     * Explicitly set the course id of the course from the path.
     * The roomNumber does not get bounded to the HTML form view and returned.
     *
     * @return link redirect
     */
    @RequestMapping(value = "/courses/{id}", method = RequestMethod.POST)
    public String editCourse(@Valid @ModelAttribute("course")Course course,
                                BindingResult result, ModelMap model,
                             @PathVariable("id") long id) {

        if (result.hasErrors()) {
            return "error";
        }
        course.setCourseId(id);
        courseRepository.save(course);
        return "redirect:/courses";
    }

    /**
     * This method will delete the selected course from the database.
     * CRUD(delete) - delete course
     *
     * @return link redirect
     */
    @RequestMapping(value = "/courses/{id}/delete", method = RequestMethod.GET)
    public String deleteCourse(@PathVariable("id") long id) {
        courseRepository.delete(id);
        return "redirect:/courses";
    }

}
