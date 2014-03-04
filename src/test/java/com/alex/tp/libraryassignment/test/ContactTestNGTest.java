/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.test;

import com.alex.tp.libraryassignment.app.config.ContactAppConfig;
import com.alex.tp.libraryassignment.model.Contact;
import com.alex.tp.libraryassignment.services.ContactService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
    
    private static ApplicationContext ctx;
    private static ContactService con;
    
    public ContactTestNGTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void createContact() {               
        Assert.assertNotNull(con.createContact());
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
        
        Assert.assertNotSame(con.createContact(), newContact);
        
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ContactAppConfig.class);
        con = (ContactService)ctx.getBean("contact");
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