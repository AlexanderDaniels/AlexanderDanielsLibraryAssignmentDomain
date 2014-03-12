/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import com.alex.tp.libraryassignment.model.Salary;
import com.alex.tp.libraryassignment.services.crud.SalaryCrudService;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
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
public class SalaryTestCrudService {
    
    @Mock
    SalaryCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(SalaryCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        Salary salary = new Salary.SalaryBuilder("1").baseSalary(20000.00).build();
        Salary returnSalary = crudService.persist(salary);
        when(crudService.persist(salary)).thenReturn(returnSalary);
        Mockito.verify(crudService).persist(salary);


    }

    @Test
    public void testRead() throws Exception {
        Salary salary = new Salary.SalaryBuilder("1").baseSalary(20000.00).build();
        Salary returnSalary = crudService.find(salary.getId());
        when(crudService.find(salary.getId())).thenReturn(returnSalary);
        Mockito.verify(crudService).find(salary.getId());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

        Salary salary = new Salary.SalaryBuilder("1").baseSalary(20000.00).build();

        Salary returnSalary = crudService.merge(salary);
        when(crudService.merge(salary)).thenReturn(returnSalary);
        Mockito.verify(crudService).merge(salary);

    }

    @Test
    public void testDelete() throws Exception {

        Salary salary = new Salary.SalaryBuilder("1").baseSalary(20000.00).build();
        Salary returnSalary = crudService.remove(salary);
        when(crudService.remove(salary)).thenReturn(returnSalary);
        Mockito.verify(crudService).remove(salary);

    }
}