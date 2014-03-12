/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import com.alex.tp.libraryassignment.model.CalculateFine;
import com.alex.tp.libraryassignment.services.crud.CalculateFineCrudService;
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
public class CalculateFineTestCrudService {
    
    @Mock
    CalculateFineCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(CalculateFineCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        CalculateFine calcFine = new CalculateFine.CalculateFineBuilder("1").amount(20.00).daysLate(4).build();
        CalculateFine returnCalculateFine = crudService.persist(calcFine);
        when(crudService.persist(calcFine)).thenReturn(returnCalculateFine);
        Mockito.verify(crudService).persist(calcFine);


    }

    @Test
    public void testRead() throws Exception {
        CalculateFine calcFine = new CalculateFine.CalculateFineBuilder("1").amount(20.00).daysLate(4).build();
        CalculateFine returnCalculateFine = crudService.find(calcFine.getId());
        when(crudService.find(calcFine.getId())).thenReturn(returnCalculateFine);
        Mockito.verify(crudService).find(calcFine.getId());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

        CalculateFine calcFine = new CalculateFine.CalculateFineBuilder("1").amount(20.00).daysLate(4).build();

        CalculateFine returnCalculateFine = crudService.merge(calcFine);
        when(crudService.merge(calcFine)).thenReturn(returnCalculateFine);
        Mockito.verify(crudService).merge(calcFine);

    }

    @Test
    public void testDelete() throws Exception {

        CalculateFine calcFine = new CalculateFine.CalculateFineBuilder("1").amount(20.00).daysLate(4).build();
        CalculateFine returnCalculateFine = crudService.remove(calcFine);
        when(crudService.remove(calcFine)).thenReturn(returnCalculateFine);
        Mockito.verify(crudService).remove(calcFine);

    }
}