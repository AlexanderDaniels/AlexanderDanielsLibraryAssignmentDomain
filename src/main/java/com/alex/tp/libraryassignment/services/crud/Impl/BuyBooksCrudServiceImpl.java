/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.services.crud.Impl;

import com.alex.tp.libraryassignment.model.BuyBooks;
import com.alex.tp.libraryassignment.services.crud.BuyBooksCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Alex
 */
public class BuyBooksCrudServiceImpl implements BuyBooksCrudService{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public BuyBooks find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public BuyBooks persist(BuyBooks entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public BuyBooks merge(BuyBooks entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public BuyBooks remove(BuyBooks entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<BuyBooks> findAll() {
        return null;
    }
    
}
