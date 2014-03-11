/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.services.crud.Impl;

import com.alex.tp.libraryassignment.model.Librarian;
import com.alex.tp.libraryassignment.services.crud.LibrarianCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Alex
 */
public class LibrarianCrudServiceImpl implements LibrarianCrudService{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Librarian find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Librarian persist(Librarian entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Librarian merge(Librarian entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Librarian remove(Librarian entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Librarian> findAll() {
        return null;
    }
    
}
