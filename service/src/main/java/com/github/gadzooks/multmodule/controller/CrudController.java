package com.github.gadzooks.multmodule.controller;

import com.github.gadzooks.multmodule.domain.MyJpaEntity;
import com.github.gadzooks.multmodule.service.CrudService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CrudController {

    private final CrudService crudService;

    public CrudController(CrudService crudService) {
        this.crudService = crudService;
    }

    @GetMapping(value = "/all")
    public List<MyJpaEntity> findAll() {
        return crudService.findAll();
    }

}
