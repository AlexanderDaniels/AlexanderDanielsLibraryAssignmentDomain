/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.test;

import com.alex.tp.libraryassignment.model.Names;
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
public class NamesTestNGTest {
    
    public NamesTestNGTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void createNames() {
        Names n = new Names.NamesBuilder("1")
                .firstName("Alex")
                .lastName("Daniels")
                .build();
        
        Assert.assertEquals(n.getFirstName(),"Alex");
    }
    
    @Test
    public void updateNames() {
        Names n = new Names.NamesBuilder("1")
                .firstName("Alex")
                .lastName("Daniels")
                .build();
        
        Names newN = new Names.NamesBuilder("1").names(n)
                .firstName("Alexander")
                .build();
        
        Assert.assertNotSame(n, newN);
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