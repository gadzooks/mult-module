package com.github.gadzooks.multmodule.repository;

import com.github.gadzooks.multmodule.domain.MyJpaEntity;
import org.springframework.data.repository.CrudRepository;

public interface MyJpaEntityRepository extends CrudRepository<MyJpaEntity, Long> {
}
