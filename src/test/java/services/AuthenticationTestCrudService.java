/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import com.alex.tp.libraryassignment.model.Authentication;
import com.alex.tp.libraryassignment.services.crud.AuthenticationCrudService;
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
public class AuthenticationTestCrudService {
    @Mock
    AuthenticationCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(AuthenticationCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        Authentication auth = new Authentication.AuthenticationBuilder("1").username("Alex").password("qwerty").build();
        Authentication returnAuthentication = crudService.persist(auth);
        when(crudService.persist(auth)).thenReturn(returnAuthentication);
        Mockito.verify(crudService).persist(auth);


    }

    @Test
    public void testRead() throws Exception {
        Authentication auth = new Authentication.AuthenticationBuilder("1").username("Alex").password("qwerty").build();
        Authentication returnAuthentication = crudService.find(auth.getId());
        when(crudService.find(auth.getId())).thenReturn(returnAuthentication);
        Mockito.verify(crudService).find(auth.getId());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

        Authentication auth = new Authentication.AuthenticationBuilder("1").username("Alex").password("qwerty").build();

        Authentication returnAuthentication = crudService.merge(auth);
        when(crudService.merge(auth)).thenReturn(returnAuthentication);
        Mockito.verify(crudService).merge(auth);

    }

    @Test
    public void testDelete() throws Exception {

        Authentication auth = new Authentication.AuthenticationBuilder("1").username("Alex").password("qwerty").build();
        Authentication returnAuthentication = crudService.remove(auth);
        when(crudService.remove(auth)).thenReturn(returnAuthentication);
        Mockito.verify(crudService).remove(auth);

    }
}