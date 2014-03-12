/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import com.alex.tp.libraryassignment.model.Inventory;
import com.alex.tp.libraryassignment.services.crud.InventoryCrudService;
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
public class InventoryTestCrudService {
    
    @Mock
    InventoryCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(InventoryCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        Inventory inventory = new Inventory.InventoryBuilder("1").bookName("Harry Potter").numBook(10).build();
        Inventory returnInventory = crudService.persist(inventory);
        when(crudService.persist(inventory)).thenReturn(returnInventory);
        Mockito.verify(crudService).persist(inventory);


    }

    @Test
    public void testRead() throws Exception {
        Inventory inventory = new Inventory.InventoryBuilder("1").bookName("Harry Potter").numBook(10).build();
        Inventory returnInventory = crudService.find(inventory.getId());
        when(crudService.find(inventory.getId())).thenReturn(returnInventory);
        Mockito.verify(crudService).find(inventory.getId());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

        Inventory inventory = new Inventory.InventoryBuilder("1").bookName("Harry Potter").numBook(10).build();

        Inventory returnInventory = crudService.merge(inventory);
        when(crudService.merge(inventory)).thenReturn(returnInventory);
        Mockito.verify(crudService).merge(inventory);

    }

    @Test
    public void testDelete() throws Exception {

        Inventory inventory = new Inventory.InventoryBuilder("1").bookName("Harry Potter").numBook(10).build();
        Inventory returnInventory = crudService.remove(inventory);
        when(crudService.remove(inventory)).thenReturn(returnInventory);
        Mockito.verify(crudService).remove(inventory);

    }
}