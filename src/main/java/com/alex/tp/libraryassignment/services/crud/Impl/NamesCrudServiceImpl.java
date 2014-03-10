/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.services.crud.Impl;

import com.alex.tp.libraryassignment.model.Names;
import com.alex.tp.libraryassignment.services.crud.NamesCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Alex
 */
public class NamesCrudServiceImpl implements NamesCrudService{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Names find(String id) {
         return null;
    }
    
    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Names persist(Names entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Names merge(Names entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Names remove(Names entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Names> findAll() {
        return null;
    }    
}
