/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import com.alex.tp.libraryassignment.model.Publisher;
import com.alex.tp.libraryassignment.services.crud.PublisherCrudService;
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
public class PublisherTestCrudService {
    
    @Mock
    PublisherCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(PublisherCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        Publisher publisher = new Publisher.PublisherBuilder("1").publisherName("HottenTot").publisherAddress("12 Church Street").build();
        Publisher returnPublisher = crudService.persist(publisher);
        when(crudService.persist(publisher)).thenReturn(returnPublisher);
        Mockito.verify(crudService).persist(publisher);


    }

    @Test
    public void testRead() throws Exception {
        Publisher publisher = new Publisher.PublisherBuilder("1").publisherName("HottenTot").publisherAddress("12 Church Street").build();
        Publisher returnPublisher = crudService.find(publisher.getId());
        when(crudService.find(publisher.getId())).thenReturn(returnPublisher);
        Mockito.verify(crudService).find(publisher.getId());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

        Publisher publisher = new Publisher.PublisherBuilder("1").publisherName("HottenTot").publisherAddress("12 Church Street").build();
        Publisher newP = new Publisher.PublisherBuilder("1").publisher(publisher)
                .publisherName("HottenTots")
                .build();
        publisher = crudService.merge(newP);
        when(crudService.merge(newP)).thenReturn(publisher);
        Mockito.verify(crudService).merge(newP);

    }

    @Test
    public void testDelete() throws Exception {

        Publisher publisher = new Publisher.PublisherBuilder("1").publisherName("HottenTot").publisherAddress("12 Church Street").build();
        Publisher returnPublisher = crudService.remove(publisher);
        when(crudService.remove(publisher)).thenReturn(returnPublisher);
        Mockito.verify(crudService).remove(publisher);

    }
}