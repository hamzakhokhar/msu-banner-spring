package com.msubanner.spring.msubannerspring.semester;

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

public class SemesterControllerTest {
    @Mock
    private SemesterRepository testSemesterRepository;

    @InjectMocks
    SemesterController testSemesterController = new SemesterController();

    private MockMvc mockMvc;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(testSemesterController).build();
    }

    @Test
    @RequestMapping(value = "/semester", method = RequestMethod.GET)
    public void testSemesterControllerGetSemesterView() {
        ModelAndView mav = testSemesterController.getSemesterView();
        Assert.assertEquals("semester/index", mav.getViewName());
    }

    @Test
    @RequestMapping(value = "/semester/{id}", method = RequestMethod.GET)
    public void testSemesterControllerGetSemesterInfoView() {
        ModelAndView mav = testSemesterController.getSemesterInfoView(0);
        Assert.assertEquals("semester/semester.show", mav.getViewName());
    }

    @Test
    @RequestMapping(value = "/semester/{id}/edit", method = RequestMethod.GET)
    public void testSemesterControllerGetSemesterEditView() {
        ModelAndView mav = testSemesterController.getSemesterEditView(0);
        Assert.assertEquals("semester/semester.edit", mav.getViewName());
    }

    @Test
    @RequestMapping(value = "/semester/create", method = RequestMethod.GET)
    public void testSemesterControllerGetNeweSemesterView() {
        ModelAndView mav = testSemesterController.getNewSemesterView();
        Assert.assertEquals("semester/semester.create", mav.getViewName());
    }
}