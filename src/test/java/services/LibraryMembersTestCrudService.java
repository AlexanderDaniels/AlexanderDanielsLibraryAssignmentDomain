/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import com.alex.tp.libraryassignment.model.LibraryMembers;
import com.alex.tp.libraryassignment.services.crud.LibraryMembersCrudService;
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
public class LibraryMembersTestCrudService {
    
    @Mock
    LibraryMembersCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(LibraryMembersCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        LibraryMembers librarianMembers = new LibraryMembers.LibraryMembersBuilder("1").membershipNum("12345678Alex").build();
        LibraryMembers returnLibraryMembers = crudService.persist(librarianMembers);
        when(crudService.persist(librarianMembers)).thenReturn(returnLibraryMembers);
        Mockito.verify(crudService).persist(librarianMembers);


    }

    @Test
    public void testRead() throws Exception {
        LibraryMembers librarianMembers = new LibraryMembers.LibraryMembersBuilder("1").membershipNum("12345678Alex").build();
        LibraryMembers returnLibraryMembers = crudService.find(librarianMembers.getId());
        when(crudService.find(librarianMembers.getId())).thenReturn(returnLibraryMembers);
        Mockito.verify(crudService).find(librarianMembers.getId());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

        LibraryMembers librarianMembers = new LibraryMembers.LibraryMembersBuilder("1").membershipNum("12345678Alex").build();
        LibraryMembers newL = new LibraryMembers.LibraryMembersBuilder("1").librarian(librarianMembers)
                .membershipNum("1234Alex")
                .build();
        librarianMembers = crudService.merge(newL);
        when(crudService.merge(newL)).thenReturn(librarianMembers);
        Mockito.verify(crudService).merge(newL);

    }

    @Test
    public void testDelete() throws Exception {

        LibraryMembers librarianMembers = new LibraryMembers.LibraryMembersBuilder("1").membershipNum("12345678Alex").build();
        LibraryMembers returnLibraryMembers = crudService.remove(librarianMembers);
        when(crudService.remove(librarianMembers)).thenReturn(returnLibraryMembers);
        Mockito.verify(crudService).remove(librarianMembers);

    }
}