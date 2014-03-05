/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.test;

import com.alex.tp.libraryassignment.model.Librarian;
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
public class LibrarianTestNGTest {
    
    public LibrarianTestNGTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void createLibrarian() {
        Librarian l = new Librarian.LibrarianBuilder("1").levelOfLiteracy("High").build();
        Assert.assertEquals(l.getId(), "1");
        Assert.assertEquals(l.getLevelOfLiteracy(), "High");
    }
    
    @Test
    public void updateLibrarian() {
        Librarian l = new Librarian.LibrarianBuilder("1").levelOfLiteracy("High").build();
        Librarian newl = new Librarian.LibrarianBuilder("1").librarian(l).levelOfLiteracy("Average").build();
        
        Assert.assertNotSame(newl, l);        
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