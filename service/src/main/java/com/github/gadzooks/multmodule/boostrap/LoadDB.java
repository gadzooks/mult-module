package com.github.gadzooks.multmodule.boostrap;

import com.github.gadzooks.multmodule.domain.MyJpaEntity;
import com.github.gadzooks.multmodule.service.CrudService;
import com.github.gadzooks.multmodule.service.CrudServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class LoadDB implements CommandLineRunner {
    private final CrudServiceImpl crudService;

    public LoadDB(CrudServiceImpl crudService) {
        this.crudService = crudService;
    }

    @Override
    public void run(String... args) throws Exception {
        MyJpaEntity e1 = new MyJpaEntity();
        e1.setDescription("e1");
        crudService.save(e1);

        MyJpaEntity e2 = new MyJpaEntity();
        e2.setDescription("e2");
        crudService.save(e2);

        MyJpaEntity e3 = new MyJpaEntity();
        e3.setDescription("e3");
        crudService.save(e3);

        log.info("saved records : " + crudService.findAll().size());
    }
}
