//The global variable class test, written by Eric Kearney on Oct. 24 2017
package com.msubanner.spring.msubannerspring.globalvariable;

import org.junit.Test;
import org.junit.Assert;

public class GlobalVariableTest {
    //Global variables are set to be constant, they can't be changed with setters
    //So why even have setters?
    GlobalVariable testGlobalVariables = new GlobalVariable();

    /**
     * Tests the ability to retrieve the school name
     */
    @Test
    public void testSCHOOLNAME(){
        String schoolName = "Why is our school's name so long?";
        testGlobalVariables.setSCHOOLNAME(schoolName);
        Assert.assertEquals("Metropolitan State University of Denver", testGlobalVariables.getSCHOOLNAME());
    }

    /**
     * Tests the ability to retrieve the credit value for Freshman
     */
    @Test
    public void testFRESHMAN(){
        //Credit max for freshman currently set to 29, and cannot be changed
        int testCredits = 6;
        testGlobalVariables.setFRESHMAN(testCredits);
        Assert.assertEquals(29, testGlobalVariables.getFRESHMAN());
    }

    /**
     * Tests the ability to retrieve the credit value for Sophomore
     */
    @Test
    public void testSOPHOMORE(){
        //Credit max for sophomore currently set to 59, and cannot be changed
        int testCredits = 49;
        testGlobalVariables.setSOPHOMORE(testCredits);
        Assert.assertEquals(59, testGlobalVariables.getSOPHOMORE());
    }

    /**
     * Tests the ability to retrieve the credit value for Junior
     */
    @Test
    public void testJUNIOR(){
        //Credit max for junior currently set to 89, and cannot be changed
        int testCredits = 106;
        testGlobalVariables.setJUNIOR(testCredits);
        Assert.assertEquals(89, testGlobalVariables.getJUNIOR());
    }

    /**
     * Tests the ability to retrieve the credit value for Senior
     */
    @Test
    public void testSENIOR(){
        //Credit max for senior currently set to 120, and cannot be changed
        int testCredits = 121;
        testGlobalVariables.setSENIOR(testCredits);
        Assert.assertEquals(120, testGlobalVariables.getSENIOR());
    }

    /**
     * Tests the ability to test a student's number of credits and determine which school
     * year they're currently in
     */
    @Test
    public void testFindSchoolYear(){
        int credits = 25;
        Assert.assertEquals("Freshmen", testGlobalVariables.findSchoolYear(credits));

        credits = 37;
        Assert.assertEquals("Sophomore", testGlobalVariables.findSchoolYear(credits));

        credits = 75;
        Assert.assertEquals("Junior", testGlobalVariables.findSchoolYear(credits));

        credits = 110;
        Assert.assertEquals("Senior", testGlobalVariables.findSchoolYear(credits));

        credits = 150;
        Assert.assertEquals("Graduate", testGlobalVariables.findSchoolYear(credits));
    }
}