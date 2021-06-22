package com.github.gadzooks.multmodule.domain;

import com.github.gadzooks.multmodule.repository.MyJpaEntityRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class MyJpaEntityTest {

    @Autowired
    MyJpaEntityRepository repository;

    @Test
    void getId() {
        MyJpaEntity entity = new MyJpaEntity();
        repository.save(entity);

        assertNotNull(entity.getId());
    }
}