package com.msubanner.spring.msubannerspring.section;

import com.msubanner.spring.msubannerspring.course.CourseRepository;
import com.msubanner.spring.msubannerspring.professor.Professor;
import com.msubanner.spring.msubannerspring.professor.ProfessorRepository;
import com.msubanner.spring.msubannerspring.room.RoomRepository;
import com.msubanner.spring.msubannerspring.section.Section;
import com.msubanner.spring.msubannerspring.building.BuildingRepository;
import com.msubanner.spring.msubannerspring.course.Course;

import com.msubanner.spring.msubannerspring.semester.SemesterController;
import com.msubanner.spring.msubannerspring.semester.SemesterRepository;
import com.msubanner.spring.msubannerspring.student.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
public class SectionController {

    @Autowired
    private SectionRepository sectionRepository;

    @Autowired
    private ProfessorRepository professorRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private BuildingRepository buildingRepository;

    @Autowired
    private SemesterRepository semesterRepository;
    
    /**
     * Finds all Sections stored in the section repo data table
     * @return ModelAndView
     */
    // GET Section View
    @RequestMapping(value = "/sections", method = RequestMethod.GET)
    public ModelAndView getSectionView() {

        // CRUD(read) - sectionRepository.findAll(id)
        return new ModelAndView("sections/index", "sections", sectionRepository.findAll());
    }

    /**
     * Finds a specified Section via id hash key in section data table
     * @param id
     * @return ModelAndView
     */
    // GET Section Info view
    @RequestMapping(value = "/sections/{id}", method = RequestMethod.GET)
    public ModelAndView getSectionInfoView(@PathVariable("id") long id){

        // CRUD(read) - sectionRepository.findOne(id)
        return new ModelAndView("sections/section.show", "section", sectionRepository.findOne(id));

    }

    /**
     * Finds a specified Section and will override it in the section data table
     * @param id
     * @return ModelAndView
     */
    // GET Section Edit view
    @RequestMapping(value = "/sections/{id}/edit", method = RequestMethod.GET)
    public ModelAndView getSectionEditView(@PathVariable("id") long id){

        // CRUD(read) - sectionRepository.findOne(id)
        Map modelMap = new HashMap();
        modelMap.put("professors", professorRepository.findAll());
        modelMap.put("courses", courseRepository.findAll());
        modelMap.put("section", sectionRepository.findOne(id));
        modelMap.put("buildings", buildingRepository.findAll());
        modelMap.put("semesters", semesterRepository.findAll());
        return new ModelAndView("sections/section.edit", modelMap);
    }


    /**
     * Creates a new Section and stores it in section data table
     * @return ModelAndView
     */
    // GET New Section view
    @RequestMapping(value = "/sections/create", method = RequestMethod.GET)
    public ModelAndView getNewSectionView(){

        Map modelMap = new HashMap();
        modelMap.put("professors", professorRepository.findAll());
        modelMap.put("courses", courseRepository.findAll());
        modelMap.put("section", new Section());
        modelMap.put("buildings", buildingRepository.findAll());
        modelMap.put("semesters", semesterRepository.findAll());
        return new ModelAndView("sections/section.create", modelMap);
    }

    /**
     * Saves a Section's information to the section data table
     * @param section
     * @param result
     * @param model
     * @return String, redirect for html
     */
    // POST New Section view
    @RequestMapping(value = "/sections", method = RequestMethod.POST)
    public String submitSection(@Valid @ModelAttribute("section")Section section,
                                BindingResult result, ModelMap model) {

        if (result.hasErrors()) {

            return "error";
        }
        //CRUD (create) - save section
        sectionRepository.save(section);
        return "redirect:/sections";
    }

    /**
     * @param section
     * @param result
     * @param model
     * @param id
     * @return String, redirect for html
     */
    // POST Edit Section view
    @RequestMapping(value = "/sections/{id}", method = RequestMethod.POST)
    public String editSection(@Valid @ModelAttribute("section")Section section,
                              BindingResult result, ModelMap model, @PathVariable("id") long id) {

        if (result.hasErrors()) {

            return "error";
        }
        // Explicitly set the id of the section from the path.
        // The id dose not get bounded to the html form view and returned.
        section.setId(id);
        // CRUD(create) - save section
        sectionRepository.save(section);

        return "redirect:/sections";
    }

    /**
     * Finds a Section to remove from the database
     * @param id
     * @return String, redirect for html
     */
    // GET delete section resource
    @RequestMapping(value = "/sections/{id}/delete", method = RequestMethod.GET)
    public String deleteSection(@PathVariable("id") long id) {

        // CRUD(delete) - delete section
        sectionRepository.delete(id);
        return "redirect:/sections";
    }
}
