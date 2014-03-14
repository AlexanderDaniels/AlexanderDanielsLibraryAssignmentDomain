/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import com.alex.tp.libraryassignment.model.VisualMaterial;
import com.alex.tp.libraryassignment.services.crud.VisualMaterialCrudService;
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
public class VisualMaterialTestCrudService {
    
    @Mock
    VisualMaterialCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(VisualMaterialCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        VisualMaterial visualMaterial = new VisualMaterial.VisualMaterialBuilder("1").nameOfVisualMaterial("How stuff works").typeOfVisualMaterial("DVD").build();
        VisualMaterial returnVisualMaterial = crudService.persist(visualMaterial);
        when(crudService.persist(visualMaterial)).thenReturn(returnVisualMaterial);
        Mockito.verify(crudService).persist(visualMaterial);


    }

    @Test
    public void testRead() throws Exception {
        VisualMaterial visualMaterial = new VisualMaterial.VisualMaterialBuilder("1").nameOfVisualMaterial("How stuff works").typeOfVisualMaterial("DVD").build();
        VisualMaterial returnVisualMaterial = crudService.find(visualMaterial.getId());
        when(crudService.find(visualMaterial.getId())).thenReturn(returnVisualMaterial);
        Mockito.verify(crudService).find(visualMaterial.getId());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

        VisualMaterial visualMaterial = new VisualMaterial.VisualMaterialBuilder("1").nameOfVisualMaterial("How stuff works").typeOfVisualMaterial("DVD").build();
        VisualMaterial newV = new VisualMaterial.VisualMaterialBuilder("1").visualMaterial(visualMaterial)
                .nameOfVisualMaterial("How stuff works")
                .typeOfVisualMaterial("Blu-ray")
                .build();
        visualMaterial = crudService.merge(newV);
        when(crudService.merge(newV)).thenReturn(visualMaterial);
        Mockito.verify(crudService).merge(newV);

    }

    @Test
    public void testDelete() throws Exception {

        VisualMaterial visualMaterial = new VisualMaterial.VisualMaterialBuilder("1").nameOfVisualMaterial("How stuff works").typeOfVisualMaterial("DVD").build();
        VisualMaterial returnVisualMaterial = crudService.remove(visualMaterial);
        when(crudService.remove(visualMaterial)).thenReturn(returnVisualMaterial);
        Mockito.verify(crudService).remove(visualMaterial);

    }
}