/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import com.alex.tp.libraryassignment.model.Demographics;
import com.alex.tp.libraryassignment.services.crud.DemographicsCrudService;
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
public class DemographicsTestCrudService {
    
    @Mock
    DemographicsCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(DemographicsCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        Demographics demo = new Demographics.DemographicsBuilder("1").gender("male").race("white").build();
        Demographics returnDemographics = crudService.persist(demo);
        when(crudService.persist(demo)).thenReturn(returnDemographics);
        Mockito.verify(crudService).persist(demo);


    }

    @Test
    public void testRead() throws Exception {
        Demographics demo = new Demographics.DemographicsBuilder("1").gender("male").race("white").build();
        Demographics returnDemographics = crudService.find(demo.getId());
        when(crudService.find(demo.getId())).thenReturn(returnDemographics);
        Mockito.verify(crudService).find(demo.getId());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

        Demographics demo = new Demographics.DemographicsBuilder("1").gender("male").race("white").build();

        Demographics returnDemographics = crudService.merge(demo);
        when(crudService.merge(demo)).thenReturn(returnDemographics);
        Mockito.verify(crudService).merge(demo);

    }

    @Test
    public void testDelete() throws Exception {

        Demographics demo = new Demographics.DemographicsBuilder("1").gender("male").race("white").build();
        Demographics returnDemographics = crudService.remove(demo);
        when(crudService.remove(demo)).thenReturn(returnDemographics);
        Mockito.verify(crudService).remove(demo);

    }
}