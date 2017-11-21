package com.msubanner.spring.msubannerspring.professor;

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
 * This is the ProfessorController class.
 * @author Team 3
 */
@Controller
public class ProfessorController {

    @Autowired
    private ProfessorRepository professorRepository;

    /**
     * This method will display all of the professors in the database
     * CRUD(read) - professorRepository.findAll(id)
     */
    @RequestMapping(value = "/professor", method = RequestMethod.GET)
    public ModelAndView getProfessorView() {

        return new ModelAndView("professor/index", "professor", professorRepository.findAll());
    }

    /**
     * This method will display the professors info
     * CRUD(read) - professorRepository.findOne(id)
     */
    @RequestMapping(value = "/professor/{id}", method = RequestMethod.GET)
    public ModelAndView getProfessorInfoView(@PathVariable("id") long id){

        return new ModelAndView("professor/professor.show", "professor", professorRepository.findOne(id));
    }

    /**
     * This method will edit the professors info
     * CRUD(read) - professorRepository.findOne(id)
     */
    @RequestMapping(value = "/professor/{id}/edit", method = RequestMethod.GET)
    public ModelAndView getProfessorEditView(@PathVariable("id") long id){

        return new ModelAndView("professor/professor.edit", "professor", professorRepository.findOne(id));
    }

    /**
     * This method will create the professor
     */
    @RequestMapping(value = "/professor/create", method = RequestMethod.GET)
    public ModelAndView getNewProfessorView(){

        return new ModelAndView("professor/professor.create", "professor", new Professor());
    }

    /**
     * This method will save the professors info and post it to the database
     * CRUD (create) - save professor
     */
    @RequestMapping(value = "/professor", method = RequestMethod.POST)
    public String submitProfessor(@Valid @ModelAttribute("professor")Professor professor,
                                  BindingResult result, ModelMap model) {

        if (result.hasErrors()) return "error";
        professorRepository.save(professor);
        return "redirect:/professor";
    }

    /**
     * This method will save the selected professor info and post it to the database
     * CRUD (create) - save professor
     * Explicitly set the id of the professor from the path.
     * The id does not get bounded to the HTML form view and returned.
     */
    @RequestMapping(value = "/professor/{id}", method = RequestMethod.POST)
    public String editProfessor(@Valid @ModelAttribute("professor")Professor professor,
                                BindingResult result, ModelMap model, @PathVariable("id") long id) {

        if (result.hasErrors()) return "error";
        professor.setId(id);
        professorRepository.save(professor);
        return "redirect:/professor";
    }

    /**
     * This method will delete the selected professor from the database
     * CRUD(delete) - delete professor
     */    
    @RequestMapping(value = "/professor/{id}/delete", method = RequestMethod.GET)
    public String deleteProfessor(@PathVariable("id") long id) {

    	professorRepository.delete(id);
        return "redirect:/professor";
    }
}
