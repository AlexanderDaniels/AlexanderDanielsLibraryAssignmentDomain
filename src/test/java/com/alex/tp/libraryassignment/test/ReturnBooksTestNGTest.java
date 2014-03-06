/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.test;

import com.alex.tp.libraryassignment.model.ReturnBooks;
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
public class ReturnBooksTestNGTest {
    
    public ReturnBooksTestNGTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void createReturnBooks() {
        ReturnBooks r = new ReturnBooks.ReturnBooksBuilder("1")
                .bookName("123 Computers")
                .isbnNum("1234567890QWERTY")
                .build();
        
        Assert.assertEquals(r.getBookName(), "123 Computers");
    }
    
    @Test
    public void updateReturnBooks() {
        ReturnBooks r = new ReturnBooks.ReturnBooksBuilder("1")
                .bookName("123 Computers")
                .isbnNum("1234567890QWERTY")
                .build();
        
        ReturnBooks newR = new ReturnBooks.ReturnBooksBuilder("1").returnBook(r)
                .bookName("456 Cumputers")
                .build();
        
        assertNotSame(r, newR);
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