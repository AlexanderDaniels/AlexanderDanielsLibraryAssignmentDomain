/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import com.alex.tp.libraryassignment.model.Contact;
import com.alex.tp.libraryassignment.services.ContactCrudservice;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.mockito.Mockito.when;
/**
 *
 * @author Alex
 */
public class ContactTestCrudService {
    
    @Mock
    ContactCrudservice crudService;
    
    @BeforeClass
    public void setUpClass() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(ContactCrudservice.class);
    }
    
    @Test
    public void testCreate() throws Exception {
        Contact contact = new Contact.ContactBuilder("1").email("apdaniels92@gmail.com").cellphone("0744402606").telephone("0219520501").build();
        Contact returnContact = crudService.persist(contact);
        when(crudService.persist(contact)).thenReturn(returnContact);
        Mockito.verify(crudService).persist(contact);
    }

//    @Test
//    public void testRead() throws Exception {
//        Question q1 = new Question.Builder("What is Java").id("1").build();
//        Question returnQuestion = crudService.find(q1.getId());
//        when(crudService.find(q1.getId())).thenReturn(returnQuestion);
//        Mockito.verify(crudService).find(q1.getId());
//
//    }
//
//    @Test
//    public void testUpdate() throws Exception {
//        // THIS IS THE WRONG WAY TO DO THIS
//        // PLEASE FIX FIX FIX
//        // LEFT OUT FOR YOU TO FIGURE IT OUT
//
//        Question q1 = new Question.Builder("What is Java").id("1").build();
//
//        Question returnQuestion = crudService.merge(q1);
//        when(crudService.merge(q1)).thenReturn(returnQuestion);
//        Mockito.verify(crudService).merge(q1);
//
//    }
//
//    @Test
//    public void testDelete() throws Exception {
//
//        Question q1 = new Question.Builder("What is Java").id("1").build();
//        Question returnQuestion = crudService.remove(q1);
//        when(crudService.remove(q1)).thenReturn(returnQuestion);
//        Mockito.verify(crudService).remove(q1);
//
//    }
//
//    @AfterClass
//    public void tearDownClass() throws Exception {
//    }
//
//    @BeforeMethod
//    public void setUpMethod() throws Exception {
//    }
//
//    @AfterMethod
//    public void tearDownMethod() throws Exception {
//    }
}