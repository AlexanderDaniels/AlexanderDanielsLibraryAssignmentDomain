/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import com.alex.tp.libraryassignment.model.Contact;
import com.alex.tp.libraryassignment.services.crud.ContactCrudservice;
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

    @Test
    public void testRead() throws Exception {
        Contact contact = new Contact.ContactBuilder("1").email("apdaniels92@gmail.com").cellphone("0744402606").telephone("0219520501").build();
        Contact returnContact = crudService.find(contact.getId());
        when(crudService.find(contact.getId())).thenReturn(returnContact);
        Mockito.verify(crudService).find(contact.getId());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

        Contact contact = new Contact.ContactBuilder("1").email("apdaniels92@gmail.com").cellphone("0744402606").telephone("0219520501").build();
        Contact newContact = new Contact.ContactBuilder("1").contact(contact).cellphone("0846528391").build();
        newContact = crudService.merge(contact);
        when(crudService.merge(contact)).thenReturn(newContact);
        Mockito.verify(crudService).merge(contact);
        System.out.println(newContact.getCellphone());
    }

    @Test
    public void testDelete() throws Exception {

        Contact contact = new Contact.ContactBuilder("1").email("apdaniels92@gmail.com").cellphone("0744402606").telephone("0219520501").build();
        Contact returnContact = crudService.remove(contact);
        when(crudService.remove(contact)).thenReturn(returnContact);
        Mockito.verify(crudService).remove(contact);

    }
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