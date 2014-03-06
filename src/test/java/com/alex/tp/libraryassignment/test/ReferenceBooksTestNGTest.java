/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.test;

import com.alex.tp.libraryassignment.model.ReferenceBooks;
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
public class ReferenceBooksTestNGTest {
    
    public ReferenceBooksTestNGTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void createReferenceBooks() {
        ReferenceBooks r = new ReferenceBooks.ReferenceBooksBuilder("1")
                .bookName("Harry Potter")
                .refBookype("Encyclopedia")
                .build();
        
        Assert.assertEquals(r.getBookName(), "Harry Potter");
    }
    
    @Test
    public void updateReferenceBooks(){
        ReferenceBooks r = new ReferenceBooks.ReferenceBooksBuilder("1")
                .bookName("Harry Potter")
                .refBookype("Encyclopedia")
                .build();
        
        ReferenceBooks newR = new ReferenceBooks.ReferenceBooksBuilder("1").referenceBooks(r)
                .bookName("The Avengers")
                .build();
        
        Assert.assertNotSame(r, newR);
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