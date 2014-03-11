/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.services.crud.Impl;

import com.alex.tp.libraryassignment.model.ReturnBooks;
import com.alex.tp.libraryassignment.services.crud.ReturnBooksCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Alex
 */
public class ReturnBooksCrudServiceImpl implements ReturnBooksCrudService{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public ReturnBooks find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public ReturnBooks persist(ReturnBooks entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public ReturnBooks merge(ReturnBooks entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public ReturnBooks remove(ReturnBooks entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<ReturnBooks> findAll() {
        return null;
    }
    
}
