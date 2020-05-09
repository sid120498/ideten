package com.sam.ideten.repository;

import com.sam.ideten.domain.Code;

public interface CodeRepository<T> {
    T create(T code);
    T get(Long id);
    T update(Long id, T code);
    boolean delete(Long id);

}