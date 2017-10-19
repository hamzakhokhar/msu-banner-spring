package com.msubanner.spring.msubannerspring.building;

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
 * This is the BuildingController class.
 * @author Team 3
 */
@Controller
public class BuildingController {

    @Autowired
    private BuildingRepository buildingRepository;

    /**
     * This method will display all of the buildings in the database
     * CRUD(read) - buildingRepository.findAll(id)
     */
    @RequestMapping(value = "/building", method = RequestMethod.GET)
    public ModelAndView getBuildingView() {
        return new ModelAndView("building/index", "building", buildingRepository.findAll());
    }

    /**
     * This method will display the buildings info
     * CRUD(read) - buildingRepository.findOne(id)
     */
    @RequestMapping(value = "/building/{id}", method = RequestMethod.GET)
    public ModelAndView getBuildingInfoView(@PathVariable("id") long roomNumber){
        return new ModelAndView("building/building.show", "building", buildingRepository.findOne(roomNumber));
    }

    /**
     * This method will edit the buildings info
     * CRUD(read) - buildingRepository.findOne(id)
     */
    @RequestMapping(value = "/building/{id}/edit", method = RequestMethod.GET)
    public ModelAndView getBuildingEditView(@PathVariable("id") long roomNumber){
        return new ModelAndView("building/building.edit", "building", buildingRepository.findOne(roomNumber));
    }

    /**
     * This method will create the building
     */
    @RequestMapping(value = "/building/create", method = RequestMethod.GET)
    public ModelAndView getNewBuildingView(){
        return new ModelAndView("building/building.create", "building", new Building());
    }

    /**
     * This method will save the buildings info and post it to the database
     * CRUD (create) - save building
     */
    @RequestMapping(value = "/building", method = RequestMethod.POST)
    public String submitBuilding(@Valid @ModelAttribute("building")Building building,
                                  BindingResult result, ModelMap model) {
        if (result.hasErrors()) return "error";
        buildingRepository.save(building);
        return "redirect:/building";
    }

    /**
     * This method will save the selected building info and post it to the database
     * CRUD (create) - save building
     * Explicitly set the roomNumber of the building from the path.
     * The roomNumber does not get bounded to the HTML form view and returned.
     */
    @RequestMapping(value = "/building/{id}", method = RequestMethod.POST)
    public String editBuilding(@Valid @ModelAttribute("building")Building building,
                                BindingResult result, ModelMap model, @PathVariable("id") long id) {
        if (result.hasErrors()) return "error";
        building.setId(id);
        buildingRepository.save(building);
        return "redirect:/building";
    }

    /**
     * This method will delete the selected building from the database
     * CRUD(delete) - delete building
     */    
    @RequestMapping(value = "/building/{id}/delete", method = RequestMethod.GET)
    public String deleteBuilding(@PathVariable("id") long id) {
    	buildingRepository.delete(id);
        return "redirect:/building";
    }
}
