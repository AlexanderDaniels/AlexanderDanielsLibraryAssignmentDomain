/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.test;

import com.alex.tp.libraryassignment.model.CalculateFine;
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
public class CalculateFineTestNGTest {
    
    public CalculateFineTestNGTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void createCalculateFine() {
        CalculateFine c = new CalculateFine.CalculateFineBuilder("1")
                .amount(20.00)
                .daysLate(4)
                .build();
        
        Assert.assertEquals(c.getDaysLate(), 4);
    }
    
    @Test
    public void updateCalculateFine(){
        CalculateFine c = new CalculateFine.CalculateFineBuilder("1")
                .amount(20.00)
                .daysLate(4)
                .build();
        
        CalculateFine newC = new CalculateFine.CalculateFineBuilder("1").calculateFine(c)
                .amount(10.00)
                .daysLate(2)
                .build();
        
        Assert.assertNotSame(c, newC);
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