package com.msubanner.spring.msubannerspring.room;

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
 * This is the RoomController class.
 * @author Christian Kendall & ThienNgo
 * Based on Building Controller
 */
@Controller
public class RoomController {

    @Autowired
    private RoomRepository roomRepository;

    /**
     * This method will display all of the rooms in the database
     * CRUD(read) - roomRepository.findAll(id)
     */
    @RequestMapping(value = "/room", method = RequestMethod.GET)
    public ModelAndView getRoomView() {
        return new ModelAndView("room/index", "room", roomRepository.findAll());
    }

    /**
     * This method will display the rooms info
     * CRUD(read) - roomRepository.findOne(id)
     */
    @RequestMapping(value = "/room/{id}", method = RequestMethod.GET)
    public ModelAndView getRoomInfoView(@PathVariable("id") long roomNumber){
        return new ModelAndView("room/room.show", "room", roomRepository.findOne(roomNumber));
    }

    /**
     * This method will edit the rooms info
     * CRUD(read) - roomRepository.findOne(id)
     */
    @RequestMapping(value = "/room/{id}/edit", method = RequestMethod.GET)
    public ModelAndView getRoomEditView(@PathVariable("id") long roomNumber){
        return new ModelAndView("room/room.edit", "room", roomRepository.findOne(roomNumber));
    }

    /**
     * This method will create the room
     */
    @RequestMapping(value = "/room/create", method = RequestMethod.GET)
    public ModelAndView getNewRoomView(){
        return new ModelAndView("room/room.create", "room", new Room());
    }

    /**
     * This method will save the rooms info and post it to the database
     * CRUD (create) - save room
     */
    @RequestMapping(value = "/room", method = RequestMethod.POST)
    public String submitRoom(@Valid @ModelAttribute("room")Room room,
                                 BindingResult result, ModelMap model) {
        if (result.hasErrors()) return "error";
        roomRepository.save(room);
        return "redirect:/room";
    }

    /**
     * This method will save the selected room info and post it to the database
     * CRUD (create) - save room
     * Explicitly set the roomNumber of the room from the path.
     * The roomNumber does not get bounded to the HTML form view and returned.
     */
    @RequestMapping(value = "/room/{id}", method = RequestMethod.POST)
    public String editRoom(@Valid @ModelAttribute("room")Room room,
                               BindingResult result, ModelMap model, @PathVariable("id") long id) {
        if (result.hasErrors()) return "error";
        room.setId(id);
        roomRepository.save(room);
        return "redirect:/room";
    }

    /**
     * This method will delete the selected room from the database
     * CRUD(delete) - delete room
     */
    @RequestMapping(value = "/room/{id}/delete", method = RequestMethod.GET)
    public String deleteRoom(@PathVariable("id") long id) {
        roomRepository.delete(id);
        return "redirect:/room";
    }
}
