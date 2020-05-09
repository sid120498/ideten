package com.sam.ideten.repository;

import com.sam.ideten.domain.Code;

public interface CrudRepository<T> {
    T create(T code);
    T get(String id);
    T update(String id, T code);
    boolean delete(String id);

}