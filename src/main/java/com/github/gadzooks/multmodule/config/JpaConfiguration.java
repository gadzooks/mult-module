package com.github.gadzooks.multmodule.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = {"com.github.gadzooks.multmodule.repository"})
public class JpaConfiguration {
}
