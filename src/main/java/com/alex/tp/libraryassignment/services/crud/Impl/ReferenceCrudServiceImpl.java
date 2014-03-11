/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.services.crud.Impl;

import com.alex.tp.libraryassignment.model.ReferenceBooks;
import com.alex.tp.libraryassignment.services.crud.ReferenceCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Alex
 */
public class ReferenceCrudServiceImpl implements ReferenceCrudService{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public ReferenceBooks find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public ReferenceBooks persist(ReferenceBooks entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public ReferenceBooks merge(ReferenceBooks entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public ReferenceBooks remove(ReferenceBooks entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<ReferenceBooks> findAll() {
        return null;
    }
    
}
