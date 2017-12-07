package com.msubanner.spring.msubannerspring.section;

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

public class SectionControllerTest {
    @Mock
    private SectionRepository testSectionRepository;

    @InjectMocks
    SectionController testSectionController = new SectionController();

    private MockMvc mockMvc;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(testSectionController).build();
    }

    @Test
    @RequestMapping(value = "/sections", method = RequestMethod.GET)
    public void testSectionControllerGetSectionView() {
        ModelAndView mav = testSectionController.getSectionView();
        Assert.assertEquals("sections/index", mav.getViewName());
    }

    @Test
    @RequestMapping(value = "/sections/{id}", method = RequestMethod.GET)
    public void testSectionControllerGetSectionInfoView() {
        ModelAndView mav = testSectionController.getSectionInfoView(0);
        Assert.assertEquals("sections/section.show", mav.getViewName());
    }

    /*
    @Test
    @RequestMapping(value = "/sections/{id}/edit", method = RequestMethod.GET)
    public void testSectionControllerGetSectionEditView() {
        ModelAndView mav = testSectionController.getSectionEditView(0);
        Assert.assertEquals("sections/section.edit", mav.getViewName());
    }

    @Test
    @RequestMapping(value = "/sections/create", method = RequestMethod.GET)
    public void testSectionControllerGetNewSectionView() {
        ModelAndView mav = testSectionController.getNewSectionView();
        Assert.assertEquals("sections/section.create", mav.getViewName());
    }
    */
}