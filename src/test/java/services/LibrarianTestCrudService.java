/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import com.alex.tp.libraryassignment.model.Librarian;
import com.alex.tp.libraryassignment.services.crud.LibrarianCrudService;
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
public class LibrarianTestCrudService {
    
    @Mock
    LibrarianCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(LibrarianCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        Librarian librarian = new Librarian.LibrarianBuilder("1").levelOfLiteracy("High").build();
        Librarian returnLibrarian = crudService.persist(librarian);
        when(crudService.persist(librarian)).thenReturn(returnLibrarian);
        Mockito.verify(crudService).persist(librarian);


    }

    @Test
    public void testRead() throws Exception {
        Librarian librarian = new Librarian.LibrarianBuilder("1").levelOfLiteracy("High").build();
        Librarian returnLibrarian = crudService.find(librarian.getId());
        when(crudService.find(librarian.getId())).thenReturn(returnLibrarian);
        Mockito.verify(crudService).find(librarian.getId());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

        Librarian librarian = new Librarian.LibrarianBuilder("1").levelOfLiteracy("High").build();

        Librarian returnLibrarian = crudService.merge(librarian);
        when(crudService.merge(librarian)).thenReturn(returnLibrarian);
        Mockito.verify(crudService).merge(librarian);

    }

    @Test
    public void testDelete() throws Exception {

        Librarian librarian = new Librarian.LibrarianBuilder("1").levelOfLiteracy("High").build();
        Librarian returnLibrarian = crudService.remove(librarian);
        when(crudService.remove(librarian)).thenReturn(returnLibrarian);
        Mockito.verify(crudService).remove(librarian);

    }
}