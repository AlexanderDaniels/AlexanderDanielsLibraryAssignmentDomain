/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.services.Impl;

import com.alex.tp.libraryassignment.model.Contact;
import com.alex.tp.libraryassignment.services.ContactService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alex
 */
public class ContactServiceImpl implements ContactService{

//    public Contact getContact(Contact id) {
//        return id;  
//    }

    private List<Contact> contactList = new ArrayList<Contact>();
    
    public List<Contact> createContact() {
        Contact contact = new Contact.ContactBuilder("1")
                .cellphone("0744402606")
                .email("apdaniels92@gmail.com")
                .telephone("0219520501")
                .build();
        
        contactList.add(contact);
        
        return contactList;
    }    
}
