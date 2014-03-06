/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.test;

import com.alex.tp.libraryassignment.model.Journals;
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
public class JournalsTestNGTest {
    
    public JournalsTestNGTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void createJournals() {
        Journals j = new Journals.JournalsBuilder("1")
                .journalName("How stuff works")
                .numOfPages(52)
                .build();
        
        Assert.assertEquals(j.getNumOfPages(), 52);
    }
    
    @Test
    public void updateJournals(){
        Journals j = new Journals.JournalsBuilder("1")
                .journalName("How stuff works")
                .numOfPages(52)
                .build();
        
        Journals newJ = new Journals.JournalsBuilder("1").journals(j)
                .journalName("How stuff REALY works")
                .build();
        
        Assert.assertNotSame(j, newJ);
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