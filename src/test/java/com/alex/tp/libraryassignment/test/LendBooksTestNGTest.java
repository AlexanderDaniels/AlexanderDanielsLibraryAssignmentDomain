/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.test;

import com.alex.tp.libraryassignment.model.LendBooks;
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
public class LendBooksTestNGTest {
    
    public LendBooksTestNGTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void createLendBooks() {
        LendBooks l = new LendBooks.LendBookBuilder("1")
                .bookName("Harry Potter")
                .membershipNum("123Alex")
                .build();
        
        Assert.assertEquals(l.getMembershipNum(),"123Alex");
    }
    
    @Test
    public void updateLendBooks() {
        LendBooks l = new LendBooks.LendBookBuilder("1")
                .bookName("Harry Potter")
                .membershipNum("123Alex")
                .build();
        
        LendBooks newL = new LendBooks.LendBookBuilder("1").lendBooks(l)
                .membershipNum("123Alexander")
                .build();
        
        Assert.assertNotSame(l, newL);
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