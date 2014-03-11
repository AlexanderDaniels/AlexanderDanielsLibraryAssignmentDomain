/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.libraryassignment.services.crud.Impl;

import com.alex.tp.libraryassignment.model.Book;
import com.alex.tp.libraryassignment.services.crud.BookCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Alex
 */
public class BookCrudServiceImpl implements BookCrudService{

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Book find(String id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Book persist(Book entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Book merge(Book entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Book remove(Book entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Book> findAll() {
        return null;
    }
    
}
