//Tests for the building controller class, written by Eric Kearney on 6. Dec. 2017
package com.msubanner.spring.msubannerspring.building;

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

public class BuildingControllerTest {
    @Mock
    private BuildingRepository testBuildingRepository;

    @InjectMocks
    BuildingController testBuildingController = new BuildingController();

    private MockMvc mockMvc;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(testBuildingController).build();
    }

    @Test
    @RequestMapping(value = "/building", method = RequestMethod.GET)
    public void testBuildingControllerGetBuildingView() {
        ModelAndView mav = testBuildingController.getBuildingView();
        Assert.assertEquals("building/index", mav.getViewName());
    }

    @Test
    @RequestMapping(value = "/building/{id}", method = RequestMethod.GET)
    public void testBuildingControllerGetBuildingInfoView() {
        ModelAndView mav = testBuildingController.getBuildingInfoView(0);
        Assert.assertEquals("building/building.show", mav.getViewName());
    }

    @Test
    @RequestMapping(value = "/building/{id}/edit", method = RequestMethod.GET)
    public void testBuildingControllerGetBuildingEditView() {
        ModelAndView mav = testBuildingController.getBuildingEditView(0);
        Assert.assertEquals("building/building.edit", mav.getViewName());
    }

    @Test
    @RequestMapping(value = "/building/create", method = RequestMethod.GET)
    public void testBuildingControllerGetNewBuildingView() {
        ModelAndView mav = testBuildingController.getNewBuildingView();
        Assert.assertEquals("building/building.create", mav.getViewName());
    }
}