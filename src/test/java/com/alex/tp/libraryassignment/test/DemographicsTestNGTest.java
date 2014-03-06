/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.test;

import com.alex.tp.libraryassignment.model.Demographics;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Alex
 */
public class DemographicsTestNGTest {
    
    public DemographicsTestNGTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void createDemographics() {
        Demographics d = new Demographics.DemographicsBuilder("1")
                .gender("male")
                .race("white")
                .build();
        
        Assert.assertEquals(d.getGender(), "male");
    }
    
    @Test
    public void updateDemographics() {
        Demographics d = new Demographics.DemographicsBuilder("1")
                .gender("male")
                .race("white")
                .build();
        
        Demographics newD = new Demographics.DemographicsBuilder("1").demographics(d)
                .race("black")
                .build();
        
        Assert.assertNotSame(d, newD);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}