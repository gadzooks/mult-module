package com.github.gadzooks.multmodule.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor //required for JPA
public class MyJpaEntity {
    @Id
    @GeneratedValue
    private Long id;

    private String description;

    @Builder
    public MyJpaEntity(String description) {
        this.description = description;
    }
}
