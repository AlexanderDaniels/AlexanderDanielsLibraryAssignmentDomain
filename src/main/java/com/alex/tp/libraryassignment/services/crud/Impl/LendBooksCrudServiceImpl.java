/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.services.crud.Impl;

import com.alex.tp.libraryassignment.model.LendBooks;
import com.alex.tp.libraryassignment.services.crud.LendBooksCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Alex
 */
public class LendBooksCrudServiceImpl implements LendBooksCrudService{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public LendBooks find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public LendBooks persist(LendBooks entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public LendBooks merge(LendBooks entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public LendBooks remove(LendBooks entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<LendBooks> findAll() {
        return null;
    }
    
}
