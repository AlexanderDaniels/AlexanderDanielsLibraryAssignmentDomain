/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import com.alex.tp.libraryassignment.model.Magazines;
import com.alex.tp.libraryassignment.services.crud.MagazinesCrudService;
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
public class MagazinesTestCrudService {
    
    @Mock
    MagazinesCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(MagazinesCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        Magazines magazines = new Magazines.MagazinesBuilder("1").magName("Men's Health").numOfPages(101).build();
        Magazines returnMagazines = crudService.persist(magazines);
        when(crudService.persist(magazines)).thenReturn(returnMagazines);
        Mockito.verify(crudService).persist(magazines);


    }

    @Test
    public void testRead() throws Exception {
        Magazines magazines = new Magazines.MagazinesBuilder("1").magName("Men's Health").numOfPages(101).build();
        Magazines returnMagazines = crudService.find(magazines.getId());
        when(crudService.find(magazines.getId())).thenReturn(returnMagazines);
        Mockito.verify(crudService).find(magazines.getId());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

        Magazines magazines = new Magazines.MagazinesBuilder("1").magName("Men's Health").numOfPages(101).build();

        Magazines returnMagazines = crudService.merge(magazines);
        when(crudService.merge(magazines)).thenReturn(returnMagazines);
        Mockito.verify(crudService).merge(magazines);

    }

    @Test
    public void testDelete() throws Exception {

        Magazines magazines = new Magazines.MagazinesBuilder("1").magName("Men's Health").numOfPages(101).build();
        Magazines returnMagazines = crudService.remove(magazines);
        when(crudService.remove(magazines)).thenReturn(returnMagazines);
        Mockito.verify(crudService).remove(magazines);

    }
}