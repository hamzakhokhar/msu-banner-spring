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

@Controller
public class ProfessorController {

    @Autowired
    private ProfessorRepository professorRepository;

    // GET Professor View
    @RequestMapping(value = "/professor", method = RequestMethod.GET)
    public ModelAndView getProfessorView() {
        // CRUD(read) - professorRepository.findAll(id)
        return new ModelAndView("professor/index", "professor", professorRepository.findAll());
    }

    // GET Professor Info view
    @RequestMapping(value = "/professor/{id}", method = RequestMethod.GET)
    public ModelAndView getProfessorInfoView(@PathVariable("id") long id){
        // CRUD(read) - professorRepository.findOne(id)
        return new ModelAndView("professor/professor.show", "professor", professorRepository.findOne(id));

    }

    // GET Professor Edit view
    @RequestMapping(value = "/professor/{id}/edit", method = RequestMethod.GET)
    public ModelAndView getProfessorEditView(@PathVariable("id") long id){
        // CRUD(read) - professorRepository.findOne(id)
        return new ModelAndView("professor/professor.edit", "professor", professorRepository.findOne(id));
    }


    // GET New professor view
    @RequestMapping(value = "/professor/create", method = RequestMethod.GET)
    public ModelAndView getNewProfessorView(){
        return new ModelAndView("professor/professor.create", "professor", new Professor());
    }

    // POST new professor view
    @RequestMapping(value = "/professor", method = RequestMethod.POST)
    public String submitProfessor(@Valid @ModelAttribute("professor")Professor professor,
                         BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        //CRUD (create) - save professor
        professorRepository.save(professor);
        return "redirect:/professor";
    }

    // POST edit professor view
    @RequestMapping(value = "/professor/{id}", method = RequestMethod.POST)
    public String editProfessor(@Valid @ModelAttribute("professor")Professor professor,
                                BindingResult result, ModelMap model, @PathVariable("id") long id) {
        if (result.hasErrors()) {
            return "error";
        }
        // Explicitly set the id of the professor from the path.
        // The id dose not get bounded to the html form view and returned.
        professor.setId(id);
        // CRUD(create) - save student
        professorRepository.save(professor);

        return "redirect:/professor";
    }

    // GET delete professor resource
    @RequestMapping(value = "/professor/{id}/delete", method = RequestMethod.GET)
    public String deleteProfessor(@PathVariable("id") long id) {
        // CRUD(delete) - delete professor
    	professorRepository.delete(id);
        return "redirect:/professor";
    }

}
