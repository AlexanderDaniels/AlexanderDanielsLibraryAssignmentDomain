/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.services.crud.Impl;

import com.alex.tp.libraryassignment.model.VisualMaterial;
import com.alex.tp.libraryassignment.services.crud.VisualMaterialCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Alex
 */
public class VisualMaterialCrudServiceImpl implements VisualMaterialCrudService{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public VisualMaterial find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public VisualMaterial persist(VisualMaterial entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public VisualMaterial merge(VisualMaterial entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public VisualMaterial remove(VisualMaterial entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<VisualMaterial> findAll() {
        return null;
    }
    
}
