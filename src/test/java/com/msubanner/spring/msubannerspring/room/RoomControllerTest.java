//Tests for the controller of the Room class, written by Eric Kearney on 6, Dec. 2017
package com.msubanner.spring.msubannerspring.room;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class RoomControllerTest {
    @Mock
    private RoomRepository testRoomRepository;

    @InjectMocks
    RoomController testRoomControlleer = new RoomController();

    private MockMvc mockMvc;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(testRoomRepository).build();
    }

    @Test
    @RequestMapping(value = "/room", method = RequestMethod.GET)
    public void testRoomControllerGetRoomView() {
        ModelAndView mav = testRoomControlleer.getRoomView();
        Assert.assertEquals("room/index", mav.getViewName());
    }

    @Test
    @RequestMapping(value = "/room/{id}", method = RequestMethod.GET)
    public void testRoomControllerGetRoomInfoView() {
        ModelAndView mav = testRoomControlleer.getRoomInfoView(0);
        Assert.assertEquals("room/room.show", mav.getViewName());
    }

    @Test
    @RequestMapping(value = "/room/{id}/edit", method = RequestMethod.GET)
    public void testRoomControllerGetRoomEditView() {
        ModelAndView mav = testRoomControlleer.getRoomEditView(0);
        Assert.assertEquals("room/room.edit", mav.getViewName());
    }

    @Test
    @RequestMapping(value = "/room/create", method = RequestMethod.GET)
    public void testRoomControllerGetNewRoomView() {
        ModelAndView mav = testRoomControlleer.getNewRoomView();
        Assert.assertEquals("room/room.create", mav.getViewName());
    }
}