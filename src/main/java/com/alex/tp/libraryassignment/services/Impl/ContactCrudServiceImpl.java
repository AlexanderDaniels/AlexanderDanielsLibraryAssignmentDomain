/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.services.Impl;
import com.alex.tp.libraryassignment.model.Contact;
import com.alex.tp.libraryassignment.services.ContactCrudservice;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Alex
 */
public class ContactCrudServiceImpl implements ContactCrudservice{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Contact find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Contact persist(Contact entity) {
       return null; 
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Contact merge(Contact entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Contact remove(Contact entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Contact> findAll() {
        return null;
    }
}
