//Written by Eric Kearney, with help of Jesus Guzman on, 6, Dec. 2017
//Thanks to these awesome folks at Stackoverflow for helping me solve this problem:
//https://stackoverflow.com/questions/5774349/how-to-unit-test-a-spring-mvc-annotated-controller
//https://stackoverflow.com/questions/14486710/java-lang-nullpointerexception-when-i-run-my-unit-test-mockito
package com.msubanner.spring.msubannerspring.course;

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

public class CourseControllerTest {
    @Mock
    private CourseRepository testCourseRepository;

    @InjectMocks
    CourseController testCourseController = new CourseController();

    private MockMvc mockMvc;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(testCourseController).build();
    }

    @Test
    @RequestMapping(value = "/courses", method = RequestMethod.GET)
    public void testCourseControllerGetCourseView() {
        ModelAndView mav = testCourseController.getCourseView();
        Assert.assertEquals("courses/index", mav.getViewName());
    }


    @Test
    public void testCourseControllerGetCourseInfoView(){
        ModelAndView mav = testCourseController.getCourseInfoView(0);
        Assert.assertEquals("courses/course.show", mav.getViewName());
    }

    @Test
    public void testCourseControllerGetCourseEditView(){
        ModelAndView mav = testCourseController.getCourseEditView(0);
        Assert.assertEquals("courses/course.edit", mav.getViewName());
    }

    @Test
    public void testCourseControllerGetNewCourseView(){
        ModelAndView mav = testCourseController.getNewCourseView();
        Assert.assertEquals("courses/course.create", mav.getViewName());
    }

}