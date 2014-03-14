/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import com.alex.tp.libraryassignment.model.ReturnBooks;
import com.alex.tp.libraryassignment.services.crud.ReturnBooksCrudService;
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
public class ReturnBooksTestCrudService {
    
    @Mock
    ReturnBooksCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(ReturnBooksCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        ReturnBooks returnBooks = new ReturnBooks.ReturnBooksBuilder("1").bookName("123 Computers").isbnNum("1234567890QWERTY").build();
        ReturnBooks returnReturnBooks = crudService.persist(returnBooks);
        when(crudService.persist(returnBooks)).thenReturn(returnReturnBooks);
        Mockito.verify(crudService).persist(returnBooks);


    }

    @Test
    public void testRead() throws Exception {
        ReturnBooks returnBooks = new ReturnBooks.ReturnBooksBuilder("1").bookName("123 Computers").isbnNum("1234567890QWERTY").build();
        ReturnBooks returnReturnBooks = crudService.find(returnBooks.getId());
        when(crudService.find(returnBooks.getId())).thenReturn(returnReturnBooks);
        Mockito.verify(crudService).find(returnBooks.getId());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

        ReturnBooks returnBooks = new ReturnBooks.ReturnBooksBuilder("1").bookName("123 Computers").isbnNum("1234567890QWERTY").build();
        ReturnBooks newR = new ReturnBooks.ReturnBooksBuilder("1").returnBook(returnBooks)
                .bookName("456 Cumputers")
                .build();
        returnBooks = crudService.merge(newR);
        when(crudService.merge(newR)).thenReturn(returnBooks);
        Mockito.verify(crudService).merge(newR);

    }

    @Test
    public void testDelete() throws Exception {

        ReturnBooks returnBooks = new ReturnBooks.ReturnBooksBuilder("1").bookName("123 Computers").isbnNum("1234567890QWERTY").build();
        ReturnBooks returnReturnBooks = crudService.remove(returnBooks);
        when(crudService.remove(returnBooks)).thenReturn(returnReturnBooks);
        Mockito.verify(crudService).remove(returnBooks);

    }
}