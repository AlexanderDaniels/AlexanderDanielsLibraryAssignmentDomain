package com.alex.tp.libraryassignment.services;

import java.util.List;

public interface CrudService<S, ID> {

    public S find(ID id);

    public S persist(S entity);

    public S merge(S entity);

    public S remove(S entity);

    public List<S> findAll();
}
