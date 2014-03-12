/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import com.alex.tp.libraryassignment.model.Author;
import com.alex.tp.libraryassignment.services.crud.AuthorCrudService;
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
public class AuthorTestCrudService {
    
    @Mock
    AuthorCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(AuthorCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        Author author = new Author.AuthorBuilder("1").authorName("Alex").authorSurname("Titanium").build();
        Author returnAuthor = crudService.persist(author);
        when(crudService.persist(author)).thenReturn(returnAuthor);
        Mockito.verify(crudService).persist(author);


    }

    @Test
    public void testRead() throws Exception {
        Author author = new Author.AuthorBuilder("1").authorName("Alex").authorSurname("Titanium").build();
        Author returnAuthor = crudService.find(author.getId());
        when(crudService.find(author.getId())).thenReturn(returnAuthor);
        Mockito.verify(crudService).find(author.getId());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

        Author author = new Author.AuthorBuilder("1").authorName("Alex").authorSurname("Titanium").build();

        Author returnAuthor = crudService.merge(author);
        when(crudService.merge(author)).thenReturn(returnAuthor);
        Mockito.verify(crudService).merge(author);

    }

    @Test
    public void testDelete() throws Exception {

        Author author = new Author.AuthorBuilder("1").authorName("Alex").authorSurname("Titanium").build();
        Author returnAuthor = crudService.remove(author);
        when(crudService.remove(author)).thenReturn(returnAuthor);
        Mockito.verify(crudService).remove(author);

    }
}