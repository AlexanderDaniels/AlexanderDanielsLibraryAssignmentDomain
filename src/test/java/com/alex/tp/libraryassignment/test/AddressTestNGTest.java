/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.test;

import com.alex.tp.libraryassignment.model.Address;
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
public class AddressTestNGTest {
    
    public AddressTestNGTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void createAddress() {
        Address a = new Address.AddressBuilder("1")
                .email("apdaniels92@gmail.com")
                .telephoneNum("021 486 3215")
                .cellphoneNum("061 486 4352")
                .build();
        Assert.assertEquals(a.getEmail(), "apdaniels92@gmail.com");
        
    }
    
    
    @Test
    public void updateAddress() {
        Address a = new Address.AddressBuilder("1")
                .email("apdaniels92@gmail.com")
                .telephoneNum("021 486 3215")
                .cellphoneNum("061 486 4352")
                .build();
        
        Address newA = new Address.AddressBuilder("1").address(a)
                .email("apdaniels@gmail.com")
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