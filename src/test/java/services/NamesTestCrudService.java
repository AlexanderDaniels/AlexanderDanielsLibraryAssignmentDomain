/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import com.alex.tp.libraryassignment.model.Names;
import com.alex.tp.libraryassignment.services.crud.NamesCrudService;
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
public class NamesTestCrudService {
    
    @Mock
    NamesCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(NamesCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        Names names = new Names.NamesBuilder("1").firstName("Alex").lastName("Daniels").build();
        Names returnNames = crudService.persist(names);
        when(crudService.persist(names)).thenReturn(returnNames);
        Mockito.verify(crudService).persist(names);


    }

    @Test
    public void testRead() throws Exception {
        Names names = new Names.NamesBuilder("1").firstName("Alex").lastName("Daniels").build();
        Names returnNames = crudService.find(names.getId());
        when(crudService.find(names.getId())).thenReturn(returnNames);
        Mockito.verify(crudService).find(names.getId());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

        Names names = new Names.NamesBuilder("1").firstName("Alex").lastName("Daniels").build();
        Names newN = new Names.NamesBuilder("1").names(names)
                .firstName("Alexander")
                .build();
        names = crudService.merge(newN);
        when(crudService.merge(newN)).thenReturn(names);
        Mockito.verify(crudService).merge(newN);

    }

    @Test
    public void testDelete() throws Exception {

        Names names = new Names.NamesBuilder("1").firstName("Alex").lastName("Daniels").build();
        Names returnNames = crudService.remove(names);
        when(crudService.remove(names)).thenReturn(returnNames);
        Mockito.verify(crudService).remove(names);

    }
}