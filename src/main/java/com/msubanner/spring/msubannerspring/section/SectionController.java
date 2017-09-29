package com.msubanner.spring.msubannerspring.section;

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
public class SectionController {

    @Autowired
    private SectionRepository sectionRepository;

    /**
     * Finds all Sections stored in the section repo data table
     * @return ModelAndView
     */
    // GET Section View
    @RequestMapping(value = "/section", method = RequestMethod.GET)
    public ModelAndView getSectionView() {
        // CRUD(read) - sectionRepository.findAll(id)
        return new ModelAndView("section/section", "section", sectionRepository.findAll());
    }

    /**
     * Finds a specified Section via id hash key in section data table
     * @param Long id
     * @return ModelAndView
     */
    // GET Section Info view
    @RequestMapping(value = "/section/{id}", method = RequestMethod.GET)
    public ModelAndView getSectionInfoView(@PathVariable("id") long id){
        // CRUD(read) - sectionRepository.findOne(id)
        return new ModelAndView("section/section", "section", sectionRepository.findOne(id));

    }

    /**
     * Finds a specified Section and will override it in the section data table
     * @param Long id
     * @return ModelAndView
     */
    // GET Section Edit view
    @RequestMapping(value = "/section/{id}/edit", method = RequestMethod.GET)
    public ModelAndView getSectionEditView(@PathVariable("id") long id){
        // CRUD(read) - sectionRepository.findOne(id)
        return new ModelAndView("section/section.edit", "section", sectionRepository.findOne(id));
    }


    /**
     * Creates a new Section and stores it in section data table
     * @return ModelAndView
     */
    // GET New Section view
    @RequestMapping(value = "/section/new", method = RequestMethod.GET)
    public ModelAndView getNewSectionView(){
        return new ModelAndView("section/section.create", "section", new Section());
    }

    /**
     * Saves a Section's information to the section data table
     * @param Section section
     * @param BindingResult result
     * @param ModelMap model
     * @return String, redirect for html
     */
    // POST New Section view
    @RequestMapping(value = "/section", method = RequestMethod.POST)
    public String submitSection(@Valid @ModelAttribute("section")Section section,
                                BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        //CRUD (create) - save section
        sectionRepository.save(section);
        return "redirect:/section";
    }

    /**
     * @param Section section
     * @param BindingResult result
     * @param ModelMap model
     * @param Long id
     * @return String, redirect for html
     */
    // POST Edit Section view
    @RequestMapping(value = "/section/{id}", method = RequestMethod.POST)
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

        return "redirect:/section";
    }

    /**
     * Finds a Section to remove from the database
     * @param Long id
     * @return String, redirect for html
     */
    // GET delete section resource
    @RequestMapping(value = "/section/{id}/delete", method = RequestMethod.GET)
    public String deleteSection(@PathVariable("id") long id) {
        // CRUD(delete) - delete section
        sectionRepository.delete(id);
        return "redirect:/section";
    }
}
