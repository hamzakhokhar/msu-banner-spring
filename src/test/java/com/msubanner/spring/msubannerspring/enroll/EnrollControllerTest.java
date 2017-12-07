//Tests for the Enroll controller class, written by Eric Kearney on 6, Dec. 2017
package com.msubanner.spring.msubannerspring.enroll;

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

public class EnrollControllerTest {
    @Mock
    private EnrollRepository testEnrollRepositry;

    @InjectMocks
    EnrollController testEnrollController = new EnrollController();

    private MockMvc mockMvc;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(testEnrollController).build();
    }

    @Test
    @RequestMapping(value = "/enroll", method = RequestMethod.GET)
    public void testEnrollControllerGetEnrollView() {
        ModelAndView mav = testEnrollController.getEnrollView();
        Assert.assertEquals("enroll/index", mav.getViewName());
    }

    @Test
    @RequestMapping(value = "/enroll/{id}", method = RequestMethod.GET)
    public void testEnrollControllerGetEnrollInfoView() {
        ModelAndView mav = testEnrollController.getEnrollInfoView(0);
        Assert.assertEquals("enroll/enroll.show", mav.getViewName());
    }
}