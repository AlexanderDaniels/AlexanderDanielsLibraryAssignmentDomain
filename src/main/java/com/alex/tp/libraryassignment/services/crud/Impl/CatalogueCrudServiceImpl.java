/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.services.crud.Impl;

import com.alex.tp.libraryassignment.model.Catalogue;
import com.alex.tp.libraryassignment.services.crud.CatalogueCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Alex
 */
public class CatalogueCrudServiceImpl implements CatalogueCrudService{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Catalogue find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Catalogue persist(Catalogue entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Catalogue merge(Catalogue entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Catalogue remove(Catalogue entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Catalogue> findAll() {
        return null;
    }
    
}
