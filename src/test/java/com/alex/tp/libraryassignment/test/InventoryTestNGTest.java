/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.test;

import com.alex.tp.libraryassignment.model.Inventory;
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
public class InventoryTestNGTest {
    
    public InventoryTestNGTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void createInventory() {
        Inventory i = new Inventory.InventoryBuilder("1")
                .bookName("Harry Potter")
                .numBook(10)
                .build();
        
        Assert.assertEquals(i.getNumBook(), 10);
                
    }

    @Test
    public void updateInventory() {
        Inventory i = new Inventory.InventoryBuilder("1")
                .bookName("Harry Potter")
                .numBook(10)
                .build();
        
        Inventory newI = new Inventory.InventoryBuilder("1").inventory(i)
                .numBook(20)
                .build();
        
        Assert.assertNotSame(i, newI);
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