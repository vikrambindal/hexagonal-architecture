package com.vikram.persistence.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan("com.vikram.persistence")
@EnableJpaRepositories("com.vikram.persistence")
public class JpaConfig {
}
