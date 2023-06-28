package com.vikram.application.config;

import com.vikram.service.impl.ProductService;
import com.vikram.service.port.out.LoadProductPort;
import com.vikram.service.port.out.ProductStatePort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public ProductService productService(ProductStatePort productStatePort, LoadProductPort loadProductPort) {
        return new ProductService(productStatePort, loadProductPort);
    }
}
