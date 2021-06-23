package com.github.gadzooks.multmodule.service;

import com.github.gadzooks.multmodule.domain.MyJpaEntity;
import com.github.gadzooks.multmodule.repository.MyJpaEntityRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CrudServiceImpl implements CrudService<MyJpaEntity, Long> {
    private final MyJpaEntityRepository repository;

    public CrudServiceImpl(MyJpaEntityRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<MyJpaEntity> findAll() {
        List<MyJpaEntity> entities = new ArrayList<>();
        repository.findAll().forEach(entities::add);
        return entities;
    }

    @Override
    public MyJpaEntity save(MyJpaEntity model) {
        return repository.save(model);
    }

    @Override
    public MyJpaEntity getById(Long aLong) {
        return repository.findById(aLong).orElseThrow();
    }

    @Override
    public MyJpaEntity patch(Long aLong, MyJpaEntity updatedRegion) {
        MyJpaEntity entity = getById(aLong);
        entity.setDescription(updatedRegion.getDescription());
        return repository.save(entity);
    }

    @Override
    public void delete(Long aLong) {
        MyJpaEntity entity = getById(aLong);
        repository.delete(entity);
    }
}
