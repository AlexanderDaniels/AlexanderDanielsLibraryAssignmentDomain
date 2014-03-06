/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.test;

import com.alex.tp.libraryassignment.model.VisualMaterial;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Alex
 */
public class VisualMaterialTestNGTest {
    
    public VisualMaterialTestNGTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void createVisualMaterial() {
        VisualMaterial v = new VisualMaterial.VisualMaterialBuilder("1")
                .nameOfVisualMaterial("How stuff works")
                .typeOfVisualMaterial("DVD")
                .build();
        
        Assert.assertEquals(v.getNameOfVisualMaterial(),"How stuff works");
    }
    
    @Test
    public void updateVisualMaterial() {
        VisualMaterial v = new VisualMaterial.VisualMaterialBuilder("1")
                .nameOfVisualMaterial("How stuff works")
                .typeOfVisualMaterial("DVD")
                .build();
        
        VisualMaterial newV = new VisualMaterial.VisualMaterialBuilder("1").visualMaterial(v)
                .nameOfVisualMaterial("How stuff works")
                .typeOfVisualMaterial("Blu-ray")
                .build();
        
        Assert.assertNotSame(v, newV);
    
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