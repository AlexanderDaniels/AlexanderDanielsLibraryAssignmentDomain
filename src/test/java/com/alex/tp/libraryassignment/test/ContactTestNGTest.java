/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.test;

import com.alex.tp.libraryassignment.model.Contact;
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
public class ContactTestNGTest {
    
    public ContactTestNGTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void createContact() {               
        Contact contact = new Contact.ContactBuilder("1")
                .cellphone("0744402606")
                .email("apdaniels92@gmail.com")
                .telephone("0219520501")
                .build();
        
        Assert.assertEquals(contact.getTelephone(), "0219520501");
    }
    
    @Test
    public void updateContact() {
        Contact contact = new Contact.ContactBuilder("1")
                .cellphone("0744402606")
                .email("apdaniels92@gmail.com")
                .telephone("0219520501")
                .build();     
         
        Contact newContact = new Contact.ContactBuilder("1").contact(contact)
                .cellphone("0744402789")
                .build();
        
        Assert.assertNotSame(contact, newContact);
        
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