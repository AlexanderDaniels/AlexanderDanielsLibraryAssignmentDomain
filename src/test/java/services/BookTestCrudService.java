/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import com.alex.tp.libraryassignment.model.Book;
import com.alex.tp.libraryassignment.services.crud.BookCrudService;
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
public class BookTestCrudService {
    
    @Mock
    BookCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(BookCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        Book book = new Book.BookBuilder("1").bookName("Harry Potter").isbnNum("80854hnfdfnuwer2342334").build();
        Book returnBook = crudService.persist(book);
        when(crudService.persist(book)).thenReturn(returnBook);
        Mockito.verify(crudService).persist(book);


    }

    @Test
    public void testRead() throws Exception {
        Book book = new Book.BookBuilder("1").bookName("Harry Potter").isbnNum("80854hnfdfnuwer2342334").build();
        Book returnBook = crudService.find(book.getId());
        when(crudService.find(book.getId())).thenReturn(returnBook);
        Mockito.verify(crudService).find(book.getId());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

        Book book = new Book.BookBuilder("1").bookName("Harry Potter").isbnNum("80854hnfdfnuwer2342334").build();
        Book newb = new Book.BookBuilder("1").book(book)
                .bookName("Amazing Alex")
                .build();
        book = crudService.merge(newb);
        when(crudService.merge(newb)).thenReturn(book);
        Mockito.verify(crudService).merge(newb);
    }

    @Test
    public void testDelete() throws Exception {

        Book book = new Book.BookBuilder("1").bookName("Harry Potter").isbnNum("80854hnfdfnuwer2342334").build();
        Book returnBook = crudService.remove(book);
        when(crudService.remove(book)).thenReturn(returnBook);
        Mockito.verify(crudService).remove(book);

    }
}