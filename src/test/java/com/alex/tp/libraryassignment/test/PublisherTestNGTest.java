/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.test;

import com.alex.tp.libraryassignment.model.Publisher;
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
public class PublisherTestNGTest {
    
    public PublisherTestNGTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void createPublisher() {
        Publisher p = new Publisher.PublisherBuilder("1")
                .publisherName("HottenTot")
                .publisherAddress("12 Church Street")
                .build();
        
        Assert.assertEquals(p.getPublisherName(), "HottenTot");
                
    }
    
    @Test
    public void updatePublisher() {
        Publisher p = new Publisher.PublisherBuilder("1")
                .publisherName("HottenTot")
                .publisherAddress("12 Church Street")
                .build();
        
        Publisher newP = new Publisher.PublisherBuilder("1").publisher(p)
                .publisherName("HottenTots")
                .build();
        
        Assert.assertNotSame(p, newP);
        
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