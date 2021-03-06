/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.test;

import com.alex.tp.libraryassignment.model.LibraryMembers;
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
public class LibraryMembersTestNGTest {
    
    public LibraryMembersTestNGTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void createLibraryMembers() {
        LibraryMembers l = new LibraryMembers.LibraryMembersBuilder("1")
                .membershipNum("12345678Alex")
                .build();
        
        Assert.assertEquals(l.getMembershipNum(), "12345678Alex");
    }

    @Test
    public void updateLibraryMembers() {
        LibraryMembers l = new LibraryMembers.LibraryMembersBuilder("1")
                .membershipNum("12345678Alex")
                .build();
        
        LibraryMembers newL = new LibraryMembers.LibraryMembersBuilder("1").librarian(l)
                .membershipNum("1234Alex")
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