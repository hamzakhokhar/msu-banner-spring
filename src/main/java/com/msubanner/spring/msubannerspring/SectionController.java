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
public class SectionController {

    @Autowired
    private SectionRepository sectionRepository;

    // GET Sections View
    @RequestMapping(value = "/sections", method = RequestMethod.GET)
    public ModelAndView getSectionsView() {
        // CRUD(read) - sectionRepository.findAll(id)
        return new ModelAndView("sections/sections", "sections", sectionRepository.findAll());
    }

    // GET Section Info view
    @RequestMapping(value = "/sections/{id}", method = RequestMethod.GET)
    public ModelAndView getSectionInfoView(@PathVariable("id") long id){
        // CRUD(read) - sectionRepository.findOne(id)
        return new ModelAndView("sections/section", "section", sectionRepository.findOne(id));

    }

    // GET Section Edit view
    @RequestMapping(value = "/sections/{id}/edit", method = RequestMethod.GET)
    public ModelAndView getSectionEditView(@PathVariable("id") long id){
        // CRUD(read) - sectionRepository.findOne(id)
        return new ModelAndView("sections/section.edit", "section", sectionRepository.findOne(id));
    }


    // GET New Section view
    @RequestMapping(value = "/sections/new", method = RequestMethod.GET)
    public ModelAndView getNewSectionView(){
        return new ModelAndView("sections/sections.create", "section", new Section());
    }

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

    // GET delete section resource
    @RequestMapping(value = "/sections/{id}/delete", method = RequestMethod.GET)
    public String deleteSection(@PathVariable("id") long id) {
        // CRUD(delete) - delete section
        sectionRepository.delete(id);
        return "redirect:/sections";
    }
}
