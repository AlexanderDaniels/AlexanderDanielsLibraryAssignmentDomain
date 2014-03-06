/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.test;

import com.alex.tp.libraryassignment.model.Authentication;
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
public class AuthenticationTestNGTest {
    
    public AuthenticationTestNGTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void createAuthentication() {
        Authentication a = new Authentication.AuthenticationBuilder("1")
                .username("Alex")
                .password("qwerty")
                .build();
        
        Assert.assertEquals(a.getUsername(), "Alex");
        Assert.assertEquals(a.getPassword(), "qwerty");
    }    
    
    @Test
    public void updateAuthentication() {
        Authentication a = new Authentication.AuthenticationBuilder("1")
                .username("Alex")
                .password("qwerty")
                .build();
        
        Authentication newA = new Authentication.AuthenticationBuilder("1").authentication(a)
                .password("I love TP")
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