/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import com.alex.tp.libraryassignment.model.LendBooks;
import com.alex.tp.libraryassignment.services.crud.LendBooksCrudService;
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
public class LendBooksTestCrudService {
    
    @Mock
    LendBooksCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(LendBooksCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        LendBooks lendBooks = new LendBooks.LendBookBuilder("1").bookName("Harry Potter").membershipNum("123Alex").build();
        LendBooks returnLendBooks = crudService.persist(lendBooks);
        when(crudService.persist(lendBooks)).thenReturn(returnLendBooks);
        Mockito.verify(crudService).persist(lendBooks);


    }

    @Test
    public void testRead() throws Exception {
        LendBooks lendBooks = new LendBooks.LendBookBuilder("1").bookName("Harry Potter").membershipNum("123Alex").build();
        LendBooks returnLendBooks = crudService.find(lendBooks.getId());
        when(crudService.find(lendBooks.getId())).thenReturn(returnLendBooks);
        Mockito.verify(crudService).find(lendBooks.getId());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

        LendBooks lendBooks = new LendBooks.LendBookBuilder("1").bookName("Harry Potter").membershipNum("123Alex").build();

        LendBooks returnLendBooks = crudService.merge(lendBooks);
        when(crudService.merge(lendBooks)).thenReturn(returnLendBooks);
        Mockito.verify(crudService).merge(lendBooks);

    }

    @Test
    public void testDelete() throws Exception {

        LendBooks lendBooks = new LendBooks.LendBookBuilder("1").bookName("Harry Potter").membershipNum("123Alex").build();
        LendBooks returnLendBooks = crudService.remove(lendBooks);
        when(crudService.remove(lendBooks)).thenReturn(returnLendBooks);
        Mockito.verify(crudService).remove(lendBooks);

    }
}