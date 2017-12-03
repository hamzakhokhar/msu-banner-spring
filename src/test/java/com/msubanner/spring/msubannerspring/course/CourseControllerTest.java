//Written by Eric Kearney, 19. Nov. 2017, looking at Team 2's tests helped me:
//https://github.com/wolfpack-cs3250/Sprint4/blob/master/src/test/java/com/banner/bannerApplication/controllers/CourseControllerTest.java
//this site also helped me: https://www.petrikainulainen.net/programming/spring-framework/unit-testing-of-spring-mvc-controllers-normal-controllers/
//this video also helped me: https://www.youtube.com/watch?v=taJb6doe6Ts
package com.msubanner.spring.msubannerspring.course;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

public class CourseControllerTest {
/*
    @Mock //Mockito Mock Object
    private CourseRepository courseRepository;

    @InjectMocks //setups the controller, and injects mock objects into it.
    private CourseController courseControler;
    private MockMvc mockMvc;

    public CourseControllerTest() {
    }

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this); //initializes controller and mocks

        mockMvc = MockMvcBuilders.standaloneSetup(courseControler).build();
    }

    @Test
    public void testList() throws Exception{

        List<Course> courses = new ArrayList<>();
        courses.add(new Course());
        courses.add(new Course());

        //specific Mockito interatction, tell stub to return lists of courses
        when(courseRepository.ListAll()).thenReturn((List) courses);

        mockMvc.perform(get("/courses"))
                .andExpect(status().isOk())
                .andExpect(view().name("/courses"))
                .andExpect(model().attribute("courses", hasSize(2)));
    }
    */
}