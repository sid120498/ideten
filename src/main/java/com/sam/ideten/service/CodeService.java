package com.sam.ideten.service;

public interface CodeService<T> {
    T create(T code);
    T delete(Long id);
    T update(T code);
    T get(T code);
}
