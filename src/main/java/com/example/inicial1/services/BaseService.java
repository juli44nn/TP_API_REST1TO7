package com.example.inicial1.services;

import java.util.List;

public interface BaseService<E> {

    public List<E> finAll() throws Exception;
    public E findById(long id) throws Exception;
    public E save(E entity) throws Exception;
    public E update(Long id,E entity) throws Exception;
    public boolean delete(Long id) throws Exception;



}
