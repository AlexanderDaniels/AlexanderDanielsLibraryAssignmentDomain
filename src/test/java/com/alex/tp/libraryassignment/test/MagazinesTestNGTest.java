/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.test;

import com.alex.tp.libraryassignment.model.Magazines;
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
public class MagazinesTestNGTest {
    
    public MagazinesTestNGTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void createMagazines() {
        Magazines m = new Magazines.MagazinesBuilder("1")
                .magName("Men's Health")
                .numOfPages(101)
                .build();
        
        Assert.assertEquals(m.getNumOfPages(), 101);
    }

    @Test
    public void updateMagazines() {
        Magazines m = new Magazines.MagazinesBuilder("1")
                .magName("Men's Health")
                .numOfPages(101)
                .build();
        
        Magazines newM = new Magazines.MagazinesBuilder("1").magazines(m)
                .numOfPages(201)
                .build();
        
        assertNotSame(m, newM);
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