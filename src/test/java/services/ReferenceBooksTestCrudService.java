/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import com.alex.tp.libraryassignment.model.ReferenceBooks;
import com.alex.tp.libraryassignment.services.crud.ReferenceCrudService;
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
public class ReferenceBooksTestCrudService {
    
    @Mock
    ReferenceCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(ReferenceCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        ReferenceBooks referenceBooks = new ReferenceBooks.ReferenceBooksBuilder("1").bookName("Harry Potter").refBookype("Encyclopedia").build();
        ReferenceBooks returnReferenceBooks = crudService.persist(referenceBooks);
        when(crudService.persist(referenceBooks)).thenReturn(returnReferenceBooks);
        Mockito.verify(crudService).persist(referenceBooks);


    }

    @Test
    public void testRead() throws Exception {
        ReferenceBooks referenceBooks = new ReferenceBooks.ReferenceBooksBuilder("1").bookName("Harry Potter").refBookype("Encyclopedia").build();
        ReferenceBooks returnReferenceBooks = crudService.find(referenceBooks.getId());
        when(crudService.find(referenceBooks.getId())).thenReturn(returnReferenceBooks);
        Mockito.verify(crudService).find(referenceBooks.getId());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

        ReferenceBooks referenceBooks = new ReferenceBooks.ReferenceBooksBuilder("1").bookName("Harry Potter").refBookype("Encyclopedia").build();
        ReferenceBooks newR = new ReferenceBooks.ReferenceBooksBuilder("1").referenceBooks(referenceBooks)
                .bookName("The Avengers")
                .build();
        referenceBooks = crudService.merge(newR);
        when(crudService.merge(newR)).thenReturn(referenceBooks);
        Mockito.verify(crudService).merge(newR);

    }

    @Test
    public void testDelete() throws Exception {

        ReferenceBooks referenceBooks = new ReferenceBooks.ReferenceBooksBuilder("1").bookName("Harry Potter").refBookype("Encyclopedia").build();
        ReferenceBooks returnReferenceBooks = crudService.remove(referenceBooks);
        when(crudService.remove(referenceBooks)).thenReturn(returnReferenceBooks);
        Mockito.verify(crudService).remove(referenceBooks);

    }
}