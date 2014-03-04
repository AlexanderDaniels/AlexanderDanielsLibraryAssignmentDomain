/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.app.factory;

import com.alex.tp.libraryassignment.model.Contact;

/**
 *
 * @author Alex
 */
public class ContactFactory {
    public static Contact getContact(String id, String email, String telephone, String cellphone){
        Contact contact = new Contact.ContactBuilder("1")
                .cellphone("0744402606")
                .email("apdaniels92@gmail.com")
                .telephone("0219520501")
                .build();
        
        return null;
        
    }
}
