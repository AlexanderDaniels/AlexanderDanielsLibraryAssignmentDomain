/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.services.crud.Impl;

import com.alex.tp.libraryassignment.model.PayBill;
import com.alex.tp.libraryassignment.services.crud.PayBillCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Alex
 */
public class PayBillCrudServiceImpl implements PayBillCrudService{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public PayBill find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public PayBill persist(PayBill entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public PayBill merge(PayBill entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public PayBill remove(PayBill entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<PayBill> findAll() {
        return null;
    }
    
}
