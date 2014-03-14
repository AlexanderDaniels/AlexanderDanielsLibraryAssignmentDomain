/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import com.alex.tp.libraryassignment.model.Journals;
import com.alex.tp.libraryassignment.services.crud.JournalsCrudService;
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
public class JournalsTestCrudService {
    
    @Mock
    JournalsCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(JournalsCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        Journals journals = new Journals.JournalsBuilder("1").journalName("How stuff works").numOfPages(52).build();
        Journals returnJournals = crudService.persist(journals);
        when(crudService.persist(journals)).thenReturn(returnJournals);
        Mockito.verify(crudService).persist(journals);


    }

    @Test
    public void testRead() throws Exception {
        Journals journals = new Journals.JournalsBuilder("1").journalName("How stuff works").numOfPages(52).build();
        Journals returnJournals = crudService.find(journals.getId());
        when(crudService.find(journals.getId())).thenReturn(returnJournals);
        Mockito.verify(crudService).find(journals.getId());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

        Journals journals = new Journals.JournalsBuilder("1").journalName("How stuff works").numOfPages(52).build();
        Journals newJ = new Journals.JournalsBuilder("1").journals(journals)
                .journalName("How stuff REALY works")
                .build();
        journals = crudService.merge(newJ);
        when(crudService.merge(newJ)).thenReturn(journals);
        Mockito.verify(crudService).merge(newJ);

    }

    @Test
    public void testDelete() throws Exception {

        Journals journals = new Journals.JournalsBuilder("1").journalName("How stuff works").numOfPages(52).build();
        Journals returnJournals = crudService.remove(journals);
        when(crudService.remove(journals)).thenReturn(returnJournals);
        Mockito.verify(crudService).remove(journals);

    }
}