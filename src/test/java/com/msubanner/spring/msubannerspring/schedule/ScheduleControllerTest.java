package com.msubanner.spring.msubannerspring.schedule;

import com.msubanner.spring.msubannerspring.section.SectionRepository;
import com.msubanner.spring.msubannerspring.student.StudentRepository;
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

public class ScheduleControllerTest {
    @Mock
    private ScheduleRepository testScheduleRepository;
    private SectionRepository testSectionRepository;
    private StudentRepository testStudentRepository;

    @InjectMocks
    ScheduleController testScheduleController = new ScheduleController();

    private MockMvc mockMvc;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(testScheduleRepository).build();
        //this.mockMvc = MockMvcBuilders.standaloneSetup(testSectionRepository).build();
        //this.mockMvc = MockMvcBuilders.standaloneSetup(testStudentRepository).build();
    }

    @Test
    @RequestMapping(value = "/schedule", method = RequestMethod.GET)
    public void testScheduleControllerGetScheduleView() {
        ModelAndView mav = testScheduleController.getScheduleView();
        Assert.assertEquals("schedule/index", mav.getViewName());
    }

    @Test
    @RequestMapping(value = "/schedule/{id}", method = RequestMethod.GET)
    public void testScheduleControllerGetScheduleInfoView() {
        ModelAndView mav = testScheduleController.getScheduleInfoView(0);
        Assert.assertEquals("schedule/schedule.show", mav.getViewName());
    }

    /*
    @Test
    @RequestMapping(value = "/schedule/{id}/edit", method = RequestMethod.GET)
    public void testScheduleControllerGetScheduleEditView() {
        ModelAndView mav = testScheduleController.getScheduleEditView(0);
        Assert.assertEquals("schedule/schedule.edit", mav.getViewName());
    }

    @Test
    @RequestMapping(value = "/schedule/create", method = RequestMethod.GET)
    public void testScheduleControllerGetNewScheduleView() {
        ModelAndView mav = testScheduleController.getNewScheduleView();
        Assert.assertEquals("schedule/schedule.create", mav.getViewName());
    }
    */
}