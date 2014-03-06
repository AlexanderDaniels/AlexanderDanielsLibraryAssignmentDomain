/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.test;

import com.alex.tp.libraryassignment.model.Salary;
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
public class SalaryTestNGTest {
    
    public SalaryTestNGTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void createSalary() {
        Salary s = new Salary.SalaryBuilder("1")
                .baseSalary(20000.00)
                .build();
        
        Assert.assertEquals(s.getBaseSalary(), 25000.00, 10000.00);
    }
    
    @Test
    public void updateSalary() {
        Salary s = new Salary.SalaryBuilder("1")
                .baseSalary(20000.00)
                .build();
        
        Salary newS = new Salary.SalaryBuilder("1").salary(s)
                .baseSalary(25000.00)
                .build();
        
        Assert.assertNotSame(s, newS);
    
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