package com.github.gadzooks.multmodule.service;

import com.github.gadzooks.multmodule.domain.MyJpaEntity;
import com.github.gadzooks.multmodule.repository.MyJpaEntityRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CrudServiceImplTest {

    @Mock
    private MyJpaEntityRepository repository;

    @InjectMocks
    private CrudServiceImpl service;

    @Test
    void save() {
        //Given
        MyJpaEntity entity = MyJpaEntity.builder().description("testing testing").build();

        //when
        when(repository.save(entity)).thenReturn(entity);
        MyJpaEntity savedEntity = repository.save(entity);

        assertEquals(entity, savedEntity);
        verify(repository).save(entity);
    }
}