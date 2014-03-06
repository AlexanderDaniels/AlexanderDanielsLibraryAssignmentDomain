/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.test;

import com.alex.tp.libraryassignment.model.PayBill;
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
public class PayBillTestNGTest {
    
    public PayBillTestNGTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void createPayBill() {
        PayBill p = new PayBill.PayBillBuilder("1")
                .billNo("123abc")
                .amount(200.00)
                .build();
        
        Assert.assertEquals(p.getBillNo(), "123abc");
    }
    
    @Test
    public void updatePayBill() {
        PayBill p = new PayBill.PayBillBuilder("1")
                .billNo("123abc")
                .amount(200.00)
                .build();
        
        PayBill newP = new PayBill.PayBillBuilder("1").payBill(p)
                .billNo("123qwerty")
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