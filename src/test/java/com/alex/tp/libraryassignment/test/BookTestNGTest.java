/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.test;

import com.alex.tp.libraryassignment.model.Book;
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
public class BookTestNGTest {
    
    public BookTestNGTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void createBook() {
        Book b = new Book.BookBuilder("1")
                .bookName("Harry Potter")
                .isbnNum("80854hnfdfnuwer2342334")
                .build();
        
        Assert.assertEquals(b.getBookName(), "Harry Potter");
    }
    
    @Test
    public void updateBook() {
        Book b = new Book.BookBuilder("1")
                .bookName("Harry Potter")
                .isbnNum("80854hnfdfnuwer2342334")
                .build();
        
        Book newb = new Book.BookBuilder("1").book(b)
                .bookName("Amazing Alex")
                .build();
        
        Assert.assertNotSame(b, newb);
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