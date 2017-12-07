//Tests for the controller of the Professor class, written by Eric Kearney on 6, Dec. 2017
package com.msubanner.spring.msubannerspring.professor;

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

public class ProfessorControllerTest {
    @Mock
    private ProfessorRepository testProfessorRepository;

    @InjectMocks
    ProfessorController testProfessorController = new ProfessorController();

    private MockMvc mockMvc;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(testProfessorController).build();
    }

    @Test
    @RequestMapping(value = "/professor", method = RequestMethod.GET)
    public void setTestProfessorControllerGetProfessorView() {
        ModelAndView mav = testProfessorController.getProfessorView();
        Assert.assertEquals("professor/index", mav.getViewName());
    }

    @Test
    @RequestMapping(value = "/professor/{id}", method = RequestMethod.GET)
    public void setTestProfessorControllerGetProfessorInfoView() {
        ModelAndView mav = testProfessorController.getProfessorInfoView(0);
        Assert.assertEquals("professor/professor.show", mav.getViewName());
    }

    @Test
    @RequestMapping(value = "/professor/{id}/edit", method = RequestMethod.GET)
    public void setTestProfessorControllerGetProfessorEditView() {
        ModelAndView mav = testProfessorController.getProfessorEditView(0);
        Assert.assertEquals("professor/professor.edit", mav.getViewName());
    }

    @Test
    @RequestMapping(value = "/professor/create", method = RequestMethod.GET)
    public void setTestProfessorControllerGetNewProfessorView() {
        ModelAndView mav = testProfessorController.getNewProfessorView();
        Assert.assertEquals("professor/professor.create", mav.getViewName());
    }
}