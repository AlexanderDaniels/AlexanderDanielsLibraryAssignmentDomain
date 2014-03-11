/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.services.crud.Impl;

import com.alex.tp.libraryassignment.model.CalculateFine;
import com.alex.tp.libraryassignment.services.crud.CalculateFineCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Alex
 */
public class CalculateFineCrudServiceImpl implements CalculateFineCrudService{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public CalculateFine find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public CalculateFine persist(CalculateFine entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public CalculateFine merge(CalculateFine entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public CalculateFine remove(CalculateFine entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<CalculateFine> findAll() {
        return null;
    }
    
}
