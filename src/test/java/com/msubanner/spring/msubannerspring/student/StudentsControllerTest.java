package com.msubanner.spring.msubannerspring.student;

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

public class StudentsControllerTest {
    @Mock
    private StudentRepository testStudentRepository;

    @InjectMocks
    StudentsController testStudentController = new StudentsController();

    private MockMvc mockMvc;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(testStudentController).build();
    }

    @Test
    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public void testStudentControllerGetStudentsView() {
        ModelAndView mav = testStudentController.getStudentsView();
        Assert.assertEquals("students/index", mav.getViewName());
    }

    @Test
    @RequestMapping(value = "/students/{id}", method = RequestMethod.GET)
    public void testStudentControllerGetStudentInfoView() {
        ModelAndView mav = testStudentController.getStudentInfoView(0);
        Assert.assertEquals("students/student.show", mav.getViewName());
    }

    @Test
    @RequestMapping(value = "/students/{id}/edit", method = RequestMethod.GET)
    public void testStudentControllerGetStudentEditView() {
        ModelAndView mav = testStudentController.getStudentEditView(0);
        Assert.assertEquals("students/student.edit", mav.getViewName());
    }

    @Test
    @RequestMapping(value = "/students/create", method = RequestMethod.GET)
    public void testStudentControllerGetNewStudentView() {
        ModelAndView mav = testStudentController.getNewStudentView();
        Assert.assertEquals("students/student.create", mav.getViewName());
    }
}