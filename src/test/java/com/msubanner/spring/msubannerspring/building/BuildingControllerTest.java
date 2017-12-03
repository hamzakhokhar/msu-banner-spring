//Building controller tests, written by Eric Kearney on 21. Nov. 2017
//This video helped me write these tests: https://www.youtube.com/watch?v=HsQ9OwKA79s&t=952s
package com.msubanner.spring.msubannerspring.building;

import static javafx.scene.input.KeyCode.T;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.ModelAndViewAssert.assertViewName;

import org.junit.Before;
import org.junit.Test;
import org.mockito.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class BuildingControllerTest {

    BuildingController testBuildingController = Mockito.mock(BuildingController.class);
    BuildingRepository testBuildingRepository = Mockito.mock(BuildingRepository.class);
    Building testBuilding = new Building();

    @Test
    public void testGetBuildingIndex(){
        when(testBuildingController.getBuildingView()).thenReturn(new ModelAndView("building/index"));
        assertViewName(testBuildingController.getBuildingView(), "building/index");
    }


    @Test
    public void testGetBuildingInfoView(){
        when(testBuildingController.getBuildingInfoView(42L)).thenReturn(new ModelAndView("building/building.show"));
        assertViewName(testBuildingController.getBuildingInfoView(42L), "building/building.show");
    }

    @Test
    public void testGetBuildingEditView(){
        when(testBuildingController.getBuildingEditView(43L)).thenReturn(new ModelAndView("building/building.edit"));
        assertViewName(testBuildingController.getBuildingEditView(43L), "building/building.edit");
    }


    @Test
    public void testGetNewBuildingView(){
        when(testBuildingController.getNewBuildingView()).thenReturn(new ModelAndView("building/building.create"));
        assertViewName(testBuildingController.getNewBuildingView(), "building/building.create");
    }
}