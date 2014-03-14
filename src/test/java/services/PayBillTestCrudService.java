/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import com.alex.tp.libraryassignment.model.PayBill;
import com.alex.tp.libraryassignment.services.crud.PayBillCrudService;
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
public class PayBillTestCrudService {
    
    @Mock
    PayBillCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(PayBillCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        PayBill payBill = new PayBill.PayBillBuilder("1").billNo("123abc").amount(200.00).build();
        PayBill returnPayBill = crudService.persist(payBill);
        when(crudService.persist(payBill)).thenReturn(returnPayBill);
        Mockito.verify(crudService).persist(payBill);


    }

    @Test
    public void testRead() throws Exception {
        PayBill payBill = new PayBill.PayBillBuilder("1").billNo("123abc").amount(200.00).build();
        PayBill returnPayBill = crudService.find(payBill.getId());
        when(crudService.find(payBill.getId())).thenReturn(returnPayBill);
        Mockito.verify(crudService).find(payBill.getId());
        

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

        PayBill payBill = new PayBill.PayBillBuilder("1").billNo("123abc").amount(200.00).build();
        PayBill newP = new PayBill.PayBillBuilder("1").payBill(payBill)
                .billNo("123qwerty")
                .build();
        payBill = crudService.merge(newP);
        when(crudService.merge(newP)).thenReturn(payBill);
        Mockito.verify(crudService).merge(newP);

    }

    @Test
    public void testDelete() throws Exception {

        PayBill payBill = new PayBill.PayBillBuilder("1").billNo("123abc").amount(200.00).build();
        PayBill returnPayBill = crudService.remove(payBill);
        when(crudService.remove(payBill)).thenReturn(returnPayBill);
        Mockito.verify(crudService).remove(payBill);

    }
}