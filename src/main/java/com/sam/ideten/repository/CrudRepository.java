package com.sam.ideten.repository;

public interface CrudRepository<T> {
    T create(T code);
    T get(String id);
    void update(String id, T code);
    void delete(String id);

}