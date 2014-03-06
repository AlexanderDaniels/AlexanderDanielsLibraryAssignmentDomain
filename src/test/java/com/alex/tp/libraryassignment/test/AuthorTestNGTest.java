/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.test;

import com.alex.tp.libraryassignment.model.Author;
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
public class AuthorTestNGTest {
    
    public AuthorTestNGTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void createAuthor() {
        Author a = new Author.AuthorBuilder("1")
                .authorName("Alex")
                .authorSurname("Titanium")
                .build();
        
        Assert.assertEquals(a.getAuthorName(), "Alex");
    }
    
    @Test
    public void updateAuthor() {
        Author a = new Author.AuthorBuilder("1")
                .authorName("Alex")
                .authorSurname("Titanium")
                .build();
        
        Author newA = new Author.AuthorBuilder("1").author(a)
                .authorSurname("Daniels")
                .build();
        
        Assert.assertNotSame(a, newA);
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