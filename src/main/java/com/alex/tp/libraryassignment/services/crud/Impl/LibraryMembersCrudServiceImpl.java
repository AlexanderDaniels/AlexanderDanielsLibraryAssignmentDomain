/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.services.crud.Impl;

import com.alex.tp.libraryassignment.model.LibraryMembers;
import com.alex.tp.libraryassignment.services.crud.LibraryMembersCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Alex
 */
public class LibraryMembersCrudServiceImpl implements LibraryMembersCrudService{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public LibraryMembers find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public LibraryMembers persist(LibraryMembers entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public LibraryMembers merge(LibraryMembers entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public LibraryMembers remove(LibraryMembers entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<LibraryMembers> findAll() {
        return null;
    }
    
}
