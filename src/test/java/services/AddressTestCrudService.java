/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import com.alex.tp.libraryassignment.model.Address;
import com.alex.tp.libraryassignment.services.crud.AddressCrudService;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Alex
 */
public class AddressTestCrudService {
    @Mock
    AddressCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(AddressCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        Address address = new Address.AddressBuilder("1").email("apdaniels92@gmail.com").telephoneNum("021 486 3215").cellphoneNum("061 486 4352").build();
        Address returnAddress = crudService.persist(address);
        when(crudService.persist(address)).thenReturn(returnAddress);
        Mockito.verify(crudService).persist(address);


    }

    @Test
    public void testRead() throws Exception {
        Address address = new Address.AddressBuilder("1").email("apdaniels92@gmail.com").telephoneNum("021 486 3215").cellphoneNum("061 486 4352").build();
        Address returnAddress = crudService.find(address.getId());
        when(crudService.find(address.getId())).thenReturn(returnAddress);
        Mockito.verify(crudService).find(address.getId());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

        Address address = new Address.AddressBuilder("1").email("apdaniels92@gmail.com").telephoneNum("021 486 3215").cellphoneNum("061 486 4352").build();
        Address returnAddress = new Address.AddressBuilder("1").address(address)
                .email("apdaniels@gmail.com")
                .build();
        address = crudService.merge(returnAddress);
        when(crudService.merge(returnAddress)).thenReturn(address);
        Mockito.verify(crudService).merge(returnAddress);
        System.out.println(address);
    }

    @Test
    public void testDelete() throws Exception {

        Address address = new Address.AddressBuilder("1").email("apdaniels92@gmail.com").telephoneNum("021 486 3215").cellphoneNum("061 486 4352").build();
        Address returnAddress = crudService.remove(address);
        when(crudService.remove(address)).thenReturn(returnAddress);
        Mockito.verify(crudService).remove(address);

    }
}
