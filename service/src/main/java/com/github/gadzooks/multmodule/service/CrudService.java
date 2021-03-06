package com.github.gadzooks.multmodule.service;

import java.util.List;

public interface CrudService<T, ID> {
    List<T> findAll();
    T save(T model);
    T getById(ID id);
    T patch(ID id, T updatedRegion);
    void delete(ID id);
}
